SELECT
    evt.id,
    evt.title
FROM Events evt
LEFT JOIN Feedback fb
    ON evt.id = fb.event_id
WHERE fb.id IS NULL;