/*s1, s2, s3 represent consecutive IDs id,id+1,id+2 */
SELECT 
    id
    ,visit_date
    ,people
FROM stadium
WHERE id IN (
    SELECT s1.id /*s1 is selected*/
    FROM stadium s1
    JOIN stadium s2 ON s1.id=s2.id-1
    JOIN stadium s3 ON s2.id=s3.id-1
    WHERE s1.people>=100 AND s2.people>=100 AND s3.people>=100

    UNION

    SELECT s2.id/*s2 is selected*/
    FROM stadium s1
    JOIN stadium s2 ON s1.id=s2.id-1
    JOIN stadium s3 ON s2.id=s3.id-1
    WHERE s1.people>=100 AND s2.people>=100 AND s3.people>=100

    UNION 

    SELECT s3.id/*s3 is selected*/
    FROM stadium s1
    JOIN stadium s2 ON s1.id=s2.id-1
    JOIN stadium s3 ON s2.id=s3.id-1
    WHERE s1.people>=100 AND s2.people>=100 AND s3.people>=100
)
GROUP BY visit_date