--таблица
CREATE TABLE employees(
                          id integer PRIMARY KEY,
                          surname VARCHAR,
                          experience integer
);
--запрос
SELECT surname
FROM employees
ORDER BY experience DESC
OFFSET 1 LIMIT 1;