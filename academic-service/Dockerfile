FROM java:8

RUN mkdir /src

WORKDIR /src

COPY target/academic-service-1.1.0.jar /src/academic-service-1.1.0.jar

RUN sh -c 'touch /src/academic-service-1.1.0.jar'

ENTRYPOINT ["java","-jar","/src/academic-service-1.1.0.jar"]
