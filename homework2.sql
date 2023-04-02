CREATE TABLE questions 
( 
	question_id INTEGER PRIMARY KEY,
	question_text VARCHAR(100) NOT NULL, 
	rightAnswer INTEGER REFERENCES answers(answer_id)
);

INSERT INTO questions (question_id, question_text, rightAnswer)
VALUES 
('1','Сколько существует примитивных типов в языке Java?', '4'),
('2','Как называется состояние репозитория в Git на какой-то момент времени?', '7'),
('3','Как называется модификатор для создания константы', '12');

SELECT * FROM questions;

CREATE TABLE answers 
( 
	answer_id SERIAL PRIMARY KEY,
	answer_text VARCHAR(100) NOT NULL UNIQUE
);

INSERT INTO answers (answer_text)
VALUES 
('Один'),
('Два'),
('Три'),
('Четыре'),
('Пять'),
('Pull-up'),
('Commit'),
('Branch'),
('Pull Request'),
('static'),
('void'),
('final'),
('public');

SELECT * FROM answers;

CREATE TABLE question_to_answer (
	question_id INTEGER REFERENCES questions(question_id),
	answer_id INTEGER REFERENCES answers(answer_id)
)

INSERT INTO question_to_answer (question_id, answer_id) 
VALUES 
('1', '1'),
('1', '2'),
('1', '3'),
('1','4'),
('1','5'),
('2','6'),
('2','7'),
('2','8'),
('2','9'),
('3','10'),
('3','11'),
('3','12'),
('3','13');

SELECT * FROM question_to_answer;

