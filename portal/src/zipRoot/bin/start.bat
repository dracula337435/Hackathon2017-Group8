@echo off
:: utf-8
CHCP 65001
:: 当前目录
SET APP_PATH=%~dp0..
echo 拼凑classpath中
SET CONF_PATH=%APP_PATH%\conf\
SET LIB_PATH=%APP_PATH%\lib
:: lib用了新的写法
:: 路径中防止出现空格
SET CP="%CLASSPATH%%CONF_PATH%;%LIB_PATH%\*"
:: echo 遍历lib
:: 为了解决for中的set失效
:: setlocal EnableDelayedExpansion
:: for /R %%s in (lib\*.jar) do (
::     SET CP=!CP!;%%s
:: )
::
java -noverify -cp %CP% org.dracula.ht2017g8.MainApp