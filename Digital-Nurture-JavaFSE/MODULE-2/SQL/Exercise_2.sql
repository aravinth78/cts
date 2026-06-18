SELECT
    evt.id,
    evt.title,
    ROUND(AVG(fb.score), 2) AS average_score,
    COUNT(fb.id) AS total_feedback
FROM Events evt
INNER JOIN Feedback fb
    ON evt.id = fb.event_id
GROUP BY evt.id, evt.title
HAVING COUNT(fb.id) >= 3
ORDER BY average_score ASC;