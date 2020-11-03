## Part 1: Test it with SQL
id = INT
skills = VARCHAR(250)
employer = VARCHAR(250)

## Part 2: Test it with SQL

SELECT  name
FROM employer
WHERE (location = "St.Louis City");

## Part 3: Test it with SQL

DROP TABLE job;

## Part 4: Test it with SQL

SELECT name, description, id
FROM skill
RIGHT JOIN job_skills ON skill.id = job_skills.skills_id
ORDER BY name;
