import java.util.List;

public class SladoledCrnaOvca extends Sladoled {

    private NacinServiranja nacinServiranja;
    private List<Ukus> ukusi;

    public SladoledCrnaOvca(String ime) {
        super(ime);
    }

    public SladoledCrnaOvca(String ime, NacinServiranja nacinServiranja, List<Ukus> ukusi) {
        super(ime);
        this.nacinServiranja = nacinServiranja;
        this.ukusi = ukusi;
    }

    public NacinServiranja getNacinServiranja() {
        return nacinServiranja;
    }

    public void setNacinServiranja(NacinServiranja nacinServiranja) {
        this.nacinServiranja = nacinServiranja;
    }

    public List<Ukus> getUkusi() {
        return ukusi;
    }

    public void setUkusi(List<Ukus> ukusi) {
        this.ukusi = ukusi;
    }

    @Override
    public String toString() {
        return "SladoledCrnaOvca{" +
                "nacinServiranja=" + nacinServiranja +
                ", ukusi=" + ukusi +
                ", ime='" + getIme() + '\'' +
                '}';
    }

    @Override
    public int cena() {
        return 100 + ukusi.size()*70;
    }
}
