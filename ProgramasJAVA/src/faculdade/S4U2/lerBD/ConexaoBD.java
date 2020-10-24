package faculdade.S4U2.lerBD;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

public class ConexaoBD {

    private Connection con = null;

    private final String jdbcDriver = "com.mysql.cj.jdbc.Driver";

    private final String prefixoBD = "jdbc:mysql://";

    private final String nomeHost = "localhost";

    private final String portaBD = "3306";

    private final String nomeBD = "bd_empresas";

    private final String tempo = "?useTimezone=true&serverTimezone=UTC";
    
    private final String usuario = "root";

    private final String senha = "root";
     
    private String url = null;

    public ConexaoBD() {
    	
        url = prefixoBD + nomeHost +":"+ portaBD +"/"+ nomeBD + tempo ;

    }

    public Connection getConexao() {

        try {

            if (con == null) {

                Class.forName(jdbcDriver);

                con=DriverManager.getConnection(url,usuario,senha);

            } else if (con.isClosed()) {

                con = null;

                return getConexao();

            }

        } catch (ClassNotFoundException ex) {

            System.out.println(ex);

        } catch (SQLException ex) {

            System.out.println(ex);

        }

        return con;

    }

    public void fecharConexao() {

        if (con != null) {

            try {

                con.close();

            } catch (SQLException ex) {

                System.out.println(ex);

            }

        }

    }

}