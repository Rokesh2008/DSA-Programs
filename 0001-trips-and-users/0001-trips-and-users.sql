# Write your MySQL query statement below

select t.request_at as Day, ROUND(1.0 * (count(case when t.status in ('cancelled_by_client', 'cancelled_by_driver') then 1 else null end))/ count(1),2) as "Cancellation Rate" 
from Trips t
inner join Users u on t.client_id = u.users_id
inner join Users d on t.driver_id = d.users_id 
where u.banned = "No" and d.banned = "No" and t.request_at between '2013-10-01' and '2013-10-03'
group by t.request_at