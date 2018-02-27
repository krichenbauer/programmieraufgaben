class Produkt
{
    String bezeichnung;
    int artikelNr;
    int preis;

    Produkt(String neueBezeichnung, int neueArtikelNr, int neuerPreis)
    {
        bezeichnung = neueBezeichnung;
        artikelNr = neueArtikelNr;
        preis = neuerPreis;
    }

    String bezeichnungGeben() {
        return bezeichnung;
    }

    int artikelNrGeben() {
        return artikelNr;
    }

    int preisGeben() {
        return preis;
    }

    //Aufgabe 1b
    boolean istKleinerAls(Produkt anderesProdukt) {
        return artikelNrGeben() < anderesProdukt.artikelNrGeben();
    }
}
