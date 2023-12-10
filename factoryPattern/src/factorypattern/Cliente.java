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
        FabricarHatch carroHatch = new FabricarHatch();
        
        List<Hatch> conjuntoHatch = new ArrayList<Hatch>();
        Hatch carrohatchh;
        for(int i = 0; i < 1; ++i){
            carrohatchh = (Hatch)FabricarHatch.Fabricar();
        }
      
    }
    
}
