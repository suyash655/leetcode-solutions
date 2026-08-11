# Write your MySQL query statement below
/*SELECT 
    IFNULL(
        (SELECT DISTINCT salary
        FROM Employee
        ORDER BY salary DESC
        LIMIT 1 OFFSET 1),
        NULL

    ) AS SecondHighestSalary
    */

    SELECT 
    (
        SELECT MAX(salary)
        FROM Employee
        WHERE salary < (  SELECT MAX(salary) FROM Employee)
    ) AS SecondHighestSalary;
