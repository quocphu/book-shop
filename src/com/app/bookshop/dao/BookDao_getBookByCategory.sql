SELECT b.*,c.name as categoryname
FROM BOOK b
INNER JOIN CATEGORY c
ON b.CATEGORYID = c.ID
WHERE b.STATUS = 1
AND b.categoryid = CAST(/*categoryid*/ as numeric)
Limit 9