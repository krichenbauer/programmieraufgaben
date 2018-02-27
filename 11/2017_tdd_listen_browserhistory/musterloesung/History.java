public class History
{
    Stapel meinStapel;

    public History()
    {
        meinStapel = new Stapel();
    }

    public void webAdresseHinzufuegen(String a)
    {
        WebAdresse w = new WebAdresse(a);
        Knoten k = new Knoten(w);
        meinStapel.knotenHinzufuegen(k);
    }

    public String webAdresseEntnehmen() {
        Knoten k = meinStapel.letztenKnotenEntnehmen();
        WebAdresse w = (WebAdresse)k.datenElementGeben();
        
        
        return w.adresseGeben();
       
    }
}
