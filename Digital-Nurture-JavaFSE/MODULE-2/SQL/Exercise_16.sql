SELECT
    usr.id,
    usr.name,
    usr.email,
    usr.signup_date
FROM Users usr
LEFT JOIN Registrations reg
    ON usr.id = reg.user_id
WHERE reg.id IS NULL
OR reg.signup_date < CURDATE() - INTERVAL 60 DAY;