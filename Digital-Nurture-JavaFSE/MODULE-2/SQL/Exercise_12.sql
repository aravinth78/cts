SELECT
    evt.id,
    evt.title,
    COUNT(reg.id) AS registration_total
FROM Events evt
INNER JOIN Registrations reg
    ON evt.id = reg.event_id
GROUP BY evt.id, evt.title
HAVING COUNT(reg.id) = (
    SELECT MAX(reg_sum)
    FROM (
        SELECT COUNT(id) AS reg_sum
        FROM Registrations
        GROUP BY event_id
    ) AS inner_q
);