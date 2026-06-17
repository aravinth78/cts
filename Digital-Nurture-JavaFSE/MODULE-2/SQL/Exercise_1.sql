SELECT
    usr.name,
    evt.title,
    evt.location,
    evt.event_date
FROM Users usr
INNER JOIN Registrations reg
    ON usr.id = reg.user_id
INNER JOIN Events evt
    ON reg.event_id = evt.id
WHERE evt.status = 'active'
AND usr.location != evt.location
ORDER BY evt.event_date ASC;