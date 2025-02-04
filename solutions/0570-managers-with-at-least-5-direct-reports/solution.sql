-- Write your PostgreSQL query statement below
SELECT e1.name
FROM employee AS e1
JOIN employee AS e2 ON e1.id = e2.managerid
GROUP BY e1.name, e1.id
HAVING COUNT(e1.id) >= 5;
