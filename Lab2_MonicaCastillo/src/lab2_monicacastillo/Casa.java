/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_monicacastillo;

/**
 *
 * @author Monica
 */
public class Casa {

    private int numcasa;
    private int numbloque;
    private String color;
    private double ancho;
    private double largo;
    private String vendida;
    private int numpisos;
    private int numbaños;
    private int numcuartos;
    private String dueño;
    private String estado;
    private String ingeniero;

    public Casa() {
    } // Fin Casa Constructor

    public Casa(int numcasa, int numbloque, String color, double ancho, double largo, String vendida, int numpisos, int numbaños, int numcuartos, String dueño, String estado, String ingeniero) {
        this.numcasa = numcasa;
        this.numbloque = numbloque;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.vendida = vendida;
        this.numpisos = numpisos;
        this.numbaños = numbaños;
        this.numcuartos = numcuartos;
        this.dueño = dueño;
        this.estado = estado;
        this.ingeniero = ingeniero;
    } // Fin Casa Constructor

    public int getNumcasa() {
        return numcasa;
    }

    public void setNumcasa(int numcasa) {
        this.numcasa = numcasa;
    }

    public int getNumbloque() {
        return numbloque;
    }

    public void setNumbloque(int numbloque) {
        this.numbloque = numbloque;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getVendida() {
        return vendida;
    }

    public void setVendida(String vendida) {
        this.vendida = vendida;
    }

    public int getNumpisos() {
        return numpisos;
    }

    public void setNumpisos(int numpisos) {
        this.numpisos = numpisos;
    }

    public int getNumbaños() {
        return numbaños;
    }

    public void setNumbaños(int numbaños) {
        this.numbaños = numbaños;
    }

    public int getNumcuartos() {
        return numcuartos;
    }

    public void setNumcuartos(int numcuartos) {
        this.numcuartos = numcuartos;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIngeniero() {
        return ingeniero;
    }

    public void setIngeniero(String ingeniero) {
        this.ingeniero = ingeniero;
    }

    @Override
    public String toString() {
        return "Numero de casa: " + numcasa + ", Numero de bloque: " + numbloque + ", Color: " + color + ", Ancho: " + ancho + ", Largo: " + largo + ", Fue vendida o no: " + vendida + ", Numero de pisos: " + numpisos + ", Numero de baños: " + numbaños + ", Numero de Cuartos: " + numcuartos + ", Nombre del dueño: " + dueño + ", Estado: " + estado + ", Nombre del Ingeniero: " + ingeniero;
    } // Fin To String

} // Fin Casa
