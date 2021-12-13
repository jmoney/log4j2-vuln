FROM adoptopenjdk/openjdk11:alpine-jre
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
COPY dnsmasq.conf /etc/dnsmasq.conf

ENTRYPOINT ["java","-jar","/app.jar"]