package oblig1;

import static javax.swing.JOptionPane.*;

public class Oblig1Oppgave2 {
    public static void main(String[] args) {
    // les inn navn, antall og pris for vare 1
        String innNavn1 = showInputDialog("Vare 1");
        String innAntall1 = showInputDialog("Antall");
        String innPris1 = showInputDialog("Pris");
    // les inn navn, antall og pris for vare 2
        String innNavn2 = showInputDialog("Vare 2");
        String innAntall2 = showInputDialog("Antall");
        String innPris2 = showInputDialog("Pris");

    // bruk avvikshåndtering (try/catch) for å konvertere
    // antall og pris for vare 1 og vare 2
        int antall1, antall2;
        double pris1, pris2;

        try {
            antall1 = Integer.parseInt(innAntall1);
            antall2 = Integer.parseInt(innAntall2);
            pris1 = Double.parseDouble(innPris1);
            pris2 = Double.parseDouble(innPris2);
        } catch (Exception e){
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
        String totalPris1Med2Desimaler = String.format("%.2f", totalPris1);
        System.out.println("Vare 1: "+vare1.getNavn()+"\nAntall: "+vare1.getAntall()+"\nPris (kr.): "+vare1.getPris());
        System.out.println("Totalpris på vare 1 er: "+totalPris1Med2Desimaler+" kr.");

        double totalPris2 = vare2.beregnTotalPris(vare2.getPris(), vare2.getAntall());
        String totalPris2Med2Desimaler = String.format("%.2f", totalPris2);
        System.out.println("Vare 2: "+vare2.getNavn()+"\nAntall: "+vare2.getAntall()+"\nPris (kr.): "+vare2.getPris());
        System.out.println("Totalpris på vare 2 er: "+totalPris2Med2Desimaler+" kr.");
    }
}
