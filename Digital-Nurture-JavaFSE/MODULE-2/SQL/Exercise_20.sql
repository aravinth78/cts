SELECT
    usr.id,
    usr.name,
    COUNT(DISTINCT reg.event_id) AS events_attended,
    COUNT(DISTINCT fb.event_id) AS events_reviewed
FROM Users usr
LEFT JOIN Registrations reg
    ON usr.id = reg.user_id
LEFT JOIN Feedback fb
    ON usr.id = fb.user_id
GROUP BY usr.id, usr.name
ORDER BY events_attended ASC;