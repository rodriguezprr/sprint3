/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodriguezprr
 */
public class clase01 {
    public static void main(String[] args){
    
        System.out.println(clase01.calcularPorcentajeBono(23,500000));
        
    }
    
    public static double calcularPorcentajeBono(int anios,float bono) {

        double porcentaje=0;

        // tu código acá
        if (anios <3){
            porcentaje=0.05;
        }else if (anios < 5){
            porcentaje=0.1;
        }else if (anios <10){
            porcentaje=0.2;
        }else{
            porcentaje=0.3;
        }

        return porcentaje*bono;

    }
}
