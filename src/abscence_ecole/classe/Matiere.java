
package abscence_ecole.classe;

public class Matiere {
    private String libMat;
    private String nom;
    private int numProf;

    public Matiere() {
    }

    public Matiere(String libMat, String nom, int numProf) {
        this.libMat = libMat;
        this.nom = nom;
        this.numProf = numProf;
    }

    public String getLibMat() {
        return libMat;
    }

    public String getNom() {
        return nom;
    }

    public int getNumProf() {
        return numProf;
    }

    public void setLibMat(String libMat) {
        this.libMat = libMat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumProf(int numProf) {
        this.numProf = numProf;
    }
    
    
}
