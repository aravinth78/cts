SELECT
    evt.id,
    evt.title,
    COALESCE(COUNT(ses.id), 0) AS number_of_sessions
FROM Events evt
LEFT JOIN Sessions ses
    ON evt.id = ses.event_id
WHERE evt.status = 'completed'
GROUP BY evt.id, evt.title;