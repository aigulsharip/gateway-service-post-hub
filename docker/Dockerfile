FROM openjdk:21

WORKDIR /srv

COPY target/*.jar .
COPY docker/gateway-service.sh .

RUN chmod +x gateway-service.sh

EXPOSE 8100

ENTRYPOINT ["./gateway-service.sh"]