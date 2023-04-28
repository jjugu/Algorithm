-- 코드를 입력하세요
SELECT A.AUTHOR_ID
     , B.AUTHOR_NAME
     , A.CATEGORY
     , SUM(A.PRICE * C.SALES) AS 'TOTAL_SALES'
  FROM BOOK A
  JOIN AUTHOR B ON A.AUTHOR_ID = B.AUTHOR_ID
  JOIN BOOK_SALES C ON A.BOOK_ID = C.BOOK_ID
 WHERE DATE_FORMAT(C.SALES_DATE, '%Y-%m') = '2022-01'
 GROUP BY B.AUTHOR_NAME, A.CATEGORY
 ORDER BY A.AUTHOR_ID ASC, A.CATEGORY DESC;