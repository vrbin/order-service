FROM openjdk:17-oracle
EXPOSE 8081
COPY target/order-service-1.0-SNAPSHOT.jar order-service.jar
ENTRYPOINT ["java", "-jar", "order-service.jar"]