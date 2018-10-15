FROM java:8-jre

ADD ./target/autocomplete-service-1.1.0.jar /usr/src/autocomplete-service-1.1.0.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "autocomplete-service-1.1.0.jar"]
