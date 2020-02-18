package Entidades;

public class Salida {

    String destino;
    String fecha;
    int horaSalida;

    public Salida() {

    }

    public Salida(String destino, String fecha, int horaSalida) {
        this.destino = destino;
        this.fecha = fecha;
        this.horaSalida = horaSalida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }
}
