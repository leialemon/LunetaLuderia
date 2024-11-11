#!/bin/bash

nome="teste"
senha=$nome

docker run --name $nome -e POSTGRES_PASSWORD=$senha -d postgres:latest 

echo "Criando o container..."
sleep 5

docker exec -i $nome psql -U postgres -c "CREATE USER luderiajogos WITH PASSWORD 'luderia';"
docker exec -i $nome psql -U postgres -c "ALTER ROLE luderiajogos CREATEDB;"
docker exec -i $nome psql postgres -U luderiajogos -c "CREATE DATABASE luderiajogos;"

docker exec -i $nome psql -U postgres -c "CREATE USER luderiapessoas WITH PASSWORD 'luderia';"
docker exec -i $nome psql -U postgres -c "ALTER ROLE luderiapessoas CREATEDB;"
docker exec -i $nome psql postgres -U luderiapessoas -c "CREATE DATABASE luderiapessoas;"

docker exec -i $nome psql -U postgres -c "CREATE USER luderiaalugueis WITH PASSWORD 'luderia';"
docker exec -i $nome psql -U postgres -c "ALTER ROLE luderiaalugueis CREATEDB;"
docker exec -i $nome psql postgres -U luderiaalugueis -c "CREATE DATABASE luderiaalugueis;"

exit
