/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author veras
 */
public class FabricarHatch extends Fabricar {
    public Carro fabricarCarro() {
        return new Hatch();
    }
}
