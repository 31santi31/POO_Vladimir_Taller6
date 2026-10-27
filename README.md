# POO_Vladimir_Taller6
## Parte A: Playlist
### Etapa 1. Operaciones de ArrayList
1. En musica.app crea la clase PruebaLista con el main. Crea un ArrayList<String> generos y agrega
Rock, Salsa y Vallenato. Imprime el tamaño y el elemento de la posición 1.
2. Reemplaza Salsa por Merengue con set e inserta Pop al inicio con add(0, ...). Imprime la lista.
3. Elimina Rock. Imprime contains("Rock") e indexOf("Vallenato").
4. Recorre la lista con for-each e imprime cada género en mayúsculas.
Salida esperada
3
Salsa
[Pop, Rock, Merengue, Vallenato]
false
2
POP
MERENGUE
VALLENATO
<img width="326" height="168" alt="image" src="https://github.com/user-attachments/assets/961f3558-501f-4329-9d17-99b32d22012c" />

### Etapa 2. Una clase que guarda una lista 
1. En musica.modelo crea Cancion con los atributos privados titulo y artista (String) y duracion (int, en
segundos), un constructor con los tres y sus get.
2. Crea Playlist con los atributos privados nombre (String) y canciones (ArrayList<Cancion>). El constructor
recibe el nombre y crea la lista.
3. agregar(Cancion cancion): devuelve false si la canción es null o ya está en la lista; si no, la agrega y devuelve
true.
4. mostrar(): imprime <nombre>: y debajo cada canción como <n>. <titulo> - <artista> (<duracion>
s), numeradas desde 1.
5. duracionTotal(): devuelve la suma de las duraciones.
6. En musica.app crea Reproductor con el main. Crea c1 = (Lluvia en Manizales, Nevado, 200), c2 = (Bajo el
guadual, Café Trío, 245) y c3 = (Noche en Chipre, Nevado, 185). Crea la playlist Favoritas, agrega las tres e
intenta agregar c1 otra vez imprimiendo el resultado. Muéstrala e imprime su duración total.
1
Salida esperada
false
Favoritas:
1. Lluvia en Manizales - Nevado (200 s)
2. Bajo el guadual - Café Trío (245 s)
3. 630
<img width="370" height="263" alt="image" src="https://github.com/user-attachments/assets/db2e252f-3880-4e82-8483-74d35bc496d8" />

### Etapa 3. Buscar y eliminar
1. buscar(String titulo): devuelve la canción con ese título sin importar mayúsculas, o null si no está.
2. eliminarArtista(String artista): elimina todas las canciones de ese artista recorriendo con índice
desde el final y devuelve cuántas eliminó.
3. En el main crea la playlist Viaje con c1 y c2. Elimina a Nevado de Favoritas e imprime cuántas se eliminaron.
Muestra Favoritas y Viaje.
4. Imprime fav.buscar("bajo el guadual").getArtista() y fav.buscar("Lluvia en Manizales").
Salida esperada
2
Favoritas:
1. Bajo el guadual - Café Trío (245 s)
Viaje:
1. Lluvia en Manizales - Nevado (200 s)
2. Bajo el guadual - Café Trío (245 s)
Café Trío
null
<img width="342" height="246" alt="image" src="https://github.com/user-attachments/assets/3e7825e9-c591-417c-8018-9e013d6627bc" />

### Etapa 4. static
1. En Playlist agrega la constante public static final int MAX_CANCIONES = 3. agregar también
devuelve false si la lista está llena.
2. En Cancion agrega private static int totalCanciones, súmale 1 en el constructor y crea el método
static getTotalCanciones().
3. Crea c4 = (Río Chinchiná, Nevado, 230). Imprime viaje.agregar(c3) y viaje.agregar(c4). Luego imprime
Cancion.getTotalCanciones() y Playlist.MAX_CANCIONES.
4. Diagrama de clases de Cancion y Playlist en draw.io: visibilidad, agregación con multiplicidad, miembros static
subrayados y paquete. Expórtalo en PNG.
<img width="673" height="349" alt="image" src="https://github.com/user-attachments/assets/3534de5d-a1f4-431b-8c31-c6c290a37e26" />


