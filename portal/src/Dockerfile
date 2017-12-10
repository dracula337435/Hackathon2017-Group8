# 以java为基准
FROM java:8
#
MAINTAINER dracula-kang
#
COPY conf /HT2017G8/app/portal/conf
COPY bin /HT2017G8/app/portal/bin
COPY lib /HT2017G8/app/portal/lib
EXPOSE 10080
#
CMD ["sh", "/HT2017G8/app/portal/bin/start.sh"]
