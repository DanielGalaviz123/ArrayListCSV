package servicio;
import java.util.ArrayList;

import modelo.Instrumento;

public class Gestionar {

   private ArrayList<Instrumento> instrumentos; 

   public Gestionar(ArrayList<Instrumento> instrumentos){
    this.instrumentos=instrumentos;
   }

   public Gestionar(){
    instrumentos=new ArrayList<>();
   }
   
   //buscar por autor
   public ArrayList<Instrumento> buscarAutor(String authors){

    return new ArrayList<>(instrumentos.stream()
        .filter(n->n.getAuthors().contains(authors))
        .toList());
   }


   //buscar por tipo
   public ArrayList<Instrumento> buscarTipo(String type){

    return new ArrayList<>(instrumentos.stream()
        .filter(n->n.getType().equals(type))
        .toList());
    }

   // buscar por forma
    public ArrayList<Instrumento> buscarForma(String form){

        ArrayList<Instrumento> instrumentos= new ArrayList<>();

        instrumentos.stream()
            .filter(n->n.getForm().equals(form)).toList();
            return instrumentos;

    }

   //buscar por condicion
    public ArrayList<Instrumento> searchCondition(String condition){
        ArrayList<Instrumento> instrumentos= new ArrayList<>();
        instrumentos.stream().filter(a->a.getCondition().equals(condition)).toList();
        return instrumentos;
    }

    //buscar por evaluated
   
    
}
