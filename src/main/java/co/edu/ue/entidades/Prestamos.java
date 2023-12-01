
package co.edu.ue.entidades;

import java.sql.Date;


public class Prestamos {
    private int prest_id;
    private Date prest_fecha;
    private Date prest_fecha_devolucion;
    private int lect_id;
    private int libr_codigo;
    private int usur_id;

    public Prestamos (){}
    
    
    public Prestamos(Date prest_fecha, Date prest_fecha_devolucion, int lect_id, int libr_codigo, int usur_id) {
        this.prest_fecha = prest_fecha;
        this.prest_fecha_devolucion = prest_fecha_devolucion;
        this.lect_id = lect_id;
        this.libr_codigo = libr_codigo;
        this.usur_id = usur_id;
    }

    public int getPrest_id() {
        return prest_id;
    }

    public void setPrest_id(int prest_id) {
        this.prest_id = prest_id;
    }

    public Date getPrest_fecha() {
        return prest_fecha;
    }

    public void setPrest_fecha(Date prest_fecha) {
        this.prest_fecha = prest_fecha;
    }

    public Date getPrest_fecha_devolucion() {
        return prest_fecha_devolucion;
    }

    public void setPrest_fecha_devolucion(Date prest_fecha_devolucion) {
        this.prest_fecha_devolucion = prest_fecha_devolucion;
    }

    public int getLect_id() {
        return lect_id;
    }

    public void setLect_id(int lect_id) {
        this.lect_id = lect_id;
    }

    public int getLibr_codigo() {
        return libr_codigo;
    }

    public void setLibr_codigo(int libr_codigo) {
        this.libr_codigo = libr_codigo;
    }

    public int getUsur_id() {
        return usur_id;
    }

    public void setUsur_id(int usur_id) {
        this.usur_id = usur_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prestamos{");
        sb.append("prest_id=").append(prest_id);
        sb.append(", prest_fecha=").append(prest_fecha);
        sb.append(", prest_fecha_devolucion=").append(prest_fecha_devolucion);
        sb.append(", lect_id=").append(lect_id);
        sb.append(", libr_codigo=").append(libr_codigo);
        sb.append(", usur_id=").append(usur_id);
        sb.append('}');
        return sb.toString();
    }

   
    
    
    
}
