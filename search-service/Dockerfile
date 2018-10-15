FROM java:8-jre

ADD ./target/search-service-1.1.0.jar /usr/src/search-service-1.1.0.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "search-service-1.1.0.jar"]
