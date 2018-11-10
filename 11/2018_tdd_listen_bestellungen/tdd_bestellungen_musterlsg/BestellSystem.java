class BestellSystem
{
    Knoten anfang;
    
    BestellSystem()
    {
        anfang = null;
    }

    void bestellungHinzufuegen(Bestellung b) {
        if (anfang != null) {
            anfang.bestellungHinzufuegen(b);
        } else {
            anfang = new Knoten(b);
        }
    }
    
    Bestellung bestellungEntnehmen() {
        if (anfang != null) {
            Knoten k = anfang;
            anfang = anfang.nachfolgerGeben();
            return k.bestellungGeben();
        } else {
            return null;
        }
    }
    
    int kleineGetraenkeZaehlen() {
        if (anfang != null) {
            return anfang.kleineGetraenkeZaehlen();
        } else {
            return 0;
        }
    }
}
