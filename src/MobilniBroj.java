import static java.util.Objects.hash;

public class MobilniBroj extends TelefonskiBroj{
    private int mreza;
    private String br;
    MobilniBroj(int mobilnaMreza, String broj){
        mreza=mobilnaMreza;
        br=broj;
    }
    public String Ispisi(){
        String mr= String.valueOf(0)+String.valueOf(mreza);
        return mr+br;

    }
    public int hashCode(){
        return hash(mreza,br);

    }

}
