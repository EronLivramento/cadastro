package cadastro.produto.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cadastro.produto.DAO.ProdutoDAO;
import cadastro.produto.entidade.Produto;

public class ProdutoNovo implements Tarefa{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		Produto produto = new Produto();
		produto.setNome(req.getParameter("nome"));
		produto.setPreco(Double.parseDouble( req.getParameter("preco") ));
		produto.setDescricao(req.getParameter("descricao"));
		ProdutoDAO dao = new ProdutoDAO();
		dao.save(produto);
		return "/index.jsp";
	}

}
