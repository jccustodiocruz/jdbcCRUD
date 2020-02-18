package Entidades;

public class Barco {

    private int idBarco;
    private int idSocio;
    private String nombreBarco;
    private int numAmarre;
    private int cuotaAmarre;

    public Barco() {

    }

    public Barco(int idBarco, int idSocio, String nombreBarco, int numAmarre, int cuotaAmarre) {
        this.idBarco = idBarco;
        this.idSocio = idSocio;
        this.nombreBarco = nombreBarco;
        this.numAmarre = numAmarre;
        this.cuotaAmarre = cuotaAmarre;
    }

    public int getIdBarco() {
        return idBarco;
    }

    public void setIdBarco(int idBarco) {
        this.idBarco = idBarco;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getNombreBarco() {
        return nombreBarco;
    }

    public void setNombreBarco(String nombreBarco) {
        this.nombreBarco = nombreBarco;
    }

    public int getNumAmarre() {
        return numAmarre;
    }

    public void setNumAmarre(int numAmarre) {
        this.numAmarre = numAmarre;
    }

    public int getCuotaAmarre() {
        return cuotaAmarre;
    }

    public void setCuotaAmarre(int cuotaAmarre) {
        this.cuotaAmarre = cuotaAmarre;
    }

}
