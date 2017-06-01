FROM maven:3-jdk-8
MAINTAINER David Esner <esnerda@gmail.com>

ENV APP_VERSION 1.1.0
 WORKDIR /home
RUN git clone https://github.com/davidesner/keboola-iceportal-ex.git ./  
RUN export MAVEN_OPTS="-Xms1024m -Xmx1024m"
RUN mvn compile

ENTRYPOINT mvn -q exec:java -Dexec.args=/data  