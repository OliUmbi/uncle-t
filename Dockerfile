FROM openjdk:21
COPY target/unclet-developement-jar-with-dependencies.jar unclet.jar
ENTRYPOINT ["java","-jar", "--enable-preview", "/unclet.jar"]
