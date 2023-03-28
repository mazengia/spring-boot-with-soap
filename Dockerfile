FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
RUN  mkdir /uploads
COPY ${JAR_FILE} app.jar
ENV PORT 8080
EXPOSE $PORT
CMD [  "java","-jar","app.jar","-Dserver.port=${PORT}"]

