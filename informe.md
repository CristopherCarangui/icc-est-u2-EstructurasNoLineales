# Informe

# Práctica: Ejercicios de logica con estructuras lineales: arboles

- **Nombre:**  Cristopher Carangui
- **Curso:** Estructura de Datos
- **Fecha:** 23/06/2026

---

## 1. Descripcion
Esta práctica consta de 4 ejercicios, cada uno con mayor complejidad. Nos ayudó a profundizar en el tema de árboles visto en clases, descubriendo diferentes formas de imprimirlos y utilizando métodos como BinaryTree, colas y pilas.


## Ejercicio1
## Descripción:
En este ejercicio trabajamos con una lista de enteros. Se reconoce la raíz (root), que empieza en 5, y a partir de ella se van insertando los hijos según la condición: si el número es menor va a la izquierda, si es mayor va a la derecha. El método de impresión organiza el árbol mostrando la raíz y el nivel de cada nodo, siguiendo el orden de mayor o menor.
## Ejercicio2
## Descripción:
Aquí se pide invertir un árbol. Igual que en el ejercicio anterior, se parte de una lista de enteros y se construye el árbol ordenado. Luego, mediante un método de inversión, las ramas que estaban a la izquierda pasan a la derecha y viceversa. Esto se logra reasignando los valores de cada nodo.
## Ejercicio3
## Descripción:
Este ejercicio fue más complejo: se pide construir una lista enlazada con nodos por nivel. Para resolverlo, primero se implementa una lista con los números, luego se utiliza una cola (FIFO) y un bucle while para añadir la raíz. Después, con un bucle for, se recorre el tamaño de la cola y se van agregando los nodos a la izquierda o derecha según corresponda. Finalmente, con un método de impresión se muestra cómo se recorrió cada nodo y el nivel del árbol.
## Ejercicio4
## Descripción:
En este ejercicio se reutilizó código visto en clases. Se trabajó con la clase BinaryTree, que ya tenía implementado un método para calcular la profundidad de un árbol. Esto permitió aplicar directamente la lógica sin necesidad de rehacer todo el código.
## Tabla de evidencias requeridas
| Ejercicio| Evidencia de Codigo | Evidencia de consola | Observacion|                                                                                                                         |
| ----------------: | -------------------------: | ---------------------: | -------------------- | ------------------------------------------------------------------------------------------------------------------------------------ |
|            Ejercicio1:Insertar en BST|                     ![alt text](image.png)|              ![alt text](image-4.png)| Se obtiene el resultado requerido                                                          |
|            Ejercicio2: Invertir arbol binario|                    ![alt text](image-1.png)|                ![alt text](image-5.png) |Se obtiene el arbol original y el arbol invertido                                       |
|           Ejercicio3: Listar niveles|                  ![alt text](image-2.png)|                ![alt text](image-6.png)|Se imprime exactamente como se pide |
Ejercicio4: Profundidad maxima |        ![alt text](image-3.png)             |         ![alt text](image-7.png)                      |  Se reconoce la profundiad del arbol|

## Salida en consola
![alt text](image-8.png)




