/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7_infante_clases;

/**
 *
 * @author Macarena
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Materia ingles = new Materia (1, "Ingles I", 1);
        Materia mate = new Materia (2, "Matematicas", 1);
        Materia lab = new Materia(3,"Laboratorio I",1);
        
        Alumno lopez = new Alumno (1001, "Lopez", "Martin");
        Alumno martinez = new Alumno (1002, "Martinez", "Brenda");
        
        
        lopez.agregarMateria(ingles);
        lopez.agregarMateria(mate);
        lopez.agregarMateria(lab);
        
        martinez.agregarMateria(lab);
        martinez.agregarMateria(ingles);
        martinez.agregarMateria(mate);
        
    }
    
}
