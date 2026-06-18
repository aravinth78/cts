SELECT
    evt.id,
    evt.title,
    COUNT(DISTINCT reg.user_id) AS distinct_visitors,
    ROUND(AVG(fb.score), 2) AS feedback_avg
FROM Events evt
LEFT JOIN Registrations reg
    ON evt.id = reg.event_id
LEFT JOIN Feedback fb
    ON evt.id = fb.event_id
WHERE evt.status = 'cancelled'
GROUP BY evt.id, evt.title;