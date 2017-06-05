FROM maven:3-jdk-8-alpine
MAINTAINER David Esner <esnerda@gmail.com>

ENV APP_VERSION 1.2.0
RUN apk add --no-cache git
 WORKDIR /home
RUN git clone https://github.com/davidesner/keboola-iceportal-ex.git ./  
RUN export MAVEN_OPTS="-XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap"
RUN mvn compile

ENTRYPOINT mvn -q exec:java -Dexec.args=/data  