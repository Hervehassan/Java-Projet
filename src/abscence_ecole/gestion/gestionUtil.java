
package abscence_ecole.gestion;

import abscence_ecole.classe.Utilisateur;
import abscence_ecole.connexion.Connexion;
import java.sql.*;

public class gestionUtil {
    public Connexion con;
    
    public gestionUtil() throws Exception{
        con=new Connexion();
    }
    
    public void insert(Utilisateur obj)throws Exception{
        String query="INSERT INTO Utilisateur(nomUt,mot_de_pass,Confirm) VALUES('"+obj.getNom()+"','"+obj.getMdp()+"','"+obj.getMdpC()+"')";
        con.executeUpdate(query);
        con.close();
    }
    
    public ResultSet getAll() throws Exception{
        String query="SELECT* FROM Utilisateur where nomUt=? and mot_de_pass=?";
        ResultSet rs=con.execute(query);
        con.close();
        
        return rs;       
    }
    
}
