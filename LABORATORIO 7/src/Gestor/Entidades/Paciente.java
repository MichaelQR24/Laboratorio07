
package Gestor.Entidades;

public class Paciente {
    private String dni;
    private String nombre;
    private String telefono;
    private String sexoBiologico;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexoBiologico() {
        return sexoBiologico;
    }

    public void setSexoBiologico(String sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }

    @Override
    public String toString() {
        return  dni + "       " + nombre + "       " 
                + telefono + "       " + sexoBiologico;
    }
    
    
}
