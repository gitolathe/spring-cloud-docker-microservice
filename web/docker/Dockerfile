
# Pull base image
FROM java:8
MAINTAINER Ola Theander <ola.theander@myola.se>

# Add the JAR file.
ADD web-0.0.1-SNAPSHOT.jar /

# Expose port 8080 for access to Groovy app.
EXPOSE 8080

WORKDIR /

# Run the Java application.
ENTRYPOINT [ "java", "-jar", "web-0.0.1-SNAPSHOT.jar" ]