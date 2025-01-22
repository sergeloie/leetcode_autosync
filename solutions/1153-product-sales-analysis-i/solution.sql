-- Write your PostgreSQL query statement below
SELECT product_name, year, price
FROM sales
JOIN product ON product.product_id = sales.product_id;
