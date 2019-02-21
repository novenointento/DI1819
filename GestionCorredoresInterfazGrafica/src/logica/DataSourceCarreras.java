/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Carrera;

/**
 *
 * @author daniel
 */
public class DataSourceCarreras {
        public static List<Carrera> listCarreras() {
        List<Carrera> listaCarreras = new ArrayList<>();
        
            for (int i = 0; i <20; i++) {
                listaCarreras.add(new Carrera("carrera "+i,"aviles","id "+i,new Date(),i));
                
            }
            
        
            
        return listaCarreras;
    }
}
