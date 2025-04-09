# 🏗️ Build Stage
FROM gradle:8.1.1-jdk17 AS build
COPY --chown=gradle:gradle . /home/gradle/project
WORKDIR /home/gradle/project
RUN ./gradlew bootJar --no-daemon

# 🚀 Run Stage
FROM openjdk:17-jdk-slim
COPY --from=build /home/gradle/project/build/libs/users-service.jar /users-service.jar
ENTRYPOINT ["java", "-jar", "/users-service.jar"]
