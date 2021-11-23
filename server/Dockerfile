FROM debian:10.10-slim

ENV APP_DIR=/opt/app

SHELL ["/bin/bash", "-euxo", "pipefail", "-c"]

# jre installation require man folder to exist on the server
RUN mkdir -p /usr/share/man/man1

# hadolint ignore=DL3008
RUN apt-get update -qq -y \
    && apt-get install --no-install-recommends -qq -y \
        gosu \
        default-jre \
        maven \
    && apt-get -y autoclean \
    && apt-get -y autoremove \
    && rm -rf /var/lib/apt/lists/*

WORKDIR ${APP_DIR}
COPY src src/
COPY pom.xml ./
RUN mvn clean package \
    && mv target/openapi-spring-*.jar target/app.jar

WORKDIR /
COPY docker-entrypoint.sh .
RUN chmod +x docker-entrypoint.sh

EXPOSE 8080

ENTRYPOINT ["/docker-entrypoint.sh"]

CMD ["java", "-jar", "target/app.jar"]