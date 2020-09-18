FROM openjdk:8-jdk-alpine as builder
WORKDIR /srv/builder
COPY ./gradle ./gradle
COPY ./gradlew ./
RUN ./gradlew
COPY ./ ./
RUN ./gradlew build

FROM openjdk:8-jre-alpine as launcher
ENV DOCKER 1
WORKDIR /srv/launcher
CMD ["java", "-Xmx50M", "-jar", "template.jar"]
COPY --from=builder /srv/builder/build/libs/*.jar ./template.jar
