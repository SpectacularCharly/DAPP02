package org.uv.dapp02practica02;

/**
 *
 * @author enigma
 */
public class EmpleadoPojo {
    private long clave;
    private String nombre;
    private String dureccion;
    private String telefono;
    
    public long getClave() {
        return clave;
    }

    public void setClave(long clave) {
        this.clave = clave;
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

    public String getDureccion() {
        return dureccion;
    }

    public void setDureccion(String dureccion) {
        this.dureccion = dureccion;
    }
    
}
