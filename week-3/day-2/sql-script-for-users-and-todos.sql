DROP TABLE IF EXISTS todos;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
	id SERIAL PRIMARY KEY,
	username VARCHAR(50) UNIQUE NOT NULL,
	mobile_phone VARCHAR(12) NOT NULL CHECK(mobile_phone SIMILAR TO '[0-9]{3}-[0-9]{3}-[0-9]{4}'),
	active_user BOOLEAN DEFAULT true
);


CREATE TABLE todos (
	id SERIAL PRIMARY KEY,
	description VARCHAR(200) NOT NULL,
	completed BOOLEAN NOT NULL DEFAULT false,
	user_id INTEGER,
	CONSTRAINT fk_users FOREIGN KEY (user_id) REFERENCES users(id)
);

INSERT INTO users (username, mobile_phone)
VALUES 
('bachy21', '512-826-0001'),
('jane_doe', '512-826-0002');

INSERT INTO users (username, mobile_phone, active_user)
VALUES 
('bob123', '512-826-0003', false);


INSERT INTO todos (description, user_id)
VALUES 
('Do laundry', 1),
('Create copy of house key', 1),
('Cook lunch', 2),
('Send email to Fred', 2),
('Pick up package', 2);

INSERT INTO todos (description) 
VALUES
('Go to yoga class');