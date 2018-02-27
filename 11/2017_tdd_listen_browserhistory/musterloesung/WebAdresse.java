public class WebAdresse extends DatenElement {
    String meineUrl;
    
    WebAdresse(String url) {
        meineUrl = url;
    }   
    
    String adresseGeben() {
        return meineUrl;
    }
    
    String textGeben() {
        return adresseGeben();
    }
}