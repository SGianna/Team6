/* 주의 사항
 * 단일 line 주석 작성시 -- 와 내용 사이에 blank 필수
 */
use fisa;

-- 1. 해당 계정이 사용 가능한 모든 table 검색


-- 2. emp table의 모든 내용(모든 사원(row), 속성(컬럼)) 검색

-- 3. emp의 구조 검색

-- 4. emp의 사번(empno)만 검색


-- 5. emp의 사번(empno), 이름(ename)만 검색

-- 6. emp의 사번(empno), 이름(ename)만 검색(별칭 적용)

-- 7. 부서 번호(deptno) 검색

-- 8. 중복 제거된 부서 번호 검색

-- 9. 8 + 오름차순 정렬(order by)해서 검색
-- 오름 차순 : asc  / 내림차순 : desc


-- 10. ? 사번(empno)과 이름(ename) 검색 단 사번은 내림차순(order by desc) 정렬

-- 11. ? dept table의 deptno 값만 검색 단 오름차순(asc)으로 검색

-- 12. ? 입사일(hiredate) 검색, 
-- 입사일이 오래된 직원부터 검색되게 해 주세요
-- 고려사항 : date 타입도 정렬(order by) 가능 여부 확인


-- 13. ?모든 사원의 이름과 월 급여(sal)와 연봉 검색

-- 14. ?모든 사원의 이름과 월급여(sal)와 연봉(sal*12) 검색
-- 단 comm 도 고려(+comm) = 연봉(sal*12) + comm
-- null값과 연산시에는 모든 데이터가 null
-- 해결책 : null을 0값으로 대체
-- 모든 db는 지원하는 내장 함수 
-- null -> 숫자값으로 대체하는 함수 : IFNULL(null보유컬럼명, 대체값)

-- 모든 사원의 이름과 월급여(sal)와 연봉(sal*12)+comm 검색


-- *** 조건식 ***
-- 15. comm이 null인 사원들의 이름과 comm만 검색
-- where 절 : 조건식 의미


-- 16. comm이 null이 아닌 사원들의 이름과 comm만 검색
-- where 절 : 조건식 의미
-- 아니다 라는 부정 연산자 : not 

-- 17. ? 사원명이 스미스인 사원의 이름과 사번만 검색
-- = : db에선 동등비교 연산자
-- 참고 : 자바에선  == 동등비교 연산자 / = 대입연산자


-- 18. 부서번호가 10번 부서의 직원들 이름, 사번, 부서번호 검색
-- 단, 사번은 내림차순 검색



-- 19. ? 기본 syntax를 기반으로 
-- emp  table 사용하면서 문제 만들기



-- 20. 급여가 900이상인 사원들 이름, 사번, 급여 검색 


-- 21. deptno 10, job 은 manager(대문자로) 이름, 사번, deptno, job 검색

-- 소문자 manager는 미존재 따라서 검색 안됨



-- 대소문자 구분 없이 검색을 위한 해결책(대소문자 호환 함수)
-- upper() : 소문자 -> 대문자 / lower() : 대문자 -> 소문자


-- 22.? deptno가 10 아닌 직원들 사번, 부서번호만 검색
-- 부정연산자 not / != / <>


-- 23. sal이 2000이하(sal <= 2000) 이거나(or) 3000이상(sal >= 3000)인 사원명, 급여 검색



-- 24.  comm이 300 or 500 or 1400인

-- in 연산식 사용해서 좀더 개선된 코드

-- 25. ?  comm이 300 or 500 or 1400이 아닌 사원명 검색


-- 26. 81/09/28 날 입사한 사원 이름.사번 검색
-- date 타입 비교 학습
-- date 타입은 '' 표현식 가능
-- yy/mm/dd 포멧은 차후에 변경 예정(함수)


-- 27. 날짜 타입의 범위를 기준으로 검색
-- 범위비교시 연산자 : between~and


-- 28. 검색시 포함된 모든 데이터 검색하는 기술
-- like 연산자 사용
-- % : 철자 개수 무관하게 검색 / _ : 철자 개수 의미

-- 29. 두번째 음절의 단어가 M인 모든 사원명 검색 

-- 30. 단어가 M을 포함한 모든 사원명 검색 