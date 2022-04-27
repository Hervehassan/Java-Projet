
package abscence_ecole.classe;


public class Eleve {
    private String numMat;
    private String nom;
    private String prenom;
    private String date;
    private String lieu;
    private String nomPere;
    private String nomMere;
    private String adresse;
    private String tel;
    private String annee;
    private String libClass;
    
    public Eleve(){
    }

    public Eleve(String numMat, String nom, String prenom, String date, String lieu, String nomPere, String nomMere, String adresse, String tel, String annee, String libClass) {
        this.numMat = numMat;
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.lieu = lieu;
        this.nomPere = nomPere;
        this.nomMere = nomMere;
        this.adresse = adresse;
        this.tel = tel;
        this.annee = annee;
        this.libClass = libClass;
    }

    public Eleve(String numMat, String nom, String prenom, String date, String lieu, String adresse, String tel, String annee, String libClass) {
        this.numMat = numMat;
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.lieu = lieu;
        this.adresse = adresse;
        this.tel = tel;
        this.annee = annee;
        this.libClass = libClass;
    }

   

    public String getNumMat() {
        return numMat;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDate() {
        return date;
    }

    public String getLieu() {
        return lieu;
    }

    public String getNomPere() {
        return nomPere;
    }

    public String getNomMere() {
        return nomMere;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTel() {
        return tel;
    }

    public String getAnnee() {
        return annee;
    }

    public String getLibClass() {
        return libClass;
    }

    public void setNumMat(String numMat) {
        this.numMat = numMat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public void setNomPere(String nomPere) {
        this.nomPere = nomPere;
    }

    public void setNomMere(String nomMere) {
        this.nomMere = nomMere;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public void setLibClass(String libClass) {
        this.libClass = libClass;
    }
    
    
    
    
}
