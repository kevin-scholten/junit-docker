FROM openjdk:11-jre-slim
COPY target/junit-docker-1.0-SNAPSHOT-fat-tests.jar .
ENTRYPOINT exec java -cp junit-docker-1.0-SNAPSHOT-fat-tests.jar org.junit.runner.JUnitCore nl.kvns.CalculatorTest