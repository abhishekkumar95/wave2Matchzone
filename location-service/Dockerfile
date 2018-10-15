FROM java:8

RUN mkdir /src

WORKDIR /src

COPY target/location-service-1.1.0.jar /src/location-service-1.1.0.jar

RUN sh -c 'touch /src/location-service-1.1.0.jar'

ENTRYPOINT ["java","-jar","/src/location-service-1.1.0.jar"]
