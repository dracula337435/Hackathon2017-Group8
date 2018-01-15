#停止脚本
#!/bin/bash

#脚本所在目录
SCRIPT_PATH="`pwd`/$0"
SCRIPT_DIR=`dirname $SCRIPT_PATH`

#找启动时的pid文件
PID_PATH="$SCRIPT_DIR/pid"
if [ ! -e $PID_PATH ]; then
    echo "找不到和脚本同目录下的pid文件，无法终止。脚本所在目录为$SCRIPT_DIR"
    exit 1
fi

kill -9 `cat $PID_PATH`