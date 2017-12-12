#!/bin/bash

DOCKER_IMAGE_VERSION="0.1.0001"
DOCKER_IMAGE_NAME="ht2017g8-portal"

sudo echo "[INFO] 使用超级用户权限"

echo "[INFO] 目前docker中的容器情况"
sudo docker ps -a

echo "[INFO] 使用$DOCKER_IMAGE_NAME系列镜像的容器id如下"
sudo docker ps -a | grep $DOCKER_IMAGE_NAME | awk '{print $1 }'
echo "[INFO] 记录上述信息到临时文件中"
sudo docker ps -a | grep $DOCKER_IMAGE_NAME | awk '{print $1 }' > old_container_id.tmp

echo "[INFO] 逐个停止上述容器"
cat old_container_id.tmp | xargs echo "sudo docker stop"
cat old_container_id.tmp | xargs sudo docker stop

#echo "[INFO] 暂不删除旧容器"
echo "[INFO] 删除旧容器"
cat old_container_id.tmp | xargs echo "sudo docker rm"
cat old_container_id.tmp | xargs sudo docker rm

echo "[INFO] 删除临时文件"
rm old_container_id.tmp

echo "[INFO] 目前docker中的镜像情况"
sudo docker images

echo "[INFO] $DOCKER_IMAGE_NAME镜像的id如下"
sudo docker images | grep $DOCKER_IMAGE_NAME | awk '{print $3 }'
echo "[INFO] 记录上述信息到临时文件中"
sudo docker images | grep $DOCKER_IMAGE_NAME | awk '{print $3 }' > old_image_id.tmp

#echo "[INFO] 暂不删除旧镜像"
echo "[INFO] 删除旧镜像"
cat old_image_id.tmp | xargs echo "sudo docker rmi"
cat old_image_id.tmp | xargs sudo docker rmi

echo "[INFO] 删除临时文件"
rm old_image_id.tmp

echo "[INFO] 制作新镜像"
DOCKER_IMAGE_FULL_NAME=$DOCKER_IMAGE_NAME:$DOCKER_IMAGE_VERSION
echo $DOCKER_IMAGE_FULL_NAME
echo "[INFO] 新镜像全名"
sudo docker build -t $DOCKER_IMAGE_FULL_NAME .
echo "[INFO] 用上述镜像启动容器"
sudo docker run -d -p 20080:9080 $DOCKER_IMAGE_FULL_NAME
