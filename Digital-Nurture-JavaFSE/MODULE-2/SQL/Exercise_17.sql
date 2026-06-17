SELECT
    speaker,
    COUNT(id) AS total_sessions
FROM Sessions
GROUP BY speaker
HAVING COUNT(id) >= 2
ORDER BY total_sessions ASC;