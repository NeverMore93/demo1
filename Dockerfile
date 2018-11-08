FROM java:alpine
VOLUME /tmp
ADD app.jar /app.jar
RUN sh -c 'touch /demo1.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo1.jar"]