public class Fahrzeugregister
{
    Knoten wurzel;
    
    Knoten wurzelGeben() {
        return wurzel;
    }

    /* Aufgabe 2b 
    void einfuegen(Nummernschild n) {
        wurzel = new Knoten(n);
    }
    */
    
    /* Aufgabe 3a 
    void einfuegen(Nummernschild n) {
        if (wurzel == null) {
            wurzel = new Knoten(n);
        } else {
            wurzel.einfuegen(n);
        }
    }
    */
    /* Aufgabe 3c */
    String einfuegen(Nummernschild n) {
        if (wurzel == null) {
            wurzel = new Knoten(n);
            return "w";
        } else {
            return "w"+wurzel.einfuegen(n);
        }
    }

    

}