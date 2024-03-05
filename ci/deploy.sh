#!/bin/bash

echo "Creating Docker Container from Data-App SFTP repo..."
sudo docker build -f Dockerfile -t rdlabengpa/ids_be_data_app_sftp:develop .
cd ..
echo "Data-App SFTP is ready"
echo "Starting deployment to Docker Hub"
sudo docker login -u ${DOCKER_USER} -p ${DOCKER_PASSWORD}
sudo docker push rdlabengpa/ids_be_data_app_sftp:develop
echo "Data-App deployed to Docker Hub"
