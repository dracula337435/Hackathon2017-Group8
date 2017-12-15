#
FROM java:8
#
MAINTAINER dracula-kang
#
COPY portal/target/*.zip /HT2017G8/zip/
RUN unzip /HT2017G8/zip/*.zip -d /HT2017G8/app/
RUN rm -r /HT2017G8/zip
#
CMD ["sh", "/HT2017G8/app/HT2017G8-portal-0.0.1-SNAPSHOT/bin/start.sh"]
