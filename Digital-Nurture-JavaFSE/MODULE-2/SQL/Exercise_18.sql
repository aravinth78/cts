SELECT
    evt.id,
    evt.title,
    evt.status
FROM Events evt
LEFT JOIN Resources res
    ON evt.id = res.event_id
WHERE res.id IS NULL
ORDER BY evt.start_date DESC;