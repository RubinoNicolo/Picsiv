import java.util.ArrayList;
import java.util.List;

public class Album {
    private List<Foto> album;
    public ListaAmici(){
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
     Foto editata = new Foto(album[num]);
     editata.setTag(tag);
     album[num] = editata;
    }
