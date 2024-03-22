# ビルドステージ
FROM maven:3-eclipse-temurin-21-alpine AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# 実行ステージ
FROM openjdk:21-slim
COPY --from=build /app/target/GeneralAPI-0.0.1.jar /app/api.jar
ENTRYPOINT ["java","-jar","/app/api.jar"]
