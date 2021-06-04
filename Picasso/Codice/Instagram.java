//package instagram;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Instagram {

    
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("../saves/profili.csv",true);
        BufferedWriter bw = new BufferedWriter(writer);
        Utente b = new Utente("Umberto","Barasku","11/05/2000","ekkomain@gmail.com");
        Utente g = new Utente("Riccardo","Grosselli","04/04/2003","fenicio04@gmail.com");
        System.out.println(b.toString());
        System.out.println(b.getEta(2021));
        Utente sasso = new Utente();
        Utente[] gg = new Utente[3];
        gg[0] = sasso; 
        gg[1] = b;
        gg [2] = g;  
        Foto x = new Foto("ollare","gatto",gg,"bazuzu");
        System.out.println(x.toString());
        Foto s = new Foto(x);
        x.setTag(gg);
        s.setTag(gg);
        Album a = new Album();
        a.addFoto(s);
        a.addFoto(x);
        System.out.println(a.totaleAmici());
        if (b.save(writer,bw)){
            System.out.println("Salvataggio avvenuto con successo!");
        }else{
            System.out.println("Errore nel salvataggio!!!");
        }

    }
    
