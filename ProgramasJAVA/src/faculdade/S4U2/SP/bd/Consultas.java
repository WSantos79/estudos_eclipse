package faculdade.S4U2.SP.bd;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Jesimar da Silva Arantes
 * C�digo 4.14
 */
public class Consultas {
    
    public void inserirPos(Connection connection, float posX, float posY){
        try {
            Statement st = connection.createStatement();
            String sql = "INSERT INTO `rota` (posx, posy) " + 
                    "VALUES (" + posX + ", " + posY + ")";
            st.executeUpdate(sql);
            st.close();
        } catch (SQLException ex) {
            System.out.println("Problema de acesso ao banco de dados");
            System.out.println(ex);
        }
    }
}
