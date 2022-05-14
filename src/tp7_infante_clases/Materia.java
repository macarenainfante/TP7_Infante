package tp7_infante_clases;

public class Materia {

    private int idMateria;
    private String nombre;
    private int anio;

    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria=idMateria;
        this.nombre=nombre;
        this.anio=anio;
    }

    public int getIdMateria() {
        return this.idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria=idMateria;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio=anio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.idMateria;
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
        final Materia other = (Materia) obj;
        if (this.idMateria != other.idMateria) {
            return false;
        }
        return true;
    }
    
     @Override
    public String toString() {
        return (nombre);
    }
}
