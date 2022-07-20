FROM openjdk:11
EXPOSE 8080
ADD target/springboot-devops-sample.jar springboot-devops-sample.jar
ENTRYPOINT ["java","-jar","/springboot-devops-sample.jar"]