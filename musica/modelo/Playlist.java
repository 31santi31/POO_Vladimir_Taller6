package musica.modelo;

import java.util.ArrayList;

public class Playlist {
    private String nombre;
    private ArrayList<Cancion> canciones;

    public Playlist(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public static final int MAX_CANCIONES = 3;

public boolean agregar(Cancion cancion) {
    if (cancion == null || canciones.size() >= MAX_CANCIONES
            || canciones.contains(cancion)) {
        return false;
    }
    canciones.add(cancion);
    return true;
}

    public void mostrar() {
        System.out.println(nombre + ":");
        int numero = 1;
        for (Cancion c : canciones) {
            System.out.println(numero + ". " + c.getTitulo() + " - "
                    + c.getArtista() + " (" + c.getDuracion() + "s)");
            numero++;
        }
    }

    public int duracionTotal() {
        int total = 0;
        for (Cancion c : canciones) {
            total += c.getDuracion();
        }
        return total;
    }

    public Cancion buscar(String titulo) {
    for (Cancion c : canciones) {
        if (c.getTitulo().equalsIgnoreCase(titulo)) {
            return c;
        }
    }
    return null;
}

public int eliminarArtista(String artista) {
    int eliminadas = 0;
    for (int i = canciones.size() - 1; i >= 0; i--) {
        if (canciones.get(i).getArtista().equals(artista)) {
            canciones.remove(i);
            eliminadas++;
        }
    }
    return eliminadas;
}

// Reto 1: versión incorrecta a propósito
public int eliminarArtistaForEach(String artista) {
    int eliminadas = 0;
    for (Cancion c : canciones) {
        if (c.getArtista().equals(artista)) {
            canciones.remove(c);   // modifica la lista mientras se recorre
            eliminadas++;
        }
    }
    return eliminadas;
}

// Reto 2
public Cancion cancionMasLarga() {
    if (canciones.isEmpty()) {
        return null;
    }
    Cancion masLarga = canciones.get(0);
    for (Cancion c : canciones) {
        if (c.getDuracion() > masLarga.getDuracion()) {
            masLarga = c;
        }
    }
    return masLarga;
}

// Reto 3
public ArrayList<Cancion> getCanciones() {
    return new ArrayList<>(canciones);
}
}