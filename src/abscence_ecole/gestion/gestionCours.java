
package abscence_ecole.gestion;

import abscence_ecole.classe.Cours;
import abscence_ecole.connexion.Connexion;


public class gestionCours {
     public Connexion con;
    
    public gestionCours()throws Exception{
        con=new Connexion();
    }
    
    public void insert(Cours obj) throws Exception{
        String query="INSERT INTO Cours VALUES('"+obj.getNumero()+"','"+obj.getClasse()+"','"+obj.getMatiere()+"','"+obj.getJour()+"','"+obj.getDate()+"')";
        con.executeUpdate(query);
        con.close();
    }
    
     public void update(int numero, Cours obj) throws Exception {
        String query = "UPDATE Cours SET numCours='" + obj.getNumero()+ "',libClass='" + obj.getClasse()+ "',libMat='"+obj.getMatiere()+"',jour='" + obj.getJour()+ "',date='" + obj.getDate()+ "' where numCours='" + obj.getNumero()+"'";
        con.executeUpdate(query);
        con.close();
    }
     
     public void delete(int numero) throws Exception {
        String query = "DELETE FROM Cours WHERE numCours='" + numero + "'";
        con.executeUpdate(query);
        con.close();
    }
}
