select cake_id,cake_name,cake_type,price_per_kg 
from cakes 
where cake_id not in (select cake_id from order_details)
order by cake_name
;