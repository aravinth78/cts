SELECT
    a.event_id,
    a.title AS session_a,
    b.title AS session_b,
    a.start_time,
    a.end_time,
    b.start_time,
    b.end_time
FROM Sessions a
INNER JOIN Sessions b
    ON a.event_id = b.event_id
    AND a.id < b.id
WHERE a.start_time < b.start_time
AND a.end_time > b.start_time;