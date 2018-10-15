FROM java:8

RUN mkdir /src

WORKDIR /src

ADD target/configuration-service-1.1.0.jar /src/configuration-service-1.1.0.jar

RUN sh -c 'touch /src/configuration-service-1.1.0.jar'

ENTRYPOINT ["java", "-jar","/src/configuration-service-1.1.0.jar"]
