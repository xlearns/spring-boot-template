rm -rf target
mvn package
last_part=$(pwd | awk -F/ '{print $NF}')
java -jar "./target/$last_part-0.0.1-SNAPSHOT.jar" --spring.profiles.active=prod