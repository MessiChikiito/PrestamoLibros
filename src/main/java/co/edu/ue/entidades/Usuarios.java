
package co.edu.ue.entidades;


public class Usuarios {
    private int usur_id;
    private String usur_nombres;
    private String usur_apellidos;
    private String usur_email;
    private String usur_contraseña;
    private int usur_documento;
    
    public Usuarios (){}

    public Usuarios(String usur_nombres, String usur_apellidos, String usur_email, String usur_contraseña, int usur_documento) {
        this.usur_nombres = usur_nombres;
        this.usur_apellidos = usur_apellidos;
        this.usur_email = usur_email;
        this.usur_contraseña = usur_contraseña;
        this.usur_documento = usur_documento;
    }

    public int getUsur_id() {
        return usur_id;
    }

    public void setUsur_id(int usur_id) {
        this.usur_id = usur_id;
    }

    public String getUsur_nombres() {
        return usur_nombres;
    }

    public void setUsur_nombres(String usur_nombres) {
        this.usur_nombres = usur_nombres;
    }

    public String getUsur_apellidos() {
        return usur_apellidos;
    }

    public void setUsur_apellidos(String usur_apellidos) {
        this.usur_apellidos = usur_apellidos;
    }

    public String getUsur_email() {
        return usur_email;
    }

    public void setUsur_email(String usur_email) {
        this.usur_email = usur_email;
    }

    public String getUsur_contraseña() {
        return usur_contraseña;
    }

    public void setUsur_contraseña(String usur_contraseña) {
        this.usur_contraseña = usur_contraseña;
    }

    public int getUsur_documento() {
        return usur_documento;
    }

    public void setUsur_documento(int usur_documento) {
        this.usur_documento = usur_documento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuarios{");
        sb.append("usur_id=").append(usur_id);
        sb.append(", usur_nombres=").append(usur_nombres);
        sb.append(", usur_apellidos=").append(usur_apellidos);
        sb.append(", usur_email=").append(usur_email);
        sb.append(", usur_contrase\u00f1a=").append(usur_contraseña);
        sb.append(", usur_documento=").append(usur_documento);
        sb.append('}');
        return sb.toString();
    }    
    
}
