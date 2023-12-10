/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author veras
 */
public class Hatch extends Carro {
    
    private boolean carroHatch;
    
    public Hatch(){}
    
    public boolean isHatch(){
        return carroHatch;
    }
    
    public void setHatch(boolean ht){
        carroHatch = ht;
    }
    
    
    
//    private final String modelo;;
//    private final String fabricante;
//
//    public Hatch(String modelo, String fabricante) {
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
//    
//    public Carro FabricarCarro(){;;
//        return new FabricarHatch();

}
