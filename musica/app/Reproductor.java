package musica.app;

import java.util.ArrayList;
import musica.modelo.Cancion;
import musica.modelo.Playlist;

public class Reproductor {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Lluvia en Manizales", "Nevado", 200);
        Cancion c2 = new Cancion("Bajo el guadual", "Café Trío", 245);
        Cancion c3 = new Cancion("Noche en Chipre", "Nevado", 185);

        Playlist fav = new Playlist("Favoritas");
        fav.agregar(c1);
        fav.agregar(c2);
        fav.agregar(c3);

        System.out.println(fav.agregar(c1));
        fav.mostrar();
        System.out.println("Duración total: " + fav.duracionTotal() + " s");

        // Etapa 3
        Playlist viaje = new Playlist("Viaje");
        viaje.agregar(c1);
        viaje.agregar(c2);

        System.out.println(fav.eliminarArtista("Nevado"));
        fav.mostrar();
        viaje.mostrar();

        System.out.println(fav.buscar("bajo el guadual").getArtista());
        System.out.println(fav.buscar("Lluvia en Manizales"));
        
        
        Cancion c4 = new Cancion("Río Chinchiná", "Nevado", 230);
        System.out.println(viaje.agregar(c4));
        // Reto 2
        System.out.println(viaje.cancionMasLarga().getTitulo());
        Playlist vacia = new Playlist("Vacía");
        System.out.println(vacia.cancionMasLarga());

        // Reto 3
        ArrayList<Cancion> copia = viaje.getCanciones();
        System.out.println("Copia: " + copia.size());
        copia.clear();
        System.out.println("Copia tras clear: " + copia.size());
        System.out.println("Viaje: " + viaje.getCanciones().size());

        // Reto 1 (al final, porque lanza excepción y detiene el programa)
        viaje.eliminarArtistaForEach("Nevado");
    }
}