# JIB JAVA IMAGE BUILDER
Project using JIB "Java Image Builder" from Google Cloud

This module contains configuration for upload image in docker repository with JIB from Google Cloud

We add the configuration in the pom section to upload the image in Docker Hub

'' Modify seeting.xml from maven to add the configuration and credentials access to the Docker Hub
<servers>
    <server>
    <id>registry.hub.docker.com</id>
        <username>username</username>
        <password>password</password>   
    </server>
</servers>

''' Maven Command Line to build and upload the image JIB in Docker Hub, 
    every time that we execute this command upload a new version on the Docker Hub
mvn compile jib:build

'' We added the phases to the execution configuration section, with this when we execute 
mvn clean package
'' we add the phase build to upload this version to Docker Hub

# To test the service we could execute the following command line
docker run -p 8080:8082 registry.hub.docker.com/mullikaricardo/spring-jib-app

// Command Line to remove local images docker
docker rmi $(docker images -q)
docker rm $(docker ps -a -q)