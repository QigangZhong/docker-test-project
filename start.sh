#!/bin/bash
echo "current env: $1"

jarfile="./docker-test-project-webapi/target/docker-test-project-webapi-1.0.0.jar"

java -Dspring.profiles.active=$1 -jar $jarfile

#case $1 in
#"dev" )
#echo "dev environment"
#java -Dspring.profiles.active=dev -jar $jarfile
#;;
#"qa" )
#echo "qa environment"
#java -Dspring.profiles.active=qa -jar $jarfile
#;;
#"prod" )
#echo "prod environment"
#java -Dspring.profiles.active=prod -jar $jarfile
#;;
#* )
#echo "defalt dev environment"
#java -Dspring.profiles.active=dev -jar $jarfile
#esac