CREATE TABLE questions 
( 
	question_id INTEGER PRIMARY KEY,
	question_text CHAR(50) NOT NULL
);

INSERT INTO questions (question_id, question_text)
VALUES 
('1','Сколько существует примитивных типов в языке Java?'),
('2','Как называется состояние репозитория в Git на какой-то момент времени?'),
('3','Как называется модификатор для создания константы');

SELECT * FROM questions;

CREATE TABLE answers 
( 
	answer_id SERIAL PRIMARY KEY,
	answer_text CHAR(50) NOT NULL,
	question_id INTEGER REFERENCES questions(question_id)
);

INSERT INTO answers (answer_text, question_id)
VALUES 
('Один', '1'),
('Два', '1'),
('Три', '1'),
('Четыре', '1'),
('Pull-up', '2'),
('Commit', '2'),
('Branch', '2'),
('Pull Request', '2'),
('static', '3'),
('void', '3'),
('final', '3'),
('public', '3');

SELECT * FROM answers;

SELECT q.question_text, a.answer_text AS answer_name
FROM questions AS q
JOIN answers a ON a.question_id=q.question_id;