Salida esperada
true
false
4
3

<img width="393" height="250" alt="image" src="https://github.com/user-attachments/assets/949f7e14-ab27-4dce-a0ce-d55baeac5932" />

## Parte B
Paquetes: parqueadero.modelo (Parqueadero, Puesto) y parqueadero.app (Main). Todos los atributos
privados.

1. Puesto: numero (int) y placa (String, null si está libre). Constructor (numero) sin public. Métodos
getNumero(), getPlaca(), estaLibre(), ocupar(String placa) y liberar().

2. Parqueadero: nombre (String) y puestos (ArrayList<Puesto>). El constructor (nombre, int cantidad) crea los
puestos numerados de 1 a cantidad. Un atributo static ingresosTotales cuenta los vehículos que han entrado
a cualquier parqueadero, con su método static getIngresosTotales().

3. ingresar(String placa): si la placa ya está adentro imprime <placa> ya está adentro; si no, ocupa el
primer puesto libre, suma un ingreso e imprime <placa> en puesto <n>; si no hay puestos libres imprime
<placa>: parqueadero lleno.

4. salir(String placa): libera el puesto de esa placa y devuelve true, o devuelve false si no está.
puestosLibres(): devuelve cuántos puestos están libres.

5. Main: crea Centro con 2 puestos y Norte con 3. En Centro ingresan ABC123, ABC123, XYZ789 y JKL456. Imprime
centro.salir("ABC123"). Ingresa JKL456 en Centro y MNO321 en Norte. Imprime los puestos libres de
Centro y de Norte, y Parqueadero.getIngresosTotales().

6. Diagrama de clases de Parqueadero y Puesto en draw.io (composición con multiplicidad, static subrayado y
paquete), en PNG.

<img width="1200" height="760" alt="diagrama-parqueadero" src="https://github.com/user-attachments/assets/163aff47-3b13-44bc-aec3-9b3193bbc03e" />


Salida esperada

ABC123 en puesto 1

ABC123 ya está adentro

XYZ789 en puesto 2

JKL456: parqueadero lleno

true

JKL456 en puesto 1

MNO321 en puesto 1

0

2

4


<img width="699" height="446" alt="Captura de pantalla 2026-10-26 192401" src="https://github.com/user-attachments/assets/30b16b71-10d8-44b6-9a3a-e1e92de74c50" />



## Parte C. Retos
* Escribe una versión de eliminarArtista que recorra con for-each y elimine dentro del ciclo. Úsala sobre Viaje
para eliminar a Nevado, copia la excepción y explica por qué ocurre.

Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
	at musica.modelo.Playlist.eliminarArtistaForEach(Playlist.java:66)
	at musica.app.Reproductor.main(Reproductor.java:50)

  **explicacion:** el for-each usa un iterador que, al empezar, anota cuántas modificaciones lleva la lista. canciones.remove(c) modifica la lista sin pasar por el iterador. En la siguiente vuelta, next() ve que el contador cambió y lanza ConcurrentModificationException, para avisar que recorrer y modificar a la vez da resultados poco fiables. Si en viaje solo estuvieran c1 y c2, no saltaría: al eliminar c1, el ciclo cree que ya terminó y no llama a next(). Por eso viaje necesita c4.

* Agrega a Playlist cancionMasLarga(): devuelve la canción de mayor duración, o null si la lista está vacía.

  Devuelve la canción de mayor duración, o null si la lista está vacía. Se parte de la primera canción y se compara cada una con la mayor encontrada hasta el momento.

Resultado de Reto2.java:

Bajo el guadual
null

