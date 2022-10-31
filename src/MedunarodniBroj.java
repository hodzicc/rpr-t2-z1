import static java.util.Objects.hash;

public class MedunarodniBroj extends TelefonskiBroj{
    String drzava, broj;
    MedunarodniBroj(String drzava1, String broj1){
        drzava=drzava1;
        broj=broj1;
    }
    public String Ispisi(){
          return drzava+broj;
    }
    public int hashCode(){
      return hash(drzava,broj);
    }
}
