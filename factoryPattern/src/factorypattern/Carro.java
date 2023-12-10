/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author 
 */
public class Carro {
    private String modelo;
    private String fabricante;
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String carroModelo){
        modelo = carroModelo;
    }
    
    
    
    public String getFabricante(){
        return fabricante;
    }
    
    public void setFabricante(String carroFabricante){
        fabricante = carroFabricante;
    }
  
}
