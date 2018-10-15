FROM java:8
RUN mkdir /src

WORKDIR /src

COPY target/indexer-service-1.1.0.jar /src/indexer-service-1.1.0.jar

RUN sh -c 'touch /src/indexer-service-1.1.0.jar'

ENTRYPOINT ["java","-jar","/src/indexer-service-1.1.0.jar"]
