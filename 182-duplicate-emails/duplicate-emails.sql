# Write your MySQL query statement below44se
select email from person
group by email
having count(email)>1;
