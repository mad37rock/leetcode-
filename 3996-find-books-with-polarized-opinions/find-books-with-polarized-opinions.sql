# Write your MySQL query statement below
select b.book_id,b.title,b.author,b.genre,b.pages,
max(s.session_rating)-min(s.session_rating) as rating_spread, 
round(sum(case when s.session_rating<=2 or s.session_rating>=4 then 1 else 0 end)/ count(*),2) as polarization_score
from books b left join reading_sessions s on b.book_id=s.book_id 
group by b.book_id,b.title,b.author,b.genre,b.pages
having count(*) >= 5
and max(s.session_rating)>=4
and min(s.session_rating)<=2
and (sum(case when s.session_rating<=2 or s.session_rating>=4 then 1 else 0 end)/count(*))>= 0.6
order by polarization_score desc,title desc;
