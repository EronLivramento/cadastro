package cadastro.produto.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cadastro.produto.entidade.Produto;

public class ProdutoDAO {
  
	private static final String INSERIR = "INSERT INTO PRODUTO(NOME,PRECO,DESCRICAO)VALUES(?,?,?)";
	private static final String EDITAR = "UPDATE PRODUTO SET NOME= ?,PRECO= ?,DESCRICAO= ? WHERE ID=?";
	private static final String BUSCAR_TODOS = "SELECT * FROM PRODUTO";
	
	public void save(Produto produto){
		if(produto.getId() == null){
			inserir(produto);
		}else{
			editar(produto);
		}
	}

	private void inserir(Produto produto) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			 conn =ConexaoDB.getInstacia().getConexao();
			pstm = conn.prepareStatement(INSERIR);
			pstm.setObject(1, produto.getNome());
			pstm.setObject(2, produto.getPreco());
			pstm.setObject(3, produto.getDescricao());
			pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConexaoDB.close(conn, pstm);
		}
		
	}
	private void editar(Produto produto) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try{
			 conn = ConexaoDB.getInstacia().getConexao();
			pstm = conn.prepareStatement(EDITAR);
			pstm.setObject(1, produto.getNome());
			pstm.setObject(2, produto.getPreco());
			pstm.setObject(2, produto.getDescricao());
			pstm.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			ConexaoDB.close(conn, pstm);
		}
	}
	
	public List<Produto> buscarTodos(){
		List<Produto> produtos = new ArrayList<>();
		Connection conn =null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try{
			conn= ConexaoDB.getInstacia().getConexao();
			pstm = conn.prepareStatement(BUSCAR_TODOS);
			
			rs = pstm.executeQuery();
			while(rs.next()){
				produtos.add(popularProduto(rs));
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			ConexaoDB.close(conn, pstm, rs);
		}
		
		return produtos;
	}

	private Produto popularProduto(ResultSet rs) throws SQLException {
		Produto retorno = new Produto();
		retorno.setId(rs.getInt("ID"));
		retorno.setNome(rs.getString("NOME"));
		retorno.setPreco(rs.getDouble("PRECO"));
		retorno.setDescricao(rs.getString("DESCRICAO"));
		return retorno;
	}

}
