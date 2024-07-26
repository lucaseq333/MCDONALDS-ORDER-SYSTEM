public class Produkt {
    private String nazwa;
    private double cena;
    private String rozmiar;

    Produkt(String nazwa, double cena){
        this.nazwa=nazwa;
        this.cena=cena;
    }
    //tu był drugi konstruktor z polem 'rozmiar', który usunąłem...
    public static String dodatkiWarzywa[] = {
            "salata", "jalapeno", "cebula biała", "cebula czerwona", "pomidor", "pikle", "ser cheddar", "rukola", "bekon"
    };
    public static String dodatkiSosy[] = {
            "big mac", "wieśmac", "onion-tomato", "kanapkowy", "honey-mustard", "ketchup", "musztarda", "carolina BBQ", "Bourbon BBQ", "Smoky Cheddar", "maestro"
    };
    public String[] dodajWarzywo(String dodatki[]){
        return dodatki;
    }
    public String[] usunWarzywo(String dodatki[]){
        return dodatki;
    }
    public String[] dodajSos(String dodatkiSosy[]){
        return dodatkiSosy;
    }
    public String[] usunSos(String dodatkiSosy[]){
        return dodatkiSosy;
    }
}