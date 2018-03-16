FROM openjdk:8-jdk-alpine
MAINTAINER aranjitchi@gmail.com

ENV HOME /var/lib/sac
ENV JARFILE /var/lib/sac/app.jar
ENV JAVA_OPTS -Xms128m -Xmx1024m

VOLUME /var/lib/sac
VOLUME /var/lib/sac/data

ADD fuel-tracker-service.jar /var/lib/sac/app.jar

RUN chmod 500 /var/lib/sac/app.jar

ADD docker-entrypoint.sh /entrypoint.sh

RUN chmod 500 entrypoint.sh

ENTRYPOINT ["/entrypoint.sh"]