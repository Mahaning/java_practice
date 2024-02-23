SELECT c.customer_id, c.customer_name, a.account_no, a.account_type, a.initial_deposit, a.interest 
FROM customer_personal_info c 
JOIN account_info a ON c.customer_id = a.customer_id 
WHERE a.initial_deposit = (SELECT MAX(initial_deposit) FROM account_info)
ORDER BY c.customer_id ASC;