
FROM java:8

VOLUME /tmp

ADD docker-0.0.1-SNAPSHOT.jar docker.jar

RUN bash -c 'touch /docker.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/docker.jar"]

#FROM mysql:5.7
#
#VOLUME my.cnf:/etc/mysql/my.cnf mysql
#
#ADD setup.sh /etc/mysql/setup.sh
#ADD schema.sql /etc/mysql/schema.sql
#ADD privileges.sql /etc/mysql/privileges.sql
#
#EXPOSE 3306
#ENV MYSQL_USER root
#ENV MYSQL_PASS =123456
#CMD ["sh", "/etc/mysql/setup.sh"]