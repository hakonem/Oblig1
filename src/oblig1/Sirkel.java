package oblig1;

public class Sirkel {

// Statisk metode som beregner og returnerer sirkelens diameter.
    static double beregnDiameter(double radius) {
        return radius * 2;
    }

// Statisk metode som beregner og returnerer sirkelens omkrets.
// Omkrets = 2*pi*r
    static double beregnOmkrets(double radius) {
        return 2 * Math.PI * radius;
    }

    /* Statisk metode som beregner og returnerer sirkelens areal.
       Areal = pi*r^2
       Math.PI kan brukes for en konstant for PI
       Math.pow kan brukes for å opphøye et tall i en potens
     */
    static double beregnAreal(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}


