select pass_name,flight_name 
from flight_details f,booking b,booking_details bd,passengers p 
where f.flight_id=b.flight_id and b.booking_id=bd.booking_id
and p.pass_id=bd.pass_id 
and flight_date=booking_date 
order by pass_name desc;