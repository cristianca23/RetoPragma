  @pruebaTecnica
  Feature:Registro y compra de articulos en la pagina Store
    Se espera que el usuario pueda realizar diferentes compras de articulos
    ademas tambien se espera que el usuario pueda comunicarse con soporte en
    caso de que tenga algún inconveniente en la compra


    Background:
      Given Juan quiere ingresar a Store

    @Escenario1-Login
    Scenario Outline:

      When el usuario ingresa a la parte de iniciar sesion ingresa "<correo>" y "<contrasena>"
      Then Debe ver el mensaje de bienvenida "<mensaje>"

      Examples:
      |correo| contrasena| mensaje |
      |correopruebapragma| Demo123| Welcome correopruebapragma|



    @Escenario2-AgregarCelular
      Scenario Outline:
      Given el usuario ingresa a la parte de iniciar sesion ingresa "<correo>" y "<contrasena>"
      When el usuario selecciona un celular
      Then el usuario ve seleccionado el "<producto>" en el carrito de compras
      #Verificar la aserción de este escneario
      Examples:
      |correo| contrasena| producto |
      |correopruebapragma| Demo123      |Iphone 6 32gb |

    @Escenario3-Contacto
    Scenario Outline:
      When Juan Ingresa al formulario de contacto y llena los datos "<email>" "<nombre>" y "<mensaje>"
      Then debe salir un mensaje de agradecimiento por el "<contacto>"
    Examples:
      |email|nombre|mensaje|contacto|
      |prueba|Juan |Hola!  | Thanks for the message!!|

    @Escenario4-AgregarMonitores

    Scenario Outline:
      Given el usuario ingresa a la parte de iniciar sesion ingresa "<correo>" y "<contrasena>"
      When el usuario selecciona dos Monitores
      Then el usuario ve seleccionado el producto en el carrito de compras y su costo
      |producto | valor|
      |<producto> | <valor>|
      Examples:
        |correo| contrasena| producto | valor |
        |correopruebapragma| Demo123      |    Apple monitor 24 | 400 |

    @Escenario5-AgregarLaptops

    Scenario Outline:
      Given el usuario ingresa a la parte de iniciar sesion ingresa "<correo>" y "<contrasena>"
      When el usuario selecciona una Laptop
      Then ve el producto agregado con el mensaje "<mensaje>"
      #Verificar la aserción de este escneario
      Examples:
        |correo| contrasena| mensaje |
        |correopruebapragma| Demo123      |	MacBook air |

    @Escenario6-CarritoDeCompras
    Scenario Outline:
      Given el usuario ingresa a la parte de iniciar sesion ingresa "<correo>" y "<contrasena>"
      Then ingresa al carrito y ingresa los datos "<nombre>" "<pais>" "<ciudad>" "<tarjeta>" "<mes>" "<ano>"
      Then Debe ver un dialogo que indica "<compra>"

    Examples:
      |correo | contrasena |nombre|pais|ciudad|tarjeta|mes|ano|compra|
      |correopruebapragma|Demo123|Juan  |Colombia|Cali|4111111|02|27 |  Thank you for your purchase!   |

    @Escenario7-AgregarDiferentesProductos
    Scenario Outline:
      Given el usuario ingresa a la parte de iniciar sesion ingresa "<correo>" y "<contrasena>"
      When el usuario selecciona 3 productos
      Then ingresa al carrito y ingresa los datos "<nombre>" "<pais>" "<ciudad>" "<tarjeta>" "<mes>" "<ano>"
      Then Debe ver un dialogo que indica "<compra>"

      Examples:
        |correo | contrasena |nombre|pais|ciudad|tarjeta|mes|ano|compra|
        |correopruebapragma|Demo123|Juan  |Colombia|Cali|4111111|02|27 |  Thank you for your purchase!   |




