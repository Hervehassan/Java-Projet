
package abscence_ecole.classe;

public class Utilisateur {
    
    private String nom;
    private String mdp;
    private String mdpC;

    public Utilisateur() {
    }

    public Utilisateur(String nom, String mdp, String mdpC) {
        this.nom = nom;
        this.mdp = mdp;
        this.mdpC = mdpC;
    }

    public String getNom() {
        return nom;
    }

    public String getMdp() {
        return mdp;
    }

    public String getMdpC() {
        return mdpC;
    }
    

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setMdpC(String mdpC) {
        this.mdpC = mdpC;
    }
    
    
    
}
