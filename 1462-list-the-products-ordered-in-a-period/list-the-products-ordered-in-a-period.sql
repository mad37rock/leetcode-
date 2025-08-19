# Write your MySQL query statement below
select p.product_name,sum(o.unit) as unit from products p 
left join orders o on p.product_id=o.product_id
WHERE DATE_FORMAT(o.order_date,'%Y-%m') ='2020-02'
group by o.product_id having unit>=100;