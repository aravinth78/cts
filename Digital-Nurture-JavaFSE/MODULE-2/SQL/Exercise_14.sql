SELECT
    evt.id,
    evt.title,
    COUNT(reg.id) AS total_signups
FROM Events evt
INNER JOIN Registrations reg
    ON evt.id = reg.event_id
GROUP BY evt.id, evt.title
ORDER BY total_signups DESC
LIMIT 5;