SELECT
    usr.id,
    usr.name AS full_name,
    evt.status,
    COUNT(evt.id) AS organized_count
FROM Users usr
INNER JOIN Events evt
    ON usr.id = evt.organizer_id
GROUP BY usr.id, usr.name, evt.status
ORDER BY organized_count ASC;