Bajo el guadual dura 245 s, más que las otras dos (200 s y 230 s). La playlist vacía devuelve null.

* Agrega a Playlist getCanciones() que devuelva una copia de la lista. Demuestra en el main que vaciar la copia
con clear() no cambia la playlist.

Resultado de Reto3.java:

Copia: 2
Copia tras clear: 0
Viaje: 2

Explicación: new ArrayList<>(canciones) crea una lista nueva con los mismos elementos. Al hacer clear() solo se vacía la copia, y la lista interna de la playlist sigue con sus 2 canciones. Si getCanciones() devolviera la lista original, cualquiera podría modificar la playlist desde fuera y se rompería el encapsulamiento. La copia es de la lista, no de las canciones: los objetos Cancion siguen siendo los mismos.

* Intenta crear un Puesto desde parqueadero.app. Copia el error y explica qué tiene que ver con la composición

  Error copiado:

parqueadero/app/Reto4.java:7: error: Puesto(int) is not public in Puesto; cannot be accessed from outside package
        Puesto p = new Puesto(1);
                   ^
1 error

Qué tiene que ver con la composición: En la composición, el todo (Parqueadero) es dueño de sus partes (Puesto): crea los puestos y estos no tienen sentido sin él. El constructor de Puesto no tiene public, así que solo lo pueden usar las clases del mismo paquete (parqueadero.modelo). Desde parqueadero.app no se pueden crear puestos sueltos; solo Parqueadero los crea, en su constructor. Así se garantiza que cada Puesto pertenece a un parqueadero y no existe por separado.

* Predice la salida sin ejecutar y dibuja la lista y los objetos al final. Luego compruébala.

ArrayList<Cancion> lista = new ArrayList<>();
Cancion x = new Cancion("A", "Uno", 100);
lista.add(x);
lista.add(x);
lista.add(new Cancion("A", "Uno", 100));
System.out.println(lista.size());
System.out.println(lista.get(0) == lista.get(1));
System.out.println(lista.get(0) == lista.get(2));
lista.remove(x);
System.out.println(lista.size());
System.out.println(lista.contains(x));

**Línea	Predicción**

lista.size()----->	3

get(0) == get(1)----->	true

get(0) == get(2)----->	false

lista.size() tras----> remove(x)	2

lista.contains(x)---->	true

## Preguntas

1. ¿Por qué ArrayList<int> no compila y ArrayList<Integer> sí?

ArrayList<int> no compila y ArrayList<Integer> sí
Los genéricos solo aceptan clases, y int es un tipo primitivo, no una clase. Integer sí es una clase (la versión “objeto” del int), y Java convierte entre los dos solo.

2. ¿Por qué eliminar a Nevado de Favoritas no lo eliminó de Viaje? ¿Qué relación muestra eso?

Las listas no guardan copias de las canciones, guardan referencias al mismo objeto. Al eliminar c1 de Favoritas solo se borra el enlace de esa lista. El objeto sigue existiendo y Viaje todavía apunta a él. Eso muestra una agregación: las canciones viven por su cuenta y pueden estar en varias playlists.

3. ¿Qué diferencia hay entre la relación Playlist–Cancion y la relación Parqueadero–Puesto?

Las canciones se crean afuera y se agregan a la playlist, y pueden estar en varias (agregación). Los puestos los crea el propio Parqueadero y pertenecen solo a él; si el parqueadero desaparece, sus puestos también (composición).

4. ¿Por qué totalCanciones debe ser static y titulo no?

totalCanciones es static y titulo no
titulo es un dato de cada canción, así que cada objeto tiene el suyo. totalCanciones cuenta todas las canciones creadas, no es de ninguna en particular, así que hay una sola copia compartida por la clase.

5. ¿Por qué un método static no puede usar this?

Un método static no puede usar this
this es el objeto que está ejecutando el método, y un método static se puede llamar sin crear ningún objeto. Entonces no hay un “this” al que apuntar.
