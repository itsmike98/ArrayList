package com.mycompany.arraylist;

public class Direccion {

    private String calle;
    private int cp;
    private String provincia;

    public Direccion() {
    }

    public Direccion(String calle, int cp, String provincia) {
        this.calle = calle;
        this.cp = cp;
        this.provincia = provincia;
    }

    public String getCalle() {
        return calle;
    }

    public int getCp() {
        return cp;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return " Calle: " + calle + " C.P.: " + cp + " Provincia: " + provincia;
    }
}
