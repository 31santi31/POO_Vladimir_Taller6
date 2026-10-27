package parqueadero.modelo;

public class Puesto {
    private int numero;
    private String placa; // null si está libre

    // Sin public: solo visible dentro de parqueadero.modelo
    Puesto(int numero) {
        this.numero = numero;
        this.placa = null;
    }

    public int getNumero() {
        return numero;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean estaLibre() {
        return placa == null;
    }

    public void ocupar(String placa) {
        this.placa = placa;
    }

    public void liberar() {
        this.placa = null;
    }
}