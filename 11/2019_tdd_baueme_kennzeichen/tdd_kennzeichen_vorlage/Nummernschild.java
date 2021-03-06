class Nummernschild
{
    String kennzeichen;
    
    Nummernschild(String k)
    {
        kennzeichen = k;
    }

    String kennzeichenGeben() {
        return kennzeichen;
    }
    
    /**
     * istVor(anderesNummernschild) ermittelt, ob ein Nummernschild lexikografisch
     * vor einem anderen einzuordnen ist.
     */
    boolean istVor(Nummernschild anderesNummernschild) {
        if (kennzeichen.compareToIgnoreCase(anderesNummernschild.kennzeichenGeben()) < 0) {
            return true;
        } else {
            return false;
        }
    }
}