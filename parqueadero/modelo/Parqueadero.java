package parqueadero.modelo;

import java.util.ArrayList;

public class Parqueadero {
    private String nombre;
    private ArrayList<Puesto> puestos;
    private static int ingresosTotales = 0;

    public Parqueadero(String nombre, int cantidad) {
        this.nombre = nombre;
        this.puestos = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            puestos.add(new Puesto(i));
        }
    }

    public static int getIngresosTotales() {
        return ingresosTotales;
    }

    private Puesto buscarPuesto(String placa) {
        for (Puesto p : puestos) {
            if (!p.estaLibre() && p.getPlaca().equals(placa)) {
                return p;
            }
        }
        return null;
    }

    public void ingresar(String placa) {
        if (buscarPuesto(placa) != null) {
            System.out.println(placa + " ya está adentro");
            return;
        }
        for (Puesto p : puestos) {
            if (p.estaLibre()) {
                p.ocupar(placa);
                ingresosTotales++;
                System.out.println(placa + " en puesto " + p.getNumero());
                return;
            }
        }
        System.out.println(placa + ": parqueadero lleno");
    }

    public boolean salir(String placa) {
        Puesto p = buscarPuesto(placa);
        if (p == null) {
            return false;
        }
        p.liberar();
        return true;
    }

    public int puestosLibres() {
        int libres = 0;
        for (Puesto p : puestos) {
            if (p.estaLibre()) {
                libres++;
            }
        }
        return libres;
    }
}