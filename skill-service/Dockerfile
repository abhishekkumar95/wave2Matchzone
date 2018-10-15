FROM java:8

RUN mkdir /src

WORKDIR /src

COPY target/skill-service-1.1.0.jar /src/skill-service-1.1.0.jar

RUN sh -c 'touch /src/skill-service-1.1.0.jar'

ENTRYPOINT ["java","-jar","/src/skill-service-1.1.0.jar"]
