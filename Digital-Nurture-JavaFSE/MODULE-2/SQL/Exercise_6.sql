SELECT
    evt.id,
    evt.title,
    COUNT(res.id) AS resource_total
FROM Events evt
LEFT JOIN Resources res
    ON evt.id = res.event_id
GROUP BY evt.id, evt.title
ORDER BY resource_total DESC;