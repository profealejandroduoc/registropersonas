package cl.duoc.registropersonas.model;

import cl.duoc.registropersonas.dao.PersonaJsonDAO;

import java.io.IOException;
import java.util.List;

public class Persona {
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {

    }

    public Persona(String rut, String nombre, String apellido, int edad) {
        this.setRut(rut);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
    }


    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("rut='").append(rut).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }

    public List<Persona> listar() throws IOException {
        PersonaJsonDAO pjdao=new PersonaJsonDAO();
        return pjdao.readAll();
    }

    public void guardar(Persona p) throws IOException {
        PersonaJsonDAO pjdao=new PersonaJsonDAO();
        pjdao.create(p);
    }
}
