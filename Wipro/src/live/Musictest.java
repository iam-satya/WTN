package live; 
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class Musictest {
 public static void main (String[]args) {
Veena v = new Veena();
v.play();
Playable pv = new Veena();
pv.play();
Saxophone s = new Saxophone();
s.play();
Playable ps= new Saxophone();
ps.play();
}
}