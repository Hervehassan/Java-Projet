
package abscence_ecole.classe;

public class Prof {
    private int numProf;
    private String nom;
    private String prenom;
    private String cin;
    private String adresse;
    private String tel;

    public Prof() {
    }

    public Prof(String nom, String prenom, String cin, String adresse, String tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.adresse = adresse;
        this.tel = tel;
    }

    
    public Prof(int numProf, String nom, String prenom, String cin, String adresse, String tel) {
        this.numProf = numProf;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.adresse = adresse;
        this.tel = tel;
    }

    public int getNumProf() {
        return numProf;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCin() {
        return cin;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setNumProf(int numProf) {
        this.numProf = numProf;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
    
}
