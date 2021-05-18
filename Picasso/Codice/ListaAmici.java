
//package instagram;

import java.util.ArrayList;
import java.util.List;

public class ListaAmici {
    
    private List<Utente> Amici;
    
    public ListaAmici(){
        this.Amici= new ArrayList<>();
    }
    public void add(Utente a){
        Amici.add(a);
    }
    public void remove(Utente a){
        Amici.remove(a);
    }
    public int etaMedia(){
        int etaTot=0;
        int etaMedia=0;
        int lunghezzaArray=Amici.size();
        for (Utente amico : Amici){
            etaTot+= amico.getEta(2021);
     }
        etaMedia=etaTot/lunghezzaArray;
        return etaMedia();
    }
    public void addFrom(Utente[] tag){
        for(int i=0;i<tag.length;i++){
           Amici.add(tag[i]);
        }
    }
    }

    
