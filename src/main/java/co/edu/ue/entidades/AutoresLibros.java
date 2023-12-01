
package co.edu.ue.entidades;

public class AutoresLibros {
    private int librautr_id;
    private int aut_id;
    private int libr_codigo;
    
    public AutoresLibros (){}

    public AutoresLibros(int aut_id, int libr_codigo) {
        this.aut_id = aut_id;
        this.libr_codigo = libr_codigo;
    }

    public int getLibrautr_id() {
        return librautr_id;
    }

    public void setLibrautr_id(int librautr_id) {
        this.librautr_id = librautr_id;
    }

    public int getAut_id() {
        return aut_id;
    }

    public void setAut_id(int aut_id) {
        this.aut_id = aut_id;
    }

    public int getLibr_codigo() {
        return libr_codigo;
    }

    public void setLibr_codigo(int libr_codigo) {
        this.libr_codigo = libr_codigo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AutoresLibros{");
        sb.append("librautr_id=").append(librautr_id);
        sb.append(", aut_id=").append(aut_id);
        sb.append(", libr_codigo=").append(libr_codigo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
