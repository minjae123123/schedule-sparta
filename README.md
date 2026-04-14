# Schedule API
Spirng Boot와 JPA를 활용하여 일정 생성, 조회, 수정, 삭제 및 댓글 추가, 조회를 구현한 일정 관리 프로젝트입니다!

# 사용 기술
- java 17
- spring boot
- mysql
- jpa

# ERD
<img width="871" height="612" alt="image" src="https://github.com/user-attachments/assets/2aa79000-671b-4d83-98b9-1b173a259155" />


# 프로젝트 구조
<img width="572" height="876" alt="image" src="https://github.com/user-attachments/assets/808cd351-4fc0-4732-a28d-ebcdffe20e3e" />



- controller : HTTP 요청/응답 처리
- dtos : 요청 및 응답 데이터 전달
- entity : 일정, 댓글, 공통 시간 각각의 필드 정의
- exception : 입력값 검증 처리
- repository : 데이터를 접근하는 인터페이스
- service : 일정/댓글 비즈니스 로직

# API 명세
https://www.notion.so/API-341cd1f1b02f80058ddbff44dba06ba4?showMoveTo=true&saveParent=true

# application.properties

<img width="757" height="275" alt="image" src="https://github.com/user-attachments/assets/0065c525-4d80-47b4-bc5c-eea3ffaa0951" />

# 3 Layer Architecture와 주요 어노테이션

① 3 Layer Architecture(Controller, Service, Repository)
- 처음에는 3 Layer Architecture가 그렇게 크게 와 닿지 않았었는데 직접 구현해보니, 이래서 사용하는구나 라는 것을 알게 되었다. 역할을 3계층(Controller,Service,Repository)로 나누어 기능을 한 곳에 몰아넣는 것이 아닌 역할별로 분리하여 관리할 수 있기 떄문에 역할 분리가 명확해지는 것이 가장 큰 것 같다. 그리고 직접 구현해보면서 느낀 것은 에러가 발생하였을 때 역할이 나누어져 있으니 한 곳에 코드를 몰아넣는 것보다 더 유지보수를 하기 쉽고 중복 코드를 줄일 수 있어 효율적이라고 생각이 들었다.

② @RequestParam, @PathVariable, @RequestBody 어노테이션과 특징

@RequestParam : URL의 쿼리 파라미터의 값을 받아올 때 쓰는 어노테이션

특징 
- URL 뒤에 ?key=value 형식의 데이터를 받는다.
- 주로 조회 조건, 검색 조건에 많이 사용된다.
- 필수 여부를 설정할 수 있다.

@PathVariable : URL 경로에 포함된 값을 받아올 때 쓰는 어노테이션

특징
- URL 경로 자체의 일부를 변수처럼 사용한다.
- 주로 특정 자원을 식별할 때 사용한다.
- REST API에서 가장 많이 사용하는 방식 중 하나이다.

@RequestBody : 클라이언트가 요청 본문(body)에 담아서 보낸 JSON 데이터를 객체로 변환할 때 사용하는 어노테이션

특징
- HTTP Body의 JSON 데이터를 Java 객체로 변환한다.
- 주로 생성, 수정 요청에서 많이 사용된다.
- DTO와 함께 사용하는 경우가 많다.
