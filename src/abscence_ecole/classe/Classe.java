
package abscence_ecole.classe;


public class Classe {
    private String libClass;
    private String nom;
    
    public Classe(){
    }

    public Classe(String libClass, String nom) {
        this.libClass = libClass;
        this.nom = nom;
    }

    public String getLibClass() {
        return libClass;
    }

    public String getNom() {
        return nom;
    }

    public void setLibClass(String libClass) {
        this.libClass = libClass;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
}
