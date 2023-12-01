
package co.edu.ue.entidades;


public class Libros {
    
    private int libr_codigo;
    private String libr_titulo;
    private int edit_id;
    private int aut_id;

    public Libros(String libr_titulo) {
        this.libr_titulo = libr_titulo;
    }

    public int getLibr_codigo() {
        return libr_codigo;
    }

    public void setLibr_codigo(int libr_codigo) {
        this.libr_codigo = libr_codigo;
    }

    public String getLibr_titulo() {
        return libr_titulo;
    }

    public void setLibr_titulo(String libr_titulo) {
        this.libr_titulo = libr_titulo;
    }

    public int getEdit_id() {
        return edit_id;
    }

    public void setEdit_id(int edit_id) {
        this.edit_id = edit_id;
    }

    public int getAut_id() {
        return aut_id;
    }

    public void setAut_id(int aut_id) {
        this.aut_id = aut_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libros{");
        sb.append("libr_codigo=").append(libr_codigo);
        sb.append(", libr_titulo=").append(libr_titulo);
        sb.append(", edit_id=").append(edit_id);
        sb.append(", aut_id=").append(aut_id);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
