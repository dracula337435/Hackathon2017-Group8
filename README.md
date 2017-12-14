# 2017黑客松用，项目骨架，适当取舍

## 启动

### docker 自动
`mvn package`即得zip包，解开zip包，在<zip包下项目一层>/docker一级，执行
```
sh deploy-docker.sh
```
此命令将
* 检查，停止，删除旧容器
* 检查，删除旧镜像
* 打包新的docker镜像
* 用新镜像启动新容器

### docker 手动
#### 要生成docker镜像
`mvn package`即得zip包，解开zip包，在<zip包下项目一层>一级，执行
```
sudo docker build -t <镜像全名> .
```
如
```
sudo docker build -t ht2017g8-portal .
```

#### 要启动时，执行
```
docker run -d -p <host中要暴露的端口>:10080 <镜像全名>
```
如
```
docker run -d -p 10080:10080 ht2017g8-portal
```

### 传统方式

#### ide中
主类为`org.dracula.ht2017g8.MainApp`

#### linux下启动
`mvn package`后即得zip包，如下命令启动
```
sh <zip包下项目一层>/bin/start.sh
```
如下命令停止
```
sh <zip包下项目一层>/bin/stop.sh
```
注，两个命令对`working directory`没有要求，参数定位到脚本即可

## 使用的主要技术
* linux中用的启动脚本
* maven
jar，assembly插件配合，最终生成bin，conf和lib三个文件夹。
多了abstact和concrete两个pom，分别被接口模块和非接口模块继承，以方便为非接口模块单独设置filter，测试，assembly
* spring系列
spring-boot
starter-web
spring-data-jpa
* swagger
* docker
包含dockerfile
* h2
启用h2内存数据库，提高测试效率，减少测试数据对他人影响
* kotlin
## 舍弃的技术点
* zookeeper+dubbo
