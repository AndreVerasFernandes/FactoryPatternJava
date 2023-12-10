/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author veras
 */
public class Sedan implements Carro {
    private final String modelo;
    private final String fabricante;

    public Sedan(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

   
    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }
}
