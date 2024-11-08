#!/bin/bash

nome="luderia"
senha=$nome

docker run --name $nome -e POSTGRES_PASSWORD=$senha,POSTGRES_USER=$usuario -d postgres:latest 

docker exec -ti luderia psql -U postgres -W
