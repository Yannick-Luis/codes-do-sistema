package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Funcionarios implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Nome",nullable = false, length = 80)
	private String nome;
	
	@Column(name = "Sobrenome",nullable = false, length = 120)
	private String sobrenome;
	
	
	@Column(name = "Email",nullable = false, length = 80)
	private String email;
	
	@Column(name = "Telefone",nullable = false ,length = 200)
	private String Telefone;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "Cargo",nullable = false, length = 30)
	private Cargo Cargo;
	
	@Column(name = "Bairro",nullable = false, length = 50)
	private String Bairro;
	 
	@Column(name = "Numero_casa",nullable = false, length = 10)
	private String numeroCasa;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "Data_nascimento")
	private Date DataNascimento;
	
	@ManyToOne
	@JoinColumn(name ="Credenciais_id")
private Credenciais Credenciais;

	@Override
	public String toString() {
		return "Funcionarios [id=" + id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionarios other = (Funcionarios) obj;
		return Objects.equals(id, other.id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public Cargo getCargo() {
		return Cargo;
	}

	public void setCargo(Cargo cargo) {
		Cargo = cargo;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public Date getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}

	public Credenciais getCredenciais() {
		return Credenciais;
	}

	public void setCredenciais(Credenciais credenciais) {
		Credenciais = credenciais;
	}
	

}
