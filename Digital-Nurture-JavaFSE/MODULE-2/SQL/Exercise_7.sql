SELECT
    usr.name,
    evt.title AS event_name,
    fb.score,
    fb.remark
FROM Feedback fb
INNER JOIN Users usr
    ON fb.user_id = usr.id
INNER JOIN Events evt
    ON fb.event_id = evt.id
WHERE fb.score >= 3;