FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/docker*.jar /my-app.jar
#CMD["java","-jar","/app.jar","--spring.profiles.acive=prod"]
CMD ["java","-jar","/my-app.jar"]
EXPOSE 8080