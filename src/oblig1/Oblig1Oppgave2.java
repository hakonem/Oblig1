package oblig1;

import static javax.swing.JOptionPane.*;

public class Oblig1Oppgave2 {
    public static void main(String[] args) {
    // les inn navn, antall og pris for vare 1
        String innNavn1 = showInputDialog("Navnet til vare 1");
        String innAntall1 = showInputDialog("Antall vare 1");
        String innPris1 = showInputDialog("Pris på vare 1");

    // les inn navn, antall og pris for vare 2
        String innNavn2 = showInputDialog("Navnet til vare 2");
        String innAntall2 = showInputDialog("Antall vare 2");
        String innPris2 = showInputDialog("Pris på vare 2");

    // bruk avvikshåndtering (try/catch) for å konvertere
    // antall og pris for vare 1 og vare 2
        int antall1, antall2;
        double pris1, pris2;

        try {
            antall1 = Integer.parseInt(innAntall1);
            antall2 = Integer.parseInt(innAntall2);
            pris1 = Double.parseDouble(innPris1);
            pris2 = Double.parseDouble(innPris2);

        } catch (Exception e) {
            antall1 = 0;
            antall2 = 0;
            pris1 = 0;
            pris2 = 0;

            System.out.println("Du må skrive inn et tall!" + e);
        }

    // opprett to vare-objekter med de innleste verdiene
        Vare vare1 = new Vare(innNavn1, antall1, pris1);
        vare1.setNavn(innNavn1);
        vare1.setAntall(antall1);
        vare1.setPris(pris1);

        Vare vare2 = new Vare(innNavn2, antall2, pris2);
        vare2.setNavn(innNavn2);
        vare2.setAntall(antall2);
        vare2.setPris(pris2);

    // beregn og skriv ut total pris for alle varer i System.out
        double totalPris1 = vare1.beregnTotalPris(vare1.getPris(), vare1.getAntall());

        double totalPris2 = vare2.beregnTotalPris(vare2.getPris(), vare2.getAntall());

        double totalAlleVarer = totalPris1 + totalPris2;

        System.out.print("Totalprisen ble: " + totalAlleVarer + " kr");
    }
}
