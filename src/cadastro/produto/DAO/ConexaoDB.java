package cadastro.produto.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class ConexaoDB {
	
	private static ConexaoDB conexao;
	private final static String URL = "jdbc:mysql://localhost/cadastro";
	private final static String USUARIO = "root";
	private final static String SENHA = "1234";
	
	private ConexaoDB(){}
	
	public static ConexaoDB getInstacia(){
		if(conexao == null){
			conexao = new ConexaoDB();
		}
		return conexao;
	}
	public Connection getConexao() throws SQLException{
		Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USUARIO, SENHA);
		}catch(SQLException | ClassNotFoundException e){
			throw new SQLException("Não foi possivel conectar ao banco"); 
		}
		return conn;
	}
	
	public static void close(Connection conn, PreparedStatement pstm,ResultSet rs){
		try {
            if (rs != null) {
                rs.close();
            }
            if (pstm != null) {
                pstm.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
	}
	
	public static void close(Connection conn, PreparedStatement pstm) {
        try {
            if (pstm != null) {
                pstm.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }
     public static void close(PreparedStatement pstm, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstm != null) {
                pstm.close();
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
}
