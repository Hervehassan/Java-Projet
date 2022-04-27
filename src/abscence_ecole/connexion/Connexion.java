
package abscence_ecole.connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Connexion {
    public Connection con;
    public Statement st;
    
    public Connexion() throws Exception{
       Class.forName("com.mysql.jdbc.Driver");
       con =  DriverManager.getConnection(Constant.URL,Constant.USER,Constant.PASSWORD);
       st = con.createStatement();
                
    }
    public ResultSet execute (String query) throws Exception{
        ResultSet res=null;
        res=st.executeQuery(query);
        return(res);
    }
    
    public int executeUpdate (String query) throws Exception{
        int res=0;
        res=st.executeUpdate(query);
        return(res);
    }

    public void close() throws Exception{
            st.close();
            con.close();
    }
    
}
