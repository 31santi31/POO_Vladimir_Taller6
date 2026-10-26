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

• Puesto: numero (int) y placa (String, null si está libre). Constructor (numero) sin public. Métodos
getNumero(), getPlaca(), estaLibre(), ocupar(String placa) y liberar().

• Parqueadero: nombre (String) y puestos (ArrayList<Puesto>). El constructor (nombre, int cantidad) crea los
puestos numerados de 1 a cantidad. Un atributo static ingresosTotales cuenta los vehículos que han entrado
a cualquier parqueadero, con su método static getIngresosTotales().

• ingresar(String placa): si la placa ya está adentro imprime <placa> ya está adentro; si no, ocupa el
primer puesto libre, suma un ingreso e imprime <placa> en puesto <n>; si no hay puestos libres imprime
<placa>: parqueadero lleno.

• salir(String placa): libera el puesto de esa placa y devuelve true, o devuelve false si no está.
puestosLibres(): devuelve cuántos puestos están libres.

• Main: crea Centro con 2 puestos y Norte con 3. En Centro ingresan ABC123, ABC123, XYZ789 y JKL456. Imprime
centro.salir("ABC123"). Ingresa JKL456 en Centro y MNO321 en Norte. Imprime los puestos libres de
Centro y de Norte, y Parqueadero.getIngresosTotales().

• Diagrama de clases de Parqueadero y Puesto en draw.io (composición con multiplicidad, static subrayado y
paquete), en PNG.
