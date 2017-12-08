#启动脚本
#!/bin/bash

#之前用pwd，造成只能在bin目录下操作。现在改用pwd+sh后的参数，得到完整的脚本路径，再继续
SCRIPT_PATH="`pwd`/$0"
SCRIPT_DIR=`dirname $SCRIPT_PATH`

#当前目录应该是bin（这样就一定不会是/），否则不能往上走
BIN_DIR=`echo $SCRIPT_DIR |awk -F "/" '{print $NF}'`
if [ $BIN_DIR != "bin" ]; then
	echo "启动脚本所在目录为$SCRIPT_DIR，不为bin，app部署有误"
	exit 1
fi
BIN_DIR=$SCRIPT_DIR

#向上一层，应该有conf，lib
APP_DIR="$BIN_DIR/.."
CONF_DIR="$APP_DIR/conf"
if [ ! -d "$CONF_DIR" ]; then
    echo "部署目录下没有文件夹conf，app部署有误，部署目录为$APP_DIR"
    exit 2
fi
LIB_DIR="$APP_DIR/lib"
if [ ! -d "$LIB_DIR" ]; then
    echo "部署目录下没有文件夹lib，app部署有误，部署目录为$APP_DIR"
    exit 3
fi

#有java命令可用
if [ -z `which java` ]; then
    echo "系统中没有java命令可用"
    exit 4
fi

#classpath中加上conf
#凑出lib下的jar包为classpath
CLASSPATH="$CONF_DIR/"
for i in $LIB_DIR/*.jar
do
    CLASSPATH="$CLASSPATH":"$i"
done

#执行java命令
nohup java -classpath $CLASSPATH org.dracula.ht2017g8.MainApp &

#为方便停止，记录pid
echo $! > "$BIN_DIR/pid"
