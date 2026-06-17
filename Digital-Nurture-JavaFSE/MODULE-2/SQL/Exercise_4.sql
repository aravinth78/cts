SELECT
    evt.id,
    evt.title,
    COUNT(ses.id) AS session_count
FROM Events evt
INNER JOIN Sessions ses
    ON evt.id = ses.event_id
WHERE TIME(ses.start_time) BETWEEN '10:00:00' AND '16:00:00'
GROUP BY evt.id, evt.title;