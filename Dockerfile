FROM ubuntu:latest AS build

RUN apt-get uptade
RUN apt-get install openjdk-17-jdk -y

COPY . .

RUN apt-get install maven -y
RUN mvn clean install

EXPOSE 8080

FROM openjdk:17-jdk-slim

COPY --from=build /target/todolist-1.0.0.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]
