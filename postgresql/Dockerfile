FROM postgres:15.2-alpine
MAINTAINER ITAcademy

ADD /product-service/ddl/*.sql /docker-entrypoint-initdb.d/
ADD /user-service/ddl/*.sql /docker-entrypoint-initdb.d/
