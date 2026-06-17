SELECT
    usr.location,
    COUNT(DISTINCT evt.id) AS total_events
FROM Users usr
INNER JOIN Events evt
    ON usr.location = evt.location
GROUP BY usr.location
ORDER BY total_events ASC
LIMIT 3;