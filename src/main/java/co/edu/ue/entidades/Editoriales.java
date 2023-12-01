
package co.edu.ue.entidades;

public class Editoriales {
    private int edit_id;
    private String edit_nombre;
    
    public Editoriales(){}

    public Editoriales(String edit_nombre) {
        this.edit_nombre = edit_nombre;
    }

    public int getEdit_id() {
        return edit_id;
    }

    public void setEdit_id(int edit_id) {
        this.edit_id = edit_id;
    }

    public String getEdit_nombre() {
        return edit_nombre;
    }

    public void setEdit_nombre(String edit_nombre) {
        this.edit_nombre = edit_nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Editoriales{");
        sb.append("edit_id=").append(edit_id);
        sb.append(", edit_nombre=").append(edit_nombre);
        sb.append('}');
        return sb.toString();
    }
    
            
}
