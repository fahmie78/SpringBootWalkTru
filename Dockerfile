FROM azul/zulu-openjdk:17.0.4.1-jre
ADD build/libs/SpringBootWalkTru-1.0.0.jar /opt/app/
EXPOSE 80
CMD java -jar /opt/app/SpringBootWalkTru-1.0.0.jar