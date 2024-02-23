select enrollment_id,customer_name,policy_name,no_of_years,bonus_percentage
from customer natural join policyenrollment natural join policy 
where email_id like '%gmail%'
order by enrollment_id desc
;