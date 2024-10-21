# Conversor-monedas - JAVA MVC

Este proyecto es una aplicación de consola que permite convertir diferentes monedas utilizando las tasas de cambio en tiempo real obtenidas de una API externa. La aplicación sigue el patrón de diseño Modelo-Vista-Controlador (MVC), asegurando una clara separación de responsabilidades y facilitando la mantenibilidad y escalabilidad del código.

## Descripción del Proyecto
El Conversor de Moneda es una herramienta simple que facilita la conversión entre diferentes monedas, utilizando tasas de cambio actualizadas en tiempo real desde la API de ExchangeRate. La aplicación ofrece una interfaz de usuario por consola y permite realizar las conversiones entre las siguientes monedas:

Dólar estadounidense (USD) ⇆ Peso argentino (ARS)
Dólar estadounidense (USD) ⇆ Real brasileño (BRL)
Dólar estadounidense (USD) ⇆ Peso colombiano (COP)
El programa está implementado en Java puro, sin frameworks externos, y utiliza la biblioteca HttpClient para realizar solicitudes HTTP y Gson para procesar las respuestas en formato JSON de la API.

## Funcionalidades
Convertir entre diferentes monedas en tiempo real.
Obtener y mostrar tasas de cambio actualizadas usando la API.
Interfaz de usuario por consola que presenta un menú sencillo y fácil de usar.
Manejo de excepciones y errores de manera eficiente.
Uso del patrón Modelo-Vista-Controlador (MVC) para una clara separación de responsabilidades.

## Estructura del Proyecto
El proyecto sigue el patrón MVC con los siguientes paquetes:

model: Contiene la lógica de negocio y la integración con la API de tasas de cambio.
view: Contiene la interfaz de usuario que interactúa con el usuario final (en este caso, la consola).
controller: Orquesta la interacción entre el modelo y la vista, manejando el flujo de la aplicación.
exceptions: Contiene las excepciones personalizadas para el manejo de errores específicos del proyecto.

## Tecnología Utilizada
Java: Lenguaje principal del proyecto.
HttpClient: Utilizado para realizar las solicitudes HTTP a la API de tasas de cambio.
Gson: Utilizado para parsear las respuestas JSON de la API.
MVC Pattern: Patrón de diseño utilizado para estructurar la aplicación.
