# Write your MySQL query statement below
Select email AS Email
From Person
Group By email
Having COUNT(*)>1;
