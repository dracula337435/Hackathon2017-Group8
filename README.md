# 2017黑客松用，项目骨架，适当取舍


## 要生成docker镜像
解开zip包，在Dockerfile一级，执行
```
sudo docker build -t <镜像全名> .
```
如
```
sudo docker build -t ht2017g8-portal .
```

## 要启动时，执行
```
docker run -d -p <host中要暴露的端口>:10080 <镜像全名>
```
如
```
docker run -d -p 10080:10080 ht2017g8-portal
```

## 使用的主要技术
### linux中用的启动脚本
### maven
jar，assembly插件配合，最终生成bin，conf和lib三个文件夹。
多了abstact和concrete两个pom，分别被接口模块和非接口模块继承，以方便为非接口模块单独设置filter，测试，assembly
### spring系列
spring-boot
starter-web
### swagger
### docker
包含dockerfile
