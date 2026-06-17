SELECT
    evt.location,
    ROUND(AVG(fb.score), 2) AS location_avg_score
FROM Events evt
INNER JOIN Feedback fb
    ON evt.id = fb.event_id
GROUP BY evt.location
ORDER BY location_avg_score DESC;