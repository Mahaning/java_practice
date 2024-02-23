select a.customer_id,c.customer_name,a.account_no,a.account_type,a.initial_deposit,
a.interest,
((a.interest/(100)*a.initial_deposit)) as interest_amt from account_info as a join 
customer_personal_info as c on a.customer_id = c.customer_id order by a.customer_id asc;