
package abscence_ecole.gestion;

import abscence_ecole.classe.Eleve;
import abscence_ecole.connexion.Connexion;
import java.sql.*;

public class gestionEleve {
    public Connexion con;
    
    public gestionEleve()throws Exception{
        con=new Connexion();
    }
    
    public void insert(Eleve obj) throws Exception{
        String query="INSERT INTO Eleve VALUES('"+obj.getNumMat()+"','"+obj.getNom()+"','"+obj.getPrenom()+"','"+obj.getDate()+"','"+obj.getLieu()+"','"+obj.getNomPere()+"','"+obj.getNomMere()+"','"+obj.getAdresse()+"','"+obj.getTel()+"','"+obj.getAnnee()+"','"+obj.getLibClass()+"')";
        con.executeUpdate(query);
        con.close();
    }
    
     public void update(String numMat, Eleve obj) throws Exception {
        String query = "UPDATE Eleve SET numMat='"+obj.getNumMat()+"', nomE='" + obj.getNom()+ "',prenomE='" + obj.getPrenom()+ "',dateNais='" + obj.getDate() + "',lieuNais='"+obj.getLieu()+"',adresse='" + obj.getAdresse() + "',tel='" + obj.getTel() + "',libClass='"+obj.getLibClass()+"',anneeSco='"+obj.getAnnee()+"' where numMat='" + obj.getNumMat()+"'";
        con.executeUpdate(query);
        con.close();
    }
     
     public void delete(int numMat) throws Exception {
        String query = "DELETE FROM Eleve WHERE numMat='" + numMat + "'";
        con.executeUpdate(query);
        con.close();
    }
     
     
}
