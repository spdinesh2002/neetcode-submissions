-- Write your query below
SELECT c.name 
FROM customers c
WHERE id not in (SELECT customer_id FROM orders)