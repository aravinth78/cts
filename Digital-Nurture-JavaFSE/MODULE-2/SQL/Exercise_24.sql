SELECT
    evt.id,
    evt.title,
    ROUND(
        AVG(
            TIMESTAMPDIFF(MINUTE, ses.start_time, ses.end_time) / 60
        ), 2
    ) AS avg_length_hours
FROM Events evt
INNER JOIN Sessions ses
    ON evt.id = ses.event_id
GROUP BY evt.id, evt.title
ORDER BY avg_length_hours DESC;