SELECT
    usr.id,
    usr.name,
    usr.email
FROM Users usr
LEFT JOIN Registrations reg
    ON usr.id = reg.user_id
WHERE reg.event_id IS NULL
OR reg.signup_date > '2025-06-01';