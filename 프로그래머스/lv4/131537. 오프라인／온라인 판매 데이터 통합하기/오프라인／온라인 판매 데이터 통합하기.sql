-- 코드를 입력하세요
SELECT *
  FROM (SELECT 
               DATE_FORMAT(N.SALES_DATE, '%Y-%m-%d') SALES_DATE,
               N.PRODUCT_ID,
               N.USER_ID,
               N.SALES_AMOUNT
          FROM ONLINE_SALE N
         UNION ALL
        SELECT 
               DATE_FORMAT(F.SALES_DATE, '%Y-%m-%d') SALES_DATE,
               F.PRODUCT_ID,
               NULL USER_ID,
               F.SALES_AMOUNT
          FROM OFFLINE_SALE F
        ) T
 WHERE MONTH(T.SALES_DATE) = 3
 ORDER BY T.SALES_DATE ASC, T.PRODUCT_ID ASC, T.USER_ID ASC