package metier;
import java.util.Date;

public class Compte {
    // Attributs privés de la classe.
    private int code; // Code du compte.
    private int solde; // Solde du compte.
    private Date dateCreation; // Date de création du compte.

    // Constructeur avec paramètres permettant d'initialiser les attributs lors de la création d'un objet Compte.
    public Compte(int code, int solde, Date date) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = date;
    }

    // Constructeur par défaut.
    public Compte() {

    }

    // Méthode getter pour récupérer la valeur de l'attribut code.
    public int getCode() {
        return code;
    }

    // Méthode setter pour modifier la valeur de l'attribut code.
    public void setCode(int code) {
        this.code = code;
    }

    // Méthode getter pour récupérer la valeur de l'attribut solde.
    public int getSolde() {
        return solde;
    }

    // Méthode setter pour modifier la valeur de l'attribut solde.
    public void setSolde(int solde) {
        this.solde = solde;
    }

    // Méthode getter pour récupérer la valeur de l'attribut dateCreation.
    public Date getDateCreation() {
        return dateCreation;
    }

    // Méthode setter pour modifier la valeur de l'attribut dateCreation.
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
