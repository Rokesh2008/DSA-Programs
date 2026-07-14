# Write your MySQL query statement below
WITH CTE AS (SELECT s.student_id, s.student_name, su.subject_name
FROM Students as s
INNER JOIN Subjects as su)
Select cte.student_id, cte.student_name, cte.subject_name, COUNT(e.student_id) as attended_exams
FROM Cte
LEFT JOIN Examinations as e
ON e.student_id=cte.student_id 
AND e.subject_name=cte.subject_name
GROUP BY student_id, subject_name
ORDER BY student_id, subject_name