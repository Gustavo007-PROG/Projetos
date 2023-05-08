package model;

public final class Automovel implements Cloneable {
    private String marca;
    private String modelo;
    private String tipo;

    public String getMarca() {
        return marca;
    }

    public void String setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }

    public void String setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void String setTipo(String tipo) {
        this.modelo = modelo;
    }


    public Automovel clone() throws CloneNotSupportedExcepition{
        return (Automovel) super.clone();
    }
    
}



package controller;

import model.Automovel;

public class Loja {
    public static void main(String[] args) throws CloneNotSupportedException {
        Automovel a = new Automovel();
        a.setMarca("Chevrolet");
        a.setModelo("Chevrolet");
        a.setTipo("Chevrolet");
        System.out.println("Marca: "+ a.getMarca() + "Modelo: "+ a.getModelo() + "Tipo: "+a.getTipo());
    }
}