package cadastro.produto.entidade;

public class Produto {
	
	private Integer id;
	private String nome;
	private Double preco;
	private String descricao;
	
	public Produto(String nome, Double preco, String descricao) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}

	public Produto() {
		
	}

	public Integer getId(){
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	
}
