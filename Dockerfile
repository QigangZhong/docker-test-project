# 以官方的maven镜像做基础镜像
FROM maven:3.6.1-jdk-8 as base
WORKDIR /app
COPY . .
RUN set -ex && mvn clean package -Dmaven.test.skip=true
EXPOSE 9090
RUN ["chmod","+x","/app/start.sh"]
ENTRYPOINT ["sh","/app/start.sh"]
# 给entrypoint.sh添加默认参数，之后运行的时候可以传递环境变量dev/qa/prod
CMD []