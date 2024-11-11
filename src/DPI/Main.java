package DPI;

public class Main {
    public static void main(String[] args) {
        Mobil mobilBensin = new Mobil(new MesinPetrol());
        Mobil mobilDiesel = new Mobil(new MesinDiesel());
        Mobil mobilHybird = new Mobil(new MesinHybird());

        mobilBensin.nyalakan();
        mobilDiesel.nyalakan();
        mobilHybird.nyalakan();
    }
}
