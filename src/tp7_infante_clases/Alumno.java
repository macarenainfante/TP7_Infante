package tp7_infante_clases;


import java.util.HashSet;
import javax.swing.JOptionPane;

public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo=legajo;
        this.apellido=apellido;
        this.nombre=nombre;
    }

    public int getLegajo() {
        return this.legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo=legajo;
        
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido=apellido;
    }

    public void agregarMateria(Materia m) {
       if(materias.add(m) == true){
           JOptionPane.showMessageDialog(null, "Alumno agregado correctamente");
           materias.add(m);
       }else{
           JOptionPane.showMessageDialog(null, "El alumno ya se encuentra inscripto en esta materia");
       }
           
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
    

    public int cantidadDeMaterias() {
        return materias.size();
    }   
    
     @Override
    public String toString() {
        return (apellido + " " + nombre);
    }

}
