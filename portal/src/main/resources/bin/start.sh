#启动脚本
#!/bin/bash

#当前目录应该是bin（这样就一定不会是/），否则不能往上走
CURRENT_DIR=`pwd`
BIN_DIR=`pwd |awk -F "/" '{print $NF}'`
if [ $BIN_DIR != "bin" ]; then
	echo "当前目录为$CURRENT_DIR，不为bin，app部署有误"
	exit 1
fi
BIN_DIR=`pwd`

#向上一层，应该有conf，lib
cd ..
APP_DIR=`pwd`
if [ ! -d conf ]; then
    echo "部署目录下没有文件夹conf，app部署有误，部署目录为$APP_DIR"
    exit 2
fi
cd conf
CONF_DIR=`pwd`
cd ..
if [ ! -d lib ]; then
    echo "部署目录下没有文件夹lib，app部署有误，部署目录为$APP_DIR"
    exit 3
fi
cd lib
LIB_DIR=`pwd`

#有java命令可用
if [ -z `which java` ]; then
    echo "系统中没有java命令可用"
    exit 4
fi

#classpath中加上conf
#凑出lib下的jar包为classpath
CLASSPATH=../conf/
for i in *.jar
do
    CLASSPATH="$CLASSPATH":"$i"
done

#执行java命令
nohup java -classpath $CLASSPATH org.dracula.ht2017g8.portal.MainApp &
