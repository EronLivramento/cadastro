package cadastro.produto.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cadastro.produto.DAO.ProdutoDAO;
import cadastro.produto.entidade.Produto;

public class BuscarTodos implements Tarefa{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.buscarTodos();
		System.out.println(produtos.size());
		req.setAttribute("produtos", produtos);
		return "buscarTodos.jsp";
	}

}
