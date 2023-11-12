package serveur;
import jakarta.xml.ws.Endpoint;
import service.BanqueService;

public class ServeurJWS {
    // Méthode principale exécutée au démarrage du serveur.
    public static void main(String[] args) {
        // Publication du service web BanqueService à l'adresse http://localhost:8084/.
        Endpoint.publish("http://localhost:8084/", new BanqueService());

        // Affichage de l'adresse du service publié dans la console.
        System.out.println("Le service est publié à l'adresse : http://localhost:8084/");
    }
}