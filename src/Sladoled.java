public abstract class Sladoled {
    private String ime;

    public Sladoled(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String toString() {
        return "Sladoled{" +
                "ime='" + ime + '\'' +
                '}';
    }

    public abstract int cena();
}
