package Entidades;

public class Salida {

    String destino;
    String fecha;
    int idBarco;
    int hora;

    public Salida() {

    }

    public Salida(int idBarco, String destino, String fecha, int hora) {
        this.destino = destino;
        this.fecha = fecha;
        this.idBarco = idBarco;
        this.hora = hora;
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

    public int getIdBarco() {
        return idBarco;
    }

    public void setIdBarco(int idBarco) {
        this.idBarco = idBarco;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    
}
