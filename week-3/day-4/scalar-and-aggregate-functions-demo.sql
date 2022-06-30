DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
	id SERIAL PRIMARY KEY,
	salary INTEGER NOT NULL CHECK(salary > 0),
	first_name VARCHAR(100) NOT NULL,
	last_name VARCHAR(100) NOT NULL,
	department VARCHAR(50) NOT NULL
);

INSERT INTO employees (salary, first_name, last_name, department)
VALUES 
(50000, 'Connie', 'Elliott', 'HR'),
(70000, 'John', 'Doe', 'HR'),
(75000, 'Jane', 'Doe', 'HR'),
(200000, 'Bob', 'Smith', 'C-Suite'),
(300000, 'Ashwin', 'Bharath', 'C-Suite'),
(120000, 'Michael', 'Minton', 'IT'),
(140000, 'Bach', 'Tran', 'IT'),
(110000, 'Sally', 'Kyle', 'IT');

SELECT *
FROM employees

-- Aggregate function examples: MIN, MAX, AVG
SELECT MIN(salary)
FROM employees;

SELECT MAX(salary)
FROM employees;

SELECT AVG(salary)
FROM employees;

SELECT SUM(salary)
FROM employees;

SELECT COUNT(*)
FROM employees;

-- Get the average salary of each department
SELECT department, AVG(salary)
FROM employees
GROUP BY department
ORDER BY AVG(salary) DESC;

-- Get the minimum salary of each department
SELECT department, MIN(salary)
FROM employees 
GROUP BY department;

-- Get the maximum salary of each department
SELECT department, MAX(salary)
FROM employees 
GROUP BY department;


-- Scalar function examples
SELECT first_name, LENGTH(first_name) as first_name_length, salary, department, last_name
FROM employees
ORDER BY LENGTH(first_name);

SELECT first_name, last_name, salary, CONCAT(first_name, ' ', last_name) as full_name
FROM employees;

SELECT ABS(salary)
FROM employees;



SELECT *
FROM employees 
ORDER BY LENGTH(CONCAT(first_name, ' ', last_name));




