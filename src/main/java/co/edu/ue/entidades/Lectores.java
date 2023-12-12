
package co.edu.ue.entidades;

public class Lectores {
    private int lect_id;
    private String lect_nombre;
    private String lect_apellido;
    private String lect_direccion;
    private String lect_telefono;
    private String lect_documento;
    private String lect_email;
    
    public Lectores (){}

    public Lectores(String lect_nombre, String lect_apellido, String lect_direccion, String lect_telefono, String lect_documento, String lect_email) {
        this.lect_nombre = lect_nombre;
        this.lect_apellido = lect_apellido;
        this.lect_direccion = lect_direccion;
        this.lect_telefono = lect_telefono;
        this.lect_documento = lect_documento;
        this.lect_email = lect_email;
    }

    public int getLect_id() {
        return lect_id;
    }

    public void setLect_id(int lect_id) {
        this.lect_id = lect_id;
    }

    public String getLect_nombre() {
        return lect_nombre;
    }

    public void setLect_nombre(String lect_nombre) {
        this.lect_nombre = lect_nombre;
    }

    public String getLect_apellido() {
        return lect_apellido;
    }

    public void setLect_apellido(String lect_apellido) {
        this.lect_apellido = lect_apellido;
    }

    public String getLect_direccion() {
        return lect_direccion;
    }

    public void setLect_direccion(String lect_direccion) {
        this.lect_direccion = lect_direccion;
    }

    public String getLect_telefono() {
        return lect_telefono;
    }

    public void setLect_telefono(String lect_telefono) {
        this.lect_telefono = lect_telefono;
    }

    public String getLect_documento() {
        return lect_documento;
    }

    public void setLect_documento(String lect_documento) {
        this.lect_documento = lect_documento;
    }

    public String getLect_email() {
        return lect_email;
    }

    public void setLect_email(String lect_email) {
        this.lect_email = lect_email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lectores{");
        sb.append("lect_id=").append(lect_id);
        sb.append(", lect_nombre=").append(lect_nombre);
        sb.append(", lect_apellido=").append(lect_apellido);
        sb.append(", lect_direccion=").append(lect_direccion);
        sb.append(", lect_telefono=").append(lect_telefono);
        sb.append(", lect_documento=").append(lect_documento);
        sb.append(", lect_email=").append(lect_email);
        sb.append('}');
        return sb.toString();
    }
}
