/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialtercerapartesegundoejercicio;

import util.Operaciones;
import entidades.Persona;

/**
 *
 * @author Jherom Chacon
 */
public class PrimerParcialTerceraParteSegundoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        Operaciones operaciones = new Operaciones();
        persona.setNombre("Carlitos");
        persona.setSexo("Masculino");
        int resultado = operaciones.suma(1, 1);//_(1,1);
        int resultadoResta = operaciones.resta(3,2);
    }
    
}
