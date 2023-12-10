/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author veras
 */
public class Sedan extends Carro {
    
    private boolean carroSedan;
    
    public Sedan(){}
    
    public boolean isSedan(){
        return carroSedan;
    }
    
    public void setSedan(boolean sd){
        carroSedan = sd;
    }
    
//    private final String modelo;;
//    private final String fabricante;
//
//    public Sedan(String modelo, String fabricante) {
//        this.modelo = modelo;
//        this.fabricante = fabricante;
//    }
//
//   
//    public String getModelo() {
//        return modelo;
//    }
//
//    public String getFabricante() {
//        return fabricante;
//    }
    
    
//    public Carro FabricarCarro(){
//        return new FabricarSedan();
    
}
