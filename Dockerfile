FROM maven:3.6.3-jdk-11-slim AS dev
COPY . /app
WORKDIR /app
RUN mvn clean package -DskipTests
ENTRYPOINT ["mvn","spring-boot:run"]


FROM openjdk:11 AS prod
RUN mkdir /opt/spring-boot
COPY --from=dev /app/target/*.jar /opt/spring-boot/java-application.jar
WORKDIR /opt/spring-boot/
ENTRYPOINT ["java","-jar","java-application.jar"]