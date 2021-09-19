package oblig1;

public class Oblig1Oppgave1 {
    public static void main(String[] args) {
        //  Sett en variabel lik en verdi for radius
        double radius = 23.5;

    /* Kall så de statiske metodene i sirkel-klassen for å vise følgende på
       System.out (gitt radius lik 23.5)

       Arealet av sirkelen med radius 23.5 er 1734,94
       Omkretsen av sirkelen med radius 23.5 er 147,65
       Diameteren til sirkelen er med radius 23.5 er 47,00

       Tips : String.format("%.2f",desimalverdi); for å formatere to desimaler
    */
        double areal = Sirkel.beregnAreal(radius);
        double omkrets = Sirkel.beregnOmkrets(radius);
        double diameter = Sirkel.beregnDiameter(radius);
        String arealMedToDesimaler = String.format("%.2f", areal);
        String omkretsMedToDesimaler = String.format("%.2f", omkrets);
        String diameterMedToDesimaler = String.format("%.2f", diameter);

        System.out.println("Arealet av sirkelen med radius" + " " + radius + " er " + arealMedToDesimaler + "\n" +
            "Omkretsen av sirkelen med radius " + radius  + " er " +  omkretsMedToDesimaler + "\n" +
            "Diameteren til sirkelen med radius " + radius + " er " + diameterMedToDesimaler);

    }
}






