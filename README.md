# ☕ FISA CAFE PROJECT ☕

## 📋 프로젝트 개요
- MVC, DAO, DTO 디자인 패턴 이용, 카페 키오스크 구현 (+lombok 라이브러리)
- 키오스크 화면에서 해당 가게의 메뉴를 출력
- 회원이 아닐경우, 비회원 주문을 하거나 회원가입을할 수 있다.
- 회원가입이 완료되어 회원일 경우, 이름과 전화번호로 해당 가게의 회원인지 조회한 후 메뉴를 주문할 수 있다.
- 메뉴를 주문하면 총 주문 금액과 해당 고객의 등급(Family, Gold, VIP)을 출력하여 보여준다.


## 📅 프로젝트 기간
- 기획 : 2023.05.07
- 개발 : 2023.05.08 (9:00 ~ 18:00)



## 😃진행 인원 및 역할
- 4인


###  @Jaemin-kr 😐
- [InputView - Controller]
- while 문으로 4.종료 전까지 수행
- Scanner return 처리
- 사용자 Input 정보받아서 (예외처리: 1~4 외 불가)
- 1~4 Input에 맞춰 기능 매핑 ( Controller의 각 기능 메소드에 연결)
    
###  @SGianna 😄
- [InputView - Controller - OutputView]
- “주문하실 음료를 골라주세요”, 사용자 Input 대기 (Scanner)  + 메뉴판
- getAllMenu : 메뉴판 출력
- 사용자 Input 정보받아서 return (예외처리 : 1~N 외 불가, N = count(메뉴))
- Controller.메소드명(사용자 Input)
- selectMenu
- select : db로 부터 메뉴 검색 (이름, 가격, 칼로리)
- OrderMenu(input : 사용자 주문내역)
- insert : db order table에 주문 내역에 맞는 데이터 생성 → return
- EndView.print(“주문해주셔서 감사합니다. 총 주문 금액은 ~원 입니다.”)
- 호출한 메소드에 따라 추가 출력?
- “{cust_name}고객님의 회원등급은 {grade_name}입니다.”


###  @2un-light 😎
- [InputView - Controller - OutputView]
- “ 회원정보를 입력해주세요”, 사용자 Input 대기 (Scanner)
- Controller.메소드명(사용자 Input)
- getCustomer(이름, 전화번호)
- select : db customer table에 고객 정보 검색 (예외처리: 타입오류 등)
- EndView.print(“ 확인 되었습니다.”) →Controller.selectMenu() (비회원 주문 메소드로 이동)
- 가입 정보를 입력해주세요”
- Controller.메소드명(사용자 input)
- createCustomer(이름, 전화번호, 생년월일, 성별)
- insert : db customer table에 고객 정보 추가(생성) (예외처리 : null 허용 불가 등)
- EndView.print(“가입이 완료되었습니다”) → 초기화면으로 이동

###  @dodhddl 😆
- table 생성 (customer,grade,menu,sale)
- default data 생성 (Customer, grade, sale)
- db table과 연동 가능한 데이터 클래스 생성 (customer,grade,menu,sale)



## 👀초기화면
<details>
<summary>1. 회원주문</summary>
<div markdown="1">

    1. **회원주문**

    회원정보를 입력해주세요

    입력: [이름/전화번호/?생년월일]

    ex) [고재민/010-0000-0000]

    ---

    확인되었습니다.

    주문하실 음료를 골라주세요

    1. 아메리카노(5000원)
    2. 카페라떼(5500원)
    3. 모카라떼(6500원)

    …

    ---

    주문해주셔서 감사합니다. 총 주문 금액은 ~원 입니다.

    name고객님의 회원등급은 grade입니다.

    ---

    END

    초기화면으로

    ---

</div>
</details>

