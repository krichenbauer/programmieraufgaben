public class Knoten
{
    DatenElement meinDatenElement;
    Knoten nachfolgeKnoten;

    Knoten(DatenElement d) {
        meinDatenElement = d;
    }

    void nachfolgerHinzufuegen(Knoten k) {
        if (nachfolgeKnoten==null) {
            nachfolgeKnoten = k;
        } else {
            nachfolgeKnoten.nachfolgerHinzufuegen(k);
        }
    }

    Knoten letztenKnotenEntnehmen() {
       if (nachfolgeKnoten.istLetzterKnoten()) {
            Knoten result = nachfolgeKnoten;
            nachfolgeKnoten = null;
            return result;
        } else {
            return nachfolgeKnoten.letztenKnotenEntnehmen();
        }
    }
    
    DatenElement datenElementGeben() {
        return meinDatenElement;
    }
    
    boolean istLetzterKnoten() {
        if (nachfolgeKnoten == null) {
            return true;
        } else {
            return false;
        }
    }
}
