FROM eclipse-temurin:21-jdk
LABEL authors="daniel"

WORKDIR /root

COPY .mvn /root/.mvn
COPY mvnw /root
COPY pom.xml /root

RUN ./mvnw dependency:go-offline

COPY src /root/src

RUN ./mvnw clean install -DskipTests

ENTRYPOINT ["java", "-jar", "/root/target/access-control-service-0.0.1-SNAPSHOT.jar"]