<details>
<summary>2. 비회원주문</summary>
<div markdown="1">
     2. **비회원주문**

    주문하실 음료를 골라주세요

    1. 아메리카노(5000원)
    2. 카페라떼(5500원)
    3. 모카라떼(6500원)

    ---

    주문해주셔서 감사합니다. 총 주문금액은 ~입니다.

    ---

    END

    초기화면으로

    ---

</div>
</details>


<details>
<summary>3. 회원가입</summary>
<div markdown="1">

    3. **회원가입**

    가입정보를 입력해주세요

    입력:[이름/전화번호/생년월일]

    ex) [고재민/010-0000-0000/980731]

    ---

    가입이 완료되었습니다.

    주문하실 음료를 골라주세요

    1. 아메리카노(5000원)
    2. 카페라떼(5500원)
    3. 모카라떼(6500원)

    …

    ---

    주문해주셔서 감사합니다. 총 주문 금액은 ~원 입니다.

    cust_name고객님의 회원등급은 grade_name입니다.

    ---

    END

    초기화면으로

    ---
    
</div>
</details>

---



## 👩‍ TABLE 구성

### 고객(customer) TABLE
- 고객번호(PK) : VARCHAR(5) 
- 이름 : VARCHAR(45) / NOT NULL 
- 전화번호 : VARCHAR(15) / NOT NULL 
- 생년월일 : Date / NOT NULL
- 성별 : VARCHAR(1) / NULL값 허용
- 누적금액 : INT (Default = 0) / 0 이면 무조건 Family등급
- 등급(FK) : INT (처음 가입하면 Default값 = Family)

ex) 0001/고재민/010-0000-0000/980731/ 남(male)/10000/ /Gold

| customer_id | name | phone | birthday | gender | amount | grade_id |
| --- | --- | --- | --- | --- | --- | --- |
| pk |  |  |  |  |  | fk |
| 0001 | 고재민 | 010-1111-1111 | 1998-07-31 | M | 0 | 10 |
| 0002 | 김하늘 | 010-2222-2222 | 1999-05-06 | F | 0 | 20 |

### 등급(grade) TABLE
- 등급번호(PK) : INT
- 등급 : VARCHAR(30)

| grade_id | grade_name | standard |
| --- | --- | --- |
| pk |  |  |
| 10 | Family | 0 |
| 20 | Gold | 5000 |
| 30 | VIP | 10000 |

### 메뉴(menu) TABLE
- 메뉴번호 : INT (카테고리별 번호 부여를 위해 auto increment는 사용하지 않음)
- 메뉴이름 : VARCHAR(50)
- 가격 : INT
- 카테고리 : INT
- 칼로리 : INT ( 칼로리도 뷰 화면에 표시)

| menu_id | menu_name | price | categories | calorie |
| --- | --- | --- | --- | --- |
| pk |  |  |  |  |
| 1001 | 에스프레소 | 5500 | 1000 | 5 |
| 1002 | 카페라떼 | 4500 | 1000 | 10 |
| 1003 | 돌체 콜드 브루 | 1000 | 3000 | 110 |
| 2000 | 유스베리티 | 7000 | 2000 | 175 |
| 2001 | 유자민트티 | 5900 | 2000 | 145 |
| 2002 | 자몽허니블랙티 | 5700 | 2000 | 125 |
| 3000 | 유자에이드 | 5900 | 3000 | 65 |
| 3001 | 레몬에이드 | 5400 | 3000 | 65 |

### 주문 (sale) TEBLE
| order_id | order_date | total | cust_id |
| --- | --- | --- | --- |
| PK | --- | --- | --- |
| 1 | 2023/05/04 | 9500 | NULL |
| 2 | 2023/05/05 | 10500 | CM001 |
| 3 | 2023/05/06 | 4500 | CM002 |



## 👨‍💻 사용언어 & Tool
### LANGUAGE
- JAVA
- SQL

### TOOL
- ECLIPSE / IntelliJ
- VSC
- MySQL
- DBeaver


### 형상관리 TOOL
- Github
- GitKraken
- KDiff3
