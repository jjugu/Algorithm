-- 코드를 입력하세요
-- 몇 시에 입양이 가장 활발하게 일어나는지(0시 ~ 23시) 모든 시간 데이터를 생성
WITH RECURSIVE TIME AS(
    SELECT 0 as hour
    UNION ALL
    SELECT hour + 1 FROM time
    WHERE HOUR < 23)

SELECT time.hour
     , COUNT(animal_id)
FROM (SELECT *
     , HOUR(datetime) AS hour     
FROM animal_outs) AS outs2
     RIGHT JOIN time ON outs2.hour = time.hour
GROUP BY time.hour
ORDER BY time.hour