public enum Topping {
    COKOLADNE_MRVICE,
    KARAMELA,
    VISNJA,
    BOMBONICE;

    public static int cena(Topping t) throws IllegalArgumentException {
        switch (t) {
            case COKOLADNE_MRVICE -> {
                return 100;
            }
            case KARAMELA -> {
                return 70;
            }
            case VISNJA -> {
                return 70;
            }
            case BOMBONICE -> {
                return 80;
            }
            default -> {
                throw new IllegalArgumentException();
            }
        }
    }
}
