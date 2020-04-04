FROM maven:3.6.1-amazoncorretto-11

ADD . /usr/src/mymaven
WORKDIR /usr/src/mymaven
RUN mvn clean package -DskipTests=true

CMD ["java", "-jar", "bt-backend/target/bt-backend-0.1.0.jar"]