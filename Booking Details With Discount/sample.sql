select booking_id,discount_coupon,total_amount_paid 
from booking_details b join discount_master d
on b.discount_coupon=d.coupon_code 
where discount_amount between 50 and 80
order by 1
;