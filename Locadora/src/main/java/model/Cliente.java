package model;


public class Cliente {
	
	
	private Integer id;
	private String nome;
	private String habilidade;
	private String aldeia;
	private Integer idade;
	private Boolean aposentado;
	
	public Cliente(Integer id, String nome, String habilidade, String aldeia, Integer idade, Boolean aposentado) {
		super();
		this.id = id;
		this.nome = nome;
		this.habilidade = habilidade;
		this.aldeia = aldeia;
		this.idade = idade;
		this.aposentado = aposentado;
	}
	

	public Cliente(String nome, String habilidade, String aldeia, Integer idade, Boolean aposentado) {
		super();
		this.nome = nome;
		this.habilidade = habilidade;
		this.aldeia = aldeia;
		this.idade = idade;
		this.aposentado = aposentado;
	}


	public Cliente() {
	
	}


	public Integer getId() {
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


	public String getHabilidade() {
		return habilidade;
	}


	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}


	public String getAldeia() {
		return aldeia;
	}


	public void setAldeia(String aldeia) {
		this.aldeia = aldeia;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	public Boolean getAposentado() {
		return aposentado;
	}


	public void setAposentado(Boolean aposentado) {
		this.aposentado = aposentado;
	}
	

}
