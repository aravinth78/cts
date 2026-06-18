SELECT
    usr.id,
    usr.name,
    COUNT(fb.id) AS feedback_count
FROM Users usr
INNER JOIN Feedback fb
    ON usr.id = fb.user_id
GROUP BY usr.id, usr.name
ORDER BY feedback_count DESC
LIMIT 5;