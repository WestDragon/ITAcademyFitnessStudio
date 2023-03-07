FROM eclipse-temurin:19-jre-focal
MAINTAINER ITAcademy

ADD ./target/user-service.jar /app/

CMD ["java", "-Xmx200m", "-jar", "/app/user-service.jar"]

EXPOSE 8080 8089