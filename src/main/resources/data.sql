INSERT INTO lecture (lecture_id, topic, path_number, lecture_number, date_time, capacity) VALUES
(1, 'Distributed build at scale', 1, 1, '2025-01-10 10:00:00.000', 5),
(2, 'Cloud-Based application development', 1, 2, '2025-01-10 12:00:00.000', 5),
(3, 'Data design and curation in era of cloud computing', 1, 3, '2025-01-10 14:00:00.000', 5),
(4, 'The future of Artificial Intelligence', 2, 1, '2025-01-10 10:00:00.000', 5),
(5, 'AI Risks', 2, 2, '2025-01-10 12:00:00.000', 5),
(6, 'Will AI take out jobs?', 2, 3, '2025-01-10 14:00:00.000', 5),
(7, 'Evolution of Digital Identity', 3, 1, '2025-01-10 10:00:00.000', 5),
(8, 'Semiconductors - Why so important?', 3, 2, '2025-01-10 12:00:00.000', 5),
(9, 'Role of technology in remote workspace', 3, 3, '2025-01-10 14:00:00.000', 5);

INSERT INTO user_data (user_id, login, email) VALUES
(1, 'adam123', 'adamhackerman@email.com'),
(2, 'agnieszka_programistka', 'agnieszka.programistka@email.com'),
(3, '98kamil', 'kamil_98@email.com'),
(4, 'patrycja653', 'patrycja653@email.com'),
(5, 'ada_sklada', 'ada997@email.com'),
(6, 'aneta_325', 'aneta@email.com');

INSERT INTO lecture_reservation (user_id, lecture_id) VALUES
(1, 1),
(3, 5),
(1, 8),
(2, 8),
(3, 8),
(4, 8),
(5, 8);