import java.util.List;

public class SladoledIceBox extends Sladoled {

    private Baza baza;
    private List<Topping> toppings;

    public SladoledIceBox(String ime) {
        super(ime);
    }

    public SladoledIceBox(String ime, Baza baza, List<Topping> toppings) {
        super(ime);
        this.baza = baza;
        this.toppings = toppings;
    }

    public Baza getBaza() {
        return baza;
    }

    public void setBaza(Baza baza) {
        this.baza = baza;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "SladoledIceBox{" +
                "baza=" + baza +
                ", toppings=" + toppings +
                ", ime='" + getIme() + '\'' +
                '}';
    }

    @Override
    public int cena() {
        int cena = 0;
        try {
            for (Topping topping : toppings) {
                cena += Topping.cena(topping);
            }
            return 200 + cena;
        } catch (IllegalArgumentException e) {
            System.out.println("Naveli ste neispravan topping");
            System.exit(1);
        }
        return 0;
    }
}
