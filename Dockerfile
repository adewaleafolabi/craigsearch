FROM openjdk:8-jre-alpine

WORKDIR /

ADD target/search-0.0.1-SNAPSHOT.jar search.jar

ENTRYPOINT ["/usr/bin/java", "-jar" ,"/search.jar"]

EXPOSE 9090