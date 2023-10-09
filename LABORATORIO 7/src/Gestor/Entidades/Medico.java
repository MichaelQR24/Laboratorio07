
package Gestor.Entidades;

import java.util.List;

public class Medico {
    private String nombre;
    private String CMP;
    private List<Especialidad> especialidades;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCMP() {
        return CMP;
    }

    public void setCMP(String CMP) {
        this.CMP = CMP;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    @Override
    public String toString() {
        return  "Nombre: "+nombre + "       CMP: " + CMP ;
    }
}
