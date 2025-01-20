-- Write your PostgreSQL query statement 
SELECT tweet_id
FROM Tweets
WHERE LENGTH(content) > 15;
