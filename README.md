# Spring Boot, PostgreSQL, MyBatis

---

## Steps to Setup

**1. Clone the repository**
```shell
git clone https://github.com/asepscareer/springboot-postgresql-mybatis.git
```

**2. Configure PostgreSQL**

First, create a database named libraries. Then, open src/main/resources/application.yml file and change the spring datasource username and password as per your PostgreSQL installation.

**3. Run the app**

Type the following command from the root directory of the project to run it -
```shell
mvn spring-boot:run
```

Alternatively, you can package the application in the form of a JAR file and then run it like so -
```shell
mvn clean package
java -jar target/Spring-Boot-MyBatish-0.0.1-SNAPSHOT.jar
```
