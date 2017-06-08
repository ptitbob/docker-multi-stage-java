FROM maven:3.5.0-jdk-8 as builder
ARG version
ENV version ${version:-1.0}
WORKDIR /usr/src/mymaven
#COPY pom.xml /usr/src/mymaven
#COPY src /usr/src/mymaven/src
RUN git clone -b $version https://github.com/ptitbob/docker-multi-stage-java.git app
RUN mvn -f /usr/src/mymaven/app/server/pom.xml clean package


FROM openjdk:8u131-jre-alpine
WORKDIR /root/
ARG version
ENV version ${version:-1.0}
ENV JAR_BUILDED  /usr/src/mymaven/app/server/target/demo-$version.jar
ENV TARGET demo-$version.jar
COPY --from=builder $JAR_BUILDED /root/
CMD java -jar $TARGET
