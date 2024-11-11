package DPI;

public class Mobil {
    private final MesinInterface mesin;

    public Mobil(MesinInterface mesin) {
        this.mesin = mesin;
    }

    void nyalakan() {
        mesin.nyalakan();
    }

}
