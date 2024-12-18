package modelo;

public enum Cargo {
	IT("Tecnico informatico"),
	CF("Contabilista Financeiro"),
	MT("Motorista"),
	SA("Secretaria");
	
	private String descricao;
	
	Cargo(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
