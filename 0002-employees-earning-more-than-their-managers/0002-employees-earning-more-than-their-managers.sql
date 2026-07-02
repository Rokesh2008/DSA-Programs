# Write your MySQL query statement below
select name as 'Employee' from Employee E where
salary > (select salary from Employee where id = E.managerId);