package instagram;
import java.util.ArrayList;
import java.util.List;

public class Album {
    private List<Foto> album;
    public Album(){
        this.album = new ArrayList<>();
    }
    public void addFoto(Foto a){
        album.add(a);
    }
    public void removeFoto(Foto a){
        album.remove(a);
    }
    public void getFoto(int num){
      album.get(num);
    }
    public void addTag(int num, Utenti[] tag){
     Foto editata;
     editata = new Foto(album.get[num]);
     editata.setTag(tag);
     album.set(num,editata);
    }
