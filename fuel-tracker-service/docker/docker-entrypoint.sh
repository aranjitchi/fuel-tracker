#!/bin/sh

echo "Using JVM configuration [ $JAVA_OPTS ]"
echo "Running JAR with args [ $RUN_ARGS ]"

IMAGE_OPTS="-Dsun.misc.URLClassPath.disableJarChecking=true -Djava.security.egd=file:/dev/./urandom"
JVM="$JAVA_OPTS $IMAGE_OPTS"

java $JVM -jar $JARFILE $RUN_ARGS $@

exec "$@"