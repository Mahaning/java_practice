select enrollment_id,customer_name,policy_id,no_of_years,monthname(date_of_enrollment) as MONTHNAME 
from customer natural join policyenrollment 
where gender='F' 
order by 1 desc;