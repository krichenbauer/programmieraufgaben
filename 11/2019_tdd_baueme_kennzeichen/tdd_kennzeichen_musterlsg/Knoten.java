/* Aufgabe 2a */
class Knoten
{
    Nummernschild verwaltet;

    Knoten(Nummernschild n) {
        verwaltet = n;
    }

    Nummernschild nummernschildGeben() {
        return verwaltet;
    }

    /* Aufgabe 2c */
    Knoten links;
    Knoten rechts;
    void knotenLinksSetzen(Knoten k) {
        links = k;
    }

    void knotenRechtsSetzen(Knoten k) {
        rechts = k;
    }

    Knoten knotenLinksGeben() {
        return links;
    }

    Knoten knotenRechtsGeben() {
        return rechts;
    }

    /* Aufgabe 3a 
    void einfuegen(Nummernschild n) {
    if (n.istVor(verwaltet)) {
    if ( links == null) {
    links = new Knoten(n);
    } else {
    links.einfuegen(n);
    }
    } else {
    if (rechts == null) {
    rechts = new Knoten(n);
    } else {
    rechts.einfuegen(n);
    }
    }
    }
     */

    /* Aufgabe 3b
    void einfuegen(Nummernschild n) {
        if (!n.istGleich(verwaltet)) {
            if (n.istVor(verwaltet)) {
                if ( links == null) {
                    links = new Knoten(n);
                } else {
                    links.einfuegen(n);
                }
            } else {
                if (rechts == null) {
                    rechts = new Knoten(n);
                } else {
                    rechts.einfuegen(n);
                }

            }
        }
    }
    */
    /* Aufgabe 3c */
    String einfuegen(Nummernschild n) {
        if (!n.istGleich(verwaltet)) {
            if (n.istVor(verwaltet)) {
                if ( links == null) {
                    links = new Knoten(n);
                    return "l";
                } else {
                    return "l"+links.einfuegen(n);
                }
            } else {
                if (rechts == null) {
                    rechts = new Knoten(n);
                    return "r";
                } else {
                    return "r"+rechts.einfuegen(n);
                }

            }
        } else {
            return "";
        }
    }

}
