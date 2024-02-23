select distinct concat(p_first_name,' made an appointment in ',monthname(app_date)) as Appointment_Information
from patient natural join appointment natural join doctor 
where lower(dr_first_name) like '%h%'
order by Appointment_Information desc; 