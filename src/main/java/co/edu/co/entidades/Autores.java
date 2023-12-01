
package co.edu.co.entidades;


public class Autores {
    private int aut_id;
    private String aut_nombre;
    private String aut_apellido;
    
    public Autores (){}

    public Autores(String aut_nombre, String aut_apellido) {
        this.aut_nombre = aut_nombre;
        this.aut_apellido = aut_apellido;
    }

    public int getAut_id() {
        return aut_id;
    }

    public void setAut_id(int aut_id) {
        this.aut_id = aut_id;
    }

    public String getAut_nombre() {
        return aut_nombre;
    }

    public void setAut_nombre(String aut_nombre) {
        this.aut_nombre = aut_nombre;
    }

    public String getAut_apellido() {
        return aut_apellido;
    }

    public void setAut_apellido(String aut_apellido) {
        this.aut_apellido = aut_apellido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autores{");
        sb.append("aut_id=").append(aut_id);
        sb.append(", aut_nombre=").append(aut_nombre);
        sb.append(", aut_apellido=").append(aut_apellido);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}





