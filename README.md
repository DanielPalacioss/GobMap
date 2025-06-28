# GobMap
App web de mapa de la Gobernación de Antioquia


conf:

properties.yml:

Agregar las variables de entorno siguientes, ya sea en las configuraciones de environments de intelliJ o en un .env: USERNAME_DB, PASSWORD_DB, NAME_DB y GOBMAP_SERVICE_PORT

Se agregaran a las configuraciones de postgres y el puerto en que se expondran los endpoint del micro servicio.

Aparte de eso se debe crear un .env con todas las variables necesarias para que funcione la app en nuestro local a nivel del docker-compose para que se cojan las environment al levantar el compose.