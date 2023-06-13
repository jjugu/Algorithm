-- 코드를 입력하세요
  WITH TBL_RANK
    AS (SELECT M.MEMBER_NAME                                            AS "MEMBER_NAME"
             , R.REVIEW_TEXT                                            AS "REVIEW_TEXT"
             , R.REVIEW_DATE                                            AS "REVIEW_DATE"
             , RANK() OVER (ORDER BY C.CNT DESC)                        AS "RANKNUMBER"
          FROM MEMBER_PROFILE   M
          JOIN REST_REVIEW      R
            ON M.MEMBER_ID = R.MEMBER_ID 
          JOIN (SELECT MEMBER_ID
                     , REVIEW_ID
                     , COUNT(REVIEW_ID) OVER (PARTITION BY MEMBER_ID)   AS "CNT"
                  FROM REST_REVIEW
               )                C
            ON R.MEMBER_ID = C.MEMBER_ID 
           AND R.REVIEW_ID = C.REVIEW_ID
       )
SELECT MEMBER_NAME
     , REVIEW_TEXT
     , TO_CHAR(REVIEW_DATE, 'YYYY-MM-DD')
  FROM TBL_RANK
 WHERE RANKNUMBER = 1
 ORDER BY REVIEW_DATE, REVIEW_TEXT;