class Bestellung
{
    String sorte;

    //zu Teilaufgabe b)
    boolean gross;
    
    
    public Bestellung(String s)
    {
        sorte = s;

        //zu Teilaufgabe b)
        gross = false;
        
        
        //zu Teilaufgabe c)      5 = Kaffee, 23 = Spezi, 42 = Cola.
        if (s.equals("5")) {
            sorte = "Kaffee";
        } else if (s.equals("23")) {
            sorte = "Spezi";
        } else if (s.equals("42")) {
            sorte = "Cola";
        } 
    }
    
    
    String sorteGeben() {
        return sorte;
    }

    //zu Teilaufgabe b)
    void grossSetzen() {
        gross = true;
    }
    
    boolean istGross() {
        return gross;
    }
    
    String groesseGeben() {
        return gross?"gross":"klein";
    }
    

    
}
