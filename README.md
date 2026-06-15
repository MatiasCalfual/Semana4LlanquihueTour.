<p>
  <img src="https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png" width="300"/>
</p>

#  LlanquihueTour

## Autor del Proyecto
- **Nombre completo:** Matias Fernando Calfual Pérez
- **Carerra:** Analista programador 
- **Sede:** Duoc UC online


## Descripción del Proyecto 

Este proyecto nace para resolver un problema cotidiano de la agencia **Llanquihue Tour**: organizar sus excursiones y mostrárselas a los clientes según lo que prefieran. 

En lugar de revisar una lista a mano, creé un sistema automático en Java que hace todo el trabajo en **4 pasos muy simples**:

1. **El Archivo de Datos (`tours.txt`):** Es un bloc de notas común donde se guardan los paseos. Para que la computadora no se confunda, se separan los datos con un punto y coma `;` (por ejemplo: `Nombre;Tipo;Precio`).
2. **La Plantilla del Tour (`Tour.java`):** Le enseñamos a la computadora qué es un "Tour" en la vida real, creando una estructura que guarda de forma ordenada su nombre, su categoría y su costo.
3. **El Lector Inteligente (`GestorDatos.java`):** Es el motor del programa. Va al archivo de texto, lo lee línea por línea, "corta" el texto donde encuentra los puntos y comas con la herramienta `.split(";")`, y guarda todos los tours juntos dentro de una lista digital (`ArrayList`).
4. **El Panel de Control (`Main.java`):** Es lo que ve el usuario. Desde aquí le damos órdenes al sistema para que haga tres cosas:
   * Mostrar el catálogo completo de corrido.
   * Filtrar y mostrar **solo** los tours de tipo *"gastronómico"*.
   * Filtrar y mostrar **solo** los tours que superen un presupuesto específico (ej: más de *$20.000*).

Al final, logramos un programa que **lee una lista externa, la entiende, la organiza en la memoria y permite buscar información al instante**.

## Estructura de carpetas
El proyecto está estructurado siguiendo la separación de responsabilidades a través de paquetes específicos:

```text
src/
├── model/
│   └── Tour.java          # Clase de modelo con atributos, constructores, getters, setters y toString
├── data/
│   └── GestorDatos.java    # Lógica de lectura secuencial del archivo .txt, uso de split() y carga del ArrayList
└── ui/
    └── Main.java          # Interfaz de usuario por consola que ejecuta los recorridos y filtros solicitados
resources/
└── tours.txt              # Archivo de texto plano con los registros separados por punto y coma (;)
```
## Instrucciones para ejecutar el proyecto

1. **Descarga el código**
   - 
   

