## Cria Jar do projeto ##
mvn clean install package

## Executa criação da imagem Docker ##
docker rm fmba-backend-user --force
docker-compose up