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

''' Maven Command Line to build and upload the image JIB in Docker Hub
mvn compile jib:build
