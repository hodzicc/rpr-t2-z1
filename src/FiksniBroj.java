import static java.util.Objects.hash;

public class FiksniBroj extends TelefonskiBroj{
    private String brTel;
    private Grad grad;
    FiksniBroj(Grad grad1, String broj1){
        grad=grad1;
        brTel=broj1;
    }
    public String Ispisi(){
        return (grad+brTel);
    }
    public int hashCode(){
        return hash(grad,brTel);

    }
}
