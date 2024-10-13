# BookMamagement
<img width="980" alt="ERD" src="https://github.com/user-attachments/assets/ab72a332-8aea-4877-a1a8-eebc772b093b">
**요구사항:**

1.	**Spring Boot CRUD 기능 구현**

•	REST API를 사용하여 Create, Read, Update, Delete 기능 구현.

•	엔티티(예: User, Product 등)를 기반으로 한 간단한 CRUD API 개발.

•	DTO(Data Transfer Object)를 사용하여 데이터를 전달 및 응답.

2.	**Postman 테스트**

•	Postman을 이용해 API의 각 엔드포인트를 테스트.

•	각 HTTP 메소드(POST, GET, PUT, DELETE)에 대한 적절한 요청과 응답 확인.

•	테스트 결과를 문서화.

3.	**Jenkins를 이용한 자동 배포**

•	GitHub와 Jenkins를 연동하여 Git push 시 자동 빌드 및 배포 파이프라인 설정.

•	Maven을 사용해 Spring Boot 프로젝트 빌드.

•	Jenkins에서 빌드가 성공하면 Docker로 컨테이너 빌드 및 실행.

•	CI/CD 파이프라인에서 성공 여부 확인.

4.	**Docker 컨테이너화**

•	Dockerfile을 작성하여 Spring Boot 애플리케이션을 컨테이너로 빌드.

•	docker-compose를 사용하여 데이터베이스(MySQL)와 같은 의존성을 포함한 멀티 컨테이너 환경 구성.

•	애플리케이션을 도커 이미지로 생성.

5.	**Docker Hub에 이미지 저장**

•	Docker Hub에 레포지토리를 생성하여 컨테이너 이미지를 푸시.

•	Jenkins 파이프라인에서 빌드된 이미지를 Docker Hub로 푸시하도록 설정.

6.	**배포**

•	Docker Hub에서 이미지를 가져와서 다양한 서버에 배포.

•	Nginx나 다른 리버스 프록시를 사용하여 애플리케이션을 외부에 노출.

•	애플리케이션이 정상 동작하는지 확인.

**Spring Boot 디펜던시 목록:**

1.	**Spring Web** (spring-boot-starter-web)

•	REST API를 개발하기 위한 기본 의존성.

2.	**Spring Data JPA** (spring-boot-starter-data-jpa)

•	JPA를 이용해 데이터베이스와 연동하여 CRUD를 구현.

3.	**MySQL Driver** (mysql-connector-java)

•	MySQL 데이터베이스에 연결하기 위한 드라이버.

4.	**Lombok** (lombok)

•	Getter, Setter 등의 보일러플레이트 코드를 줄이기 위한 라이브러리.

5.	**Spring Boot DevTools** (spring-boot-devtools)

•	개발 시 자동 재시작과 같은 편의 기능을 제공.

6.	**JUnit 5** (spring-boot-starter-test)

•	테스트를 위한 의존성.

7.	**Docker Maven Plugin** (Maven의 경우)

•	Docker 이미지를 빌드하기 위한 Maven 플러그인.

이 요구사항에 맞춰 설정한 후, 각 단계마다 Postman으로 API를 테스트하고 Jenkins로 자동화된 빌드 및 배포를 진행하면 됩니다.

도서 관리 시스템을 위한 4개의 테이블로 구성된 ERD(Entity-Relationship Diagram)를 만들어 보겠습니다. 테이블은 Book, Author, Category, Publisher로 구성됩니다.

**1. Book (책) 테이블**

책 정보를 저장하는 테이블입니다.

•	id (PK, INT, AUTO_INCREMENT): 책의 고유 ID

•	title (VARCHAR): 책 제목

•	isbn (VARCHAR): ISBN 번호

•	published_date (DATE): 출판일

•	author_id (FK, INT): 저자 ID (Author 테이블과의 외래 키)

•	category_id (FK, INT): 카테고리 ID (Category 테이블과의 외래 키)

•	publisher_id (FK, INT): 출판사 ID (Publisher 테이블과의 외래 키)

**2. Author (저자) 테이블**

저자 정보를 저장하는 테이블입니다.

•	id (PK, INT, AUTO_INCREMENT): 저자의 고유 ID

•	name (VARCHAR): 저자 이름

•	bio (TEXT): 저자의 소개

**3. Category (카테고리) 테이블**

책의 카테고리를 관리하는 테이블입니다.

•	id (PK, INT, AUTO_INCREMENT): 카테고리의 고유 ID

•	name (VARCHAR): 카테고리 이름 (예: 소설, 과학, 역사)

**4. Publisher (출판사) 테이블**

출판사 정보를 저장하는 테이블입니다.

•	id (PK, INT, AUTO_INCREMENT): 출판사의 고유 ID

•	name (VARCHAR): 출판사 이름

•	address (VARCHAR): 출판사 주소

**테이블 간 관계**

•	**Book**: Author, Category, Publisher 테이블과 각각 Many-to-One 관계입니다.

•	**Author**: 책과 One-to-Many 관계입니다. 한 저자는 여러 권의 책을 쓸 수 있습니다.

•	**Category**: 책과 One-to-Many 관계입니다. 한 카테고리에 여러 권의 책이 포함될 수 있습니다.

•	**Publisher**: 책과 One-to-Many 관계입니다. 한 출판사가 여러 권의 책을 출판할 수 있습니다.

**관계 정리**

•	Book ↔ Author: Many-to-One (저자 한 명이 여러 책을 저술할 수 있음)

•	Book ↔ Category: Many-to-One (여러 책이 한 카테고리에 속할 수 있음)

•	Book ↔ Publisher: Many-to-One (여러 책이 한 출판사에 의해 출판될 수 있음)

