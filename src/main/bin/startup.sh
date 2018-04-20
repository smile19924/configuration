#!/bin/bash

if [ "$JAVA_HOME" != "" ]; then
  JAVA="$JAVA_HOME"
else
  JAVA="/apps01/local/jdk1.8.0_121"
fi

export JAVA_HOME=$JAVA
export PATH=$JAVA_HOME/bin:$PATH

service=configuration-1.0.0-SNAPSHOT.jar
servicename="configuration"

JAVA_OPTS="-server -Xms4G -Xmx4G -Xss256k -XX:NewSize=2G -XX:MaxNewSize=2G -Dfile.encoding=UTF-8"
PIDS=`ps -ef | grep "${service}" | grep -v grep | awk '{print $2}'`
cd ..

case $1 in 
  'start')
        if [ "X$PIDS" != "X" ]; then
                echo "${servicename} has been started, the PID = "${PIDS}""
        else
        echo "${servicename} is startting..."
    	nohup java ${JAVA_OPTS} -jar ${service} >/dev/null 2>out.log &
        fi 
		;;
  'restart')
        if [ "X$PIDS" != "X" ]; then
                kill -9 $PIDS
                echo "${servicename} has been killed, PID="${PIDS}"!"
        fi
        echo "${servicename} is startting..."
    	nohup java ${JAVA_OPTS} -jar ${service} >/dev/null 2>out.log &
		;;
  'status')
        if [ "X$PIDS" != "X" ]; then
                echo "${servicename} has been started, the PID = "${PIDS}""
        else
           echo "${servicename} has not been started"
        fi ;;
  'stop')
        if [ "X$PIDS" != "X" ]; then
                kill -9 $PIDS
                echo "${servicename} has been killed, PID="${PIDS}"!"
        else
                echo "${servicename} has not been started, the stop command do nothing."
        fi  ;;
  *) echo "Call parameters error"
     echo "Usage:${servicename} | start | restart | stop | status"
     exit 1 ;;
esac