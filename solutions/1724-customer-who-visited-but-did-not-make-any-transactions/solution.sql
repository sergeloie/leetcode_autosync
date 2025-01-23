-- Write your PostgreSQL query statement below
SELECT customer_id, count(customer_id) as count_no_trans 
FROM visits
left JOIN transactions ON visits.visit_id = transactions.visit_id
where transaction_id is null
group by customer_id
;
