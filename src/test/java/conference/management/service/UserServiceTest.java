package conference.management.service;

import conference.management.mapper.LectureMapper;
import conference.management.mapper.UserMapper;
import conference.management.model.LectureRequest;
import conference.management.model.User;
import conference.management.repository.LectureRepository;
import conference.management.repository.UserRepository;
import conference.management.repository.entity.LectureEntity;
import conference.management.repository.entity.UserEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private LectureRepository lectureRepository;

    @Mock
    private UserMapper userMapper;

    @Mock
    private LectureMapper lectureMapper;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testUpdateUser() {
        String email = "old@example.com";
        String newEmail = "new@example.com";
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(email);

        when(userRepository.findByEmail(email)).thenReturn(Optional.of(userEntity));
        when(userRepository.save(userEntity)).thenReturn(userEntity);
        when(userMapper.toUser(userEntity)).thenReturn(new User("login", newEmail));

        User updatedUser = userService.updateUser(email, newEmail);

        assertNotNull(updatedUser);
        assertEquals(newEmail, updatedUser.email());
        verify(userRepository).save(userEntity);
    }

    @Test
    void testRegisterForLecture() {
        String login = "userLogin";
        LectureRequest lectureRequest = new LectureRequest(1, 1);
        UserEntity userEntity = new UserEntity();
        LectureEntity lectureEntity = new LectureEntity();

        when(userRepository.findByLogin(login)).thenReturn(Optional.of(userEntity));
        when(lectureRepository.findByPathNumberAndLectureNumber(1, 1)).thenReturn(Optional.of(lectureEntity));

        userService.registerForLecture(login, lectureRequest);

        assertTrue(userEntity.getLectures().contains(lectureEntity));
        verify(userRepository).save(userEntity);
    }
}