#Autor: Hector Duran
        @stories
        Feature: Registro de usuario en Utest.com
        @scenario1
        Scenario: Registro de Hector en la pagina Utest.com
          Given Hector desea registrarse en Utest.com
          When el usuario ingresa los datos requeridos por el sistema
            | nombre | apellido  | email            | mesNacimiento | diaNacimiento | anoNacimiento | idioma  | ciudad             | zip   | pais   | celular | modelo      | sistemaOperativo | contrasena    |
            | Hector | Duran     | hector2@gmail.com | January       | 28            | 1993          | Spanish | Panama City Panama | 00000 | Panama | Huawei  | Poco F2 Pro | Android 10       |  Hector12345# |
          Then el registro muestra la notificacion de completado la configuracion en pantalla
            | respuesta      |
            | Complete Setup |