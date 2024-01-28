FROM openjdk:21-jdk
COPY build/libs/stuart-0.1-SNAPSHOT.jar stuart-back-0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/stuart-back-0.1-SNAPSHOT.jar"]