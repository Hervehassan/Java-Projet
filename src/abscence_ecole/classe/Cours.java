
package abscence_ecole.classe;


public class Cours {
    private int numero;
    private String classe;
    private String matiere;
    private String jour;
    private String date;

    public Cours() {
    }

    public Cours(int numero, String classe, String matiere, String jour, String date) {
        this.numero = numero;
        this.classe = classe;
        this.matiere = matiere;
        this.jour = jour;
        this.date = date;
    }

    public Cours(String classe, String matiere, String jour, String date) {
        this.classe = classe;
        this.matiere = matiere;
        this.jour = jour;
        this.date = date;
    }

    public int getNumero() {
        return numero;
    }

    public String getClasse() {
        return classe;
    }

    public String getMatiere() {
        return matiere;
    }

    public String getJour() {
        return jour;
    }

    public String getDate() {
        return date;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
}
