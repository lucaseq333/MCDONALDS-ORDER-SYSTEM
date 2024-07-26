import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Okienko extends JFrame {
    JFrame powitanie = new JFrame();
    private String loginCredential = "login", passwordCredential = "haslo";
    public Okienko(){
        super("McDonald's");
        powitanie.setSize(400,200);


        JPanel przyciskiGorne = new JPanel();
        przyciskiGorne.setSize(1260,10);
        przyciskiGorne.setBackground(Color.white);
        add(przyciskiGorne);

        JPanel logowanie = new JPanel();
        JButton zalogujSie = new JButton("Zaloguj się: ");
        zalogujSie.setBackground(Color.white);
        logowanie.add(zalogujSie);
        setLayout(new GridLayout(2,1));

        JButton sprawdz = new JButton("SPRAWDŹ");
        sprawdz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                powitanie.setVisible(false);
                setVisible(true);
            }
        });

        /*JLabel zlozZamowienie = new JLabel("Złóż zamówienie",SwingConstants.CENTER);
        JPanel panelSrodkowy = new JPanel();
        panelSrodkowy.add(zlozZamowienie);
        add(panelSrodkowy);*/

        JPanel panelDolny = new JPanel();
        JButton zamowienie = new JButton("Złóż zamówienie");
        JButton cofnij = new JButton("Cofnij");
        zamowienie.setBackground(Color.white);
        cofnij.setBackground(Color.white);
        panelDolny.add(cofnij);
        panelDolny.add(zamowienie);
        panelDolny.add(logowanie);
        add(panelDolny);

        logowanie.setBackground(Color.orange);

        JPanel panelFrytek = new JPanel();

        JButton przyciskiMenu[] = {
                new JButton("McZestawy"), new JButton("Burgery"),
                new JButton("McWrapyi i sałatki"), new JButton("Kurczak"),
                new JButton("2 for U"), new JButton("Frytki i dodatki"),
                new JButton("McCafe"), new JButton("Lody i desery"),
                new JButton("Napoje"), new JButton("Happy Meal"),
        };

        ImageIcon ikonkiBurgerow[] = {

        };

        JPanel panelLogowania = new JPanel();
        JLabel login = new JLabel("Login: ");
        JTextField tekstLogin = new JTextField(" ");
        JLabel haslo = new JLabel("Hasło: ");
        JTextField tekstHaslo = new JTextField(" ");
        panelLogowania.setSize(50,20);
        panelLogowania.add(login);
        panelLogowania.add(tekstLogin);
        panelLogowania.add(haslo);
        panelLogowania.add(tekstHaslo);
        panelLogowania.setBackground(Color.orange);

        panelDolny.setBackground(Color.orange);

        zalogujSie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(JButton x : przyciskiMenu){
                    x.setVisible(false);
                }
                setSize(600, 300);
                setLocation(650, 350);
                setBackground(Color.orange);
                setVisible(true);
                zamowienie.setVisible(false);
                zalogujSie.setLayout(new FlowLayout(FlowLayout.CENTER));
                setLayout(new BorderLayout());
                add(panelLogowania);
                if(tekstLogin.equals(loginCredential) && tekstHaslo.equals(passwordCredential)){
                    System.out.println("Zalogowałeś się...");
                }

            }
        });

            JLabel Burger[] = {
                new JLabel("Cheeseburger"),
                new JLabel("Hamburger"),
                new JLabel("Jalapeno Burger"),
                new JLabel("McDouble"),
                new JLabel("Veggie Burger"),
                new JLabel("McRoyal"),
                new JLabel("Podwójny McRoyal"),
                new JLabel("WieśMac"),
                new JLabel("Podwójny WieśMac"),
                new JLabel("Maestro Grand Classic"),
                new JLabel("Maestro Bacon&Cheddar"),
        };

            ImageIcon BurgerIkonki[] = {
                    new ImageIcon("cheesburger.png"),
                    new ImageIcon("hamburger.png"),
                    new ImageIcon("jalapeno.png"),
                    new ImageIcon("mcdouble.png"),
                    new ImageIcon("veggie.png"),
                    new ImageIcon("mcroyal.png"),
                    new ImageIcon("podwojnymcroyal.png"),
                    new ImageIcon("wies-mac.png"),
                    new ImageIcon("wies-mac-podwo-jny.png"),
                    new ImageIcon("grandclassic.png"),
                    new ImageIcon("beconcheddar.png")
            };

            JLabel Kurczak[] = {
                    new JLabel("McCrispy Supreme"),
                    new JLabel("McCrispy"),
                    new JLabel("McChicken"),
                    new JLabel("Chicken Box"),
                    new JLabel("Tenders 3 szt."),
                    new JLabel("Tenders 5 szt."),
                    new JLabel("Chikker"),
                    new JLabel("Red Chikker"),
                    new JLabel("6 McNuggets"),
                    new JLabel("9 McNuggets"),
                    new JLabel("20 McNuggets"),
            };

            JLabel Frytki[] = {
                    new JLabel("Małe"),
                    new JLabel("Średnie"),
                    new JLabel("Duże")
            };

        cofnij.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(JButton domyslne : przyciskiMenu){
                    domyslne.setVisible(true);
                }

            }
        });
        przyciskiMenu[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(JButton p1 : przyciskiMenu){
                        for(JLabel p2 : Burger){
                            p1.setVisible(false);
                            przyciskiGorne.setLayout(new GridLayout(5,3));
                            przyciskiGorne.add(p2);
                            p2.setVisible(true);
                        }
                }
            }
        });
        przyciskiMenu[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(JButton p1 : przyciskiMenu){
                    for(JLabel p3 : Kurczak){
                        p1.setVisible(false);
                        przyciskiGorne.setLayout(new GridLayout(2,5));
                        przyciskiGorne.add(p3);
                        p3.setVisible(true);
                    }
                }
            }
        });

        przyciskiMenu[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(JButton p5 : przyciskiMenu){
                    for(JLabel x : Frytki){
                        for(JLabel y : Burger){
                            y.setVisible(false);
                            x.setVisible(true);
                            przyciskiGorne.add(x);
                            p5.setVisible(false);
                        }
                    }
                }
            }
        });

        for(JButton j : przyciskiMenu){
            przyciskiGorne.add(j);
            j.setBackground(Color.orange);
        }

        setSize(1150, 600);
        //setLocation(340, 70);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}