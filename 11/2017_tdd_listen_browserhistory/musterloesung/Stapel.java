public class Stapel
{
    public Knoten beginn;
        
    public Stapel()
    {

    }
    
    void knotenHinzufuegen(Knoten k) {
        if (beginn == null) {
            beginn = k;
        } else {
            beginn.nachfolgerHinzufuegen(k);
        }
    }
    
    Knoten letztenKnotenEntnehmen() {
        if (beginn == null) {return null;}
        if (beginn.istLetzterKnoten()) {
            Knoten result = beginn;
            beginn = null;
            return result;
        } else {
            return beginn.letztenKnotenEntnehmen();
        }
        
    }

}
