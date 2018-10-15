FROM java:8

RUN mkdir /src

WORKDIR /src

COPY target/project-service-1.1.0.jar /src/project-service-1.1.0.jar

RUN sh -c 'touch /src/project-service-1.1.0.jar'

ENTRYPOINT ["java","-jar","/src/project-service-1.1.0.jar"]
