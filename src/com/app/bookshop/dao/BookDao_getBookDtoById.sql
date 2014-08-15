SELECT b.*,c.name as categoryname
FROM BOOK b
INNER JOIN CATEGORY c
ON b.CATEGORYID = c.ID
WHERE b.ID=/*id*/