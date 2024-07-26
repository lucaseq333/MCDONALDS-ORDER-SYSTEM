import javax.swing.*;
public class KontoUzytkownika {
    private int ID;
    private int liczbaPunktow;
    private String nagrody[], okazYeah[], login, haslo;
    //okazYeah -> zawiera odnośnik do istniejącej tablicy z dostępnymi ofertami
    //jedna tablics dostępna dla X użytkowników
    KontoUzytkownika(int ID, int liczbaPunktow, String nagrody[], String okazYeah[]){
        this.ID=ID;
        this.liczbaPunktow=liczbaPunktow;
        this.nagrody=nagrody;
        this.okazYeah=okazYeah;
    }
    static JLabel logowanie = new JLabel("Zaloguj się do aplikacji i zbieraj punkty!");
    static JButton enter = new JButton("Kontynuuj");
    static JButton panelLogowania[] = {
            new JButton("Login: "),
            new JButton("Hasło: ")
    };
    static JTextField polaLogowania[] = {
            new JTextField(),
            new JTextField()
    };
    //System przyznawania punktów -> każda wydana złotówka to 10 punktów, minimalna liczba punktów -> 0; maksymalna -> 6000 pkt.
}