SELECT
    DATE_FORMAT(signup_date, '%Y-%m') AS month_label,
    COUNT(*) AS signup_total
FROM Registrations
WHERE signup_date >= CURDATE() - INTERVAL 6 MONTH
GROUP BY DATE_FORMAT(signup_date, '%Y-%m')
ORDER BY month_label ASC;