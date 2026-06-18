SELECT
    signup_date,
    COUNT(id) AS people_joined
FROM Users
WHERE signup_date >= CURDATE() - INTERVAL 30 DAY
GROUP BY signup_date
ORDER BY signup_date ASC;