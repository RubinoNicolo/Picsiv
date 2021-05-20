package instagram;


public class Instagram {

    
    public static void main(String[] args) {
        String nome="Ekko";
        String cognome="Main";
        String data="11/05/2000";
        String email="ekko@ekko.com";
        Utente b = new Utente(nome,cognome,data,email);
        System.out.println(b.toString());
        System.out.println(b.getEta(2021));
        Utente sasso = new Utente();
        Utente[] gg = new Utente[2];
        gg[0] = sasso; 
        gg[1] = b;  
 
        Foto x = new Foto("ollare","gatto",gg,"bazuzu");
        
        System.out.println(x.toString());
    }
    
}
