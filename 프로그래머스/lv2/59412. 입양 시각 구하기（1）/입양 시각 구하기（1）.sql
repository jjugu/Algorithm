-- 코드를 입력하세요
SELECT DATE_FORMAT(DATETIME, '%H') AS HOUR
     , COUNT('HOUR')
  FROM ANIMAL_OUTS
 GROUP BY HOUR
HAVING HOUR BETWEEN 09 AND 19
 ORDER BY HOUR ASC;