FROM java:15.0.1

COPY *.jar /app.jar
CMD ["--server.port=9000"]

EXPOSE 9001
ENTRYPOINT ["java","-jar","/app.jar"]
