
package abscence_ecole.classe;

public class Absence {
    private String numCour;
    private String numMat;
    private String dateD;
    private String dateF;
    private String motif;
    private int id;

    public Absence() {
        
    }

    public Absence(String numCour, String numMat, String dateD, String dateF, String motif) {
        this.numCour = numCour;
        this.numMat = numMat;
        this.dateD = dateD;
        this.dateF = dateF;
        this.motif = motif;
    }

    public Absence(String numCour, String numMat, String dateD, String dateF, String motif, int id) {
        this.numCour = numCour;
        this.numMat = numMat;
        this.dateD = dateD;
        this.dateF = dateF;
        this.motif = motif;
        this.id = id;
    }

    public String getNumCour() {
        return numCour;
    }

    public String getNumMat() {
        return numMat;
    }

    public String getDateD() {
        return dateD;
    }

    public String getDateF() {
        return dateF;
    }

    public String getMotif() {
        return motif;
    }

    public int getId() {
        return id;
    }

    public void setNumCour(String numCour) {
        this.numCour = numCour;
    }

    public void setNumMat(String numMat) {
        this.numMat = numMat;
    }

    public void setDateD(String dateD) {
        this.dateD = dateD;
    }

    public void setDateF(String dateF) {
        this.dateF = dateF;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public void setId(int id) {
        this.id = id;
    }


    
  
    
    
}
