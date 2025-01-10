 
 ### Docker do Auth-DB

  docker run --name auth-db -p 5432:5432 -e POSTGRES_DB=auth-db -e POSTGRES_USER
=maintainer -e POSTGRES_PASSWORD=elson_secret postgres:11


### Docker do Product-DB

 docker run --name auth-db -p 5432:5432 -e POSTGRES_DB=auth-db -e POSTGRES_USER
=maintainer -e POSTGRES_PASSWORD=elson_secret postgres:11