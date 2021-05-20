
//package instagram;

import static java.lang.Integer.parseInt;


public class Utente {
    String cognome;
    String nome;
    String dataNascita;
    String email;
    
    
    public Utente(){
        this.cognome="";
        this.nome="";
        this.dataNascita="";
        this.email="";
    }
    public Utente(String nom,String cog, String data, String mail){
        this.cognome=cog;
        this.nome=nom;
        this.dataNascita=data;
        this.email=mail;
    }
    public Utente(Utente b){
        this.cognome=b.cognome;
        this.nome=b.nome;
        this.dataNascita=b.dataNascita;
        this.email=b.email;
    }
    
    public void setCognome(String cog){
        this.cognome=cog;
    }
    public String getCognome(){
        return this.cognome;
    }
     public void setNome(String nom){
        this.nome=nom;
    }
    public String getNome(){
        return this.nome;
    }
     public void setData(String dat){
        this.cognome=dat;
    }
    public String getData(){
        return this.dataNascita;
    }
     public void setMail(String mail){
        this.email=mail;
    }
    public String getMail(){
        return this.email;
    }
    public int getEta(int AnnoCorrente){
        String[] splittato = dataNascita.split("/");
        String ottieniAnno= splittato[2];
        int anno = parseInt(ottieniAnno);
        return(AnnoCorrente-anno);
    }
    
    @Override
    public String toString(){
        return(" Utente { nome : " + this.nome +" ,  cognome : " +this.cognome +" , data : " + this.dataNascita +" , email : " + this.email + " }");
    }
}
