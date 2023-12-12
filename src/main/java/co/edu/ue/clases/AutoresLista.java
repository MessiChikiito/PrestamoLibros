
package co.edu.ue.clases;

import co.edu.ue.entidades.Autores;
import java.util.ArrayList;


public class AutoresLista {
    ArrayList<Autores>lista;
    
    public AutoresLista (){
        lista = new ArrayList();
    }
    
    public void AgregarAutores (Autores c){
        lista.add(c);
    }
    
}
