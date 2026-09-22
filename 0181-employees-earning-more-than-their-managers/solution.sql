# Write your MySQL query statement below
SELECT e1.name AS Employee
From Employee e1
Join Employee e2 ON e1.managerId=e2.id
Where e1.salary>e2.salary;
