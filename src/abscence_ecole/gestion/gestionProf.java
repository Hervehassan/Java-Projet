
package abscence_ecole.gestion;

import abscence_ecole.classe.Prof;
import abscence_ecole.connexion.Connexion;

public class gestionProf {
    public Connexion con;
    
    public gestionProf() throws Exception{
        con=new Connexion();
    }
    
    public void insert(Prof obj) throws Exception{
        String query="INSERT INTO Prof(nomProf,prenomProf,Cin,adresseProf,telProf) VALUES('"+obj.getNom()+"','"+obj.getPrenom()+"','"+obj.getCin()+"','"+obj.getAdresse()+"','"+obj.getTel()+"')";
        con.executeUpdate(query);
        con.close();
    }
    
     public void update(int numProf, Prof obj) throws Exception {
        String query = "UPDATE Prof SET nomProf='" + obj.getNom()+ "',prenomProf='" + obj.getPrenom()+ "',adresseProf='" + obj.getAdresse() + "',Cin='" + obj.getCin() + "',telProf='" + obj.getTel() + "' where numProf='" + obj.getNumProf()+"'";
        con.executeUpdate(query);
        con.close();
    }
     
     public void delete(int numProf) throws Exception {
        String query = "DELETE FROM Prof WHERE numProf='" + numProf + "'";
        con.executeUpdate(query);
        con.close();
    }
    
}
