SELECT
    evt.id,
    evt.title,
    evt.event_date,
    evt.location
FROM Events evt
LEFT JOIN Sessions ses
    ON evt.id = ses.event_id
WHERE ses.id IS NULL
ORDER BY evt.event_date DESC;