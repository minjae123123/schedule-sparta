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

# application.properties

<img width="757" height="275" alt="image" src="https://github.com/user-attachments/assets/0065c525-4d80-47b4-bc5c-eea3ffaa0951" />

