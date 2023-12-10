/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author Conta
 */
public class Cliente {
    
    public static void main(String[] args) {
        
        String fabricante = "toyota";
        String modeloDoCarro = "corolla";
        
        
        
        if(modeloDoCarro.equals("Argo")){
            
            Hatch carrohatchh;
            FabricarHatch carroH = new FabricarHatch();
                        
            carrohatchh = (Hatch)carroH.fabricarCarro();
            carrohatchh.setFabricante(fabricante);
            carrohatchh.setModelo(modeloDoCarro);
             
            System.out.println("modelo do carro: " + carrohatchh.getModelo());
            System.out.println("fabricante do carro: " + carrohatchh.getFabricante());
            System.out.println("e hatch? : " + carrohatchh.isHatch());
            
        } else if(modeloDoCarro.equals("corolla")){
            
            Sedan carroSedann;
            FabricarSedan carroS = new FabricarSedan();
            
            carroSedann = (Sedan)carroS.fabricarCarro();
            carroSedann.setFabricante(fabricante);
            carroSedann.setModelo(modeloDoCarro);
            
            System.out.println("modelo do carro: " + carroSedann.getModelo());
            System.out.println("fabricante do carro: " + carroSedann.getFabricante());
            System.out.println("e Sedan? : " + carroSedann.isSedan());
        }
        
       
//        FabricarSedan carroS = new FabricarSedan();
   

    }
    
}
