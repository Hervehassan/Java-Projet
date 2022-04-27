
package abscence_ecole.gestion;

import abscence_ecole.classe.Absence;
import abscence_ecole.connexion.Connexion;

public class gestionAbsent {
     public Connexion con;
    
    public gestionAbsent()throws Exception{
        con=new Connexion();
    }
    
    public void insert(Absence obj) throws Exception{
        String query="INSERT INTO Absence(numMat,numCours,dateAbs,dateRetour,motif) VALUES('"+obj.getNumCour()+"','"+obj.getNumMat()+"','"+obj.getDateD()+"','"+obj.getDateF()+"','"+obj.getMotif()+"')";
        con.executeUpdate(query);
        con.close();
    }
    
     public void update(int id, Absence obj) throws Exception {
        String query = "UPDATE Absence SET numCours='" + obj.getNumCour()+ "',numMat='" + obj.getNumMat()+ "',dateAbs='"+obj.getDateD()+"',dateRetour='" + obj.getDateF() + "',motif='" + obj.getMotif()+ "',id='"+obj.getId()+"' where id='" + obj.getId()+"'";
        con.executeUpdate(query);
        con.close();
    }
     
     public void delete(int id) throws Exception {
        String query = "DELETE FROM Absence WHERE id='" + id + "'";
        con.executeUpdate(query);
        con.close();
    }
}
