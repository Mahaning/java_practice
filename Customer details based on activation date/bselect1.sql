select c.customer_id, b.bank_name , b.branch_name , b.ifsc_code , a.registration_date , a.activation_date
from customer_reference_info c
inner join account_info a on
c.customer_id = a.customer_id
inner join bank_info b on
a.ifsc_code = b.ifsc_code
where month(a.activation_date)=3
order by c.customer_id asc;