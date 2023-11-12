package service;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import metier.Compte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {
    // Liste de comptes utilisée pour stocker des instances de la classe Compte.
    List<Compte> comptes = new ArrayList<Compte>();

    // Méthode de conversion de montant avec une annotation spécifiant le nom du paramètre dans la requête web.
    @WebMethod
    public double conversion(@WebParam(name = "montant") double montant) {
        // Conversion du montant en multipliant par un taux fixe.
        return montant * 3.3;
    }

    // Méthode pour obtenir un compte par son code avec une annotation spécifiant le nom du paramètre dans la requête web.
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        // Retourne un nouveau compte avec le code spécifié, un solde initial de 0 et la date actuelle.
        return new Compte(code, 0, new Date());
    }

    // Méthode pour obtenir la liste de tous les comptes.
    @WebMethod
    public List<Compte> getComptes() {
        // Création de deux comptes fictifs et ajout à la liste de comptes.
        Compte c1 = new Compte(0, 0, new Date());
        Compte c2 = new Compte(1, 0, new Date());
        comptes.add(c1);
        comptes.add(c2);

        // Retourne la liste complète de comptes.
        return comptes;
    }
}

