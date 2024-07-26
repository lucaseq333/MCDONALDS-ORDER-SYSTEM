enum status{
    SUMA, ZAPLACONE, ANULOWANE
}
public class Zamowienie {
    //status ==> oznacza czy 'na miejscu' czy 'na wynos'...
    private String nazwa, status;
    private double punkty, cena, przyjetaKwota, resztaDoWydania;
    private boolean czyDelivery;
    private int numerZamowienia = 0; /* <--  tutaj trzeba dac przedzial od 1-100; jezeli dojdzie do stu to liczy od nowa i przechowuje to w historii zamowien;
    kazda "setka" bedzie liczona jako 1 itd. */
    Zamowienie(Produkt p[], int numerZamowienia, double cena, double przyjetaKwota){
        this.numerZamowienia=numerZamowienia;
        this.cena=cena;
        this.przyjetaKwota=przyjetaKwota;
        this.resztaDoWydania=(przyjetaKwota-cena);
    }
    //Tablica produktow, bo zamowienie musi zawierac co najmniej jeden produkt - czyli zawsze istnieje co najmniej jendoelementowa tablica o indeksie zerowym
    public double wydajReszte(double kwota, double przyjetaKwota){
        return (przyjetaKwota-kwota);
    }
    public void zestawSredni(){

    }
    public void zestawPowiekszony(){

    }
    public void zaplac(){

    }
    public void zlozZamowienie(){

    }
    public void dodajProdukt(){

    }
    public void usunProdukt(){

    }
    //metoda toString powinna wydrukowac informacje o calym zlozonym zamowieniu (taki jakby paragon)
    @Override
    public String toString() {
        return super.toString();
    }
}