package instagram;
import java.lang.reflect.Array;

public class Foto{
    private String risoluzione;
    private String descrizione;
    private Utente[] tag;
    private int cont;
    private String path;
    public Foto(){
        risoluzione = "";
        descrizione = "";
        tag = new Utente[20];
        path = "";
        cont = 0;
    }
    public Foto(String risoluzione,String descrizione,Utente[] tag,String path){
        this.risoluzione = risoluzione;
        this.descrizione = descrizione;
        this.tag = tag;
        this.path = path;
        this.cont = 0;
    }
    public Foto(Foto f){
        this.risoluzione = f.risoluzione;
        this.descrizione = f.descrizione;
        this.tag = f.tag;
        this.path = f.path;
        this.cont= f.cont;
    }
    public void setRisoluzione(String risoluzione){
        this.risoluzione = risoluzione;
    }
    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }
    public void setPath(String path){
        this.path = path;
    }
    public void setTag(Utenti[] tags){
        this.tag = tags;
    }
    public String getRisoluzione(){
        return risoluzione;
    }
    public String getDescrizione(){
        return descrizione;
    }
    public String getPath(){
        return path;
    }
    public Utente[] getTag () {
        return tag;   
    }
    public void addUtente(Utente a){
        if (cont<tag.length){
            tag[cont]=utente;
            }
    }
    public int getCont(Utente [] tags){
    int contatore = 0;
    for(i=0;(i<tags.length)&&(tags[i]!=null)<;i++){
        contatore = contatore + 1;
    }
    return contatore;
    }
    public int getNumeroAmici(){
        int cont = 0;
        for(int i = 0;((i < tag.length) && (tag[i] != null)); i++){
        cont = cont + 1;
        }
        return cont;
    }
    public boolean equals(Foto f) {
        return this.toString().equals(f.toString());
    }
    public String toString() {
        String s = " Foto { risoluzione : "+ risoluzione + " , descrizione : " + descrizione +" , tags : ( ";
        for(int i=0 ; i < tag.length; i++){
            if (i == tag.length-1)
                s = s+tag[i].getNome()+" ) , ";
            else
                s = s+tag[i].getNome()+" , ";
        }
        return (s+" path: "+path+" }");
    }
}

