FROM java:8

RUN mkdir /src

WORKDIR /src

COPY target/certification-service-1.1.0.jar /src/certification-service-1.1.0.jar

RUN sh -c 'touch /src/certification-service-1.1.0.jar'

ENTRYPOINT ["java","-jar","/src/certification-service-1.1.0.jar"]
