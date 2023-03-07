FROM swaggerapi/swagger-ui:latest
MAINTAINER ITAcademy

ADD /product-service/spec/product-service.yaml /usr/share/nginx/html/doc/product-service.yaml
ADD /user-service/spec/user-service.yaml /usr/share/nginx/html/doc/user-service.yaml

ENV URLS="[{ url: 'doc/product-service.yaml', name: 'Product'},{ url: 'doc/user-service.yaml', name: 'User'},]"
ENV URLS_PRIMARY_NAME="User"