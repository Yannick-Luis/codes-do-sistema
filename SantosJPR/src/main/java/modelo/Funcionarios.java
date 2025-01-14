package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Entity; 

@Entity  
public class Funcionarios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nome", nullable = false, length = 80)
    private String nome;

    @Column(name = "Sobrenome", nullable = false, length = 120)
    private String sobrenome;

    @Column(name = "Email", nullable = false, length = 80)
    private String email;

    @Column(name = "Telefone", nullable = false, length = 200)
    private String telefone;

    @Enumerated(EnumType.STRING)
    @Column(name = "Cargo", nullable = false, length = 30)
    private Cargo cargo;

    @Column(name = "Bairro", nullable = false, length = 50)
    private String bairro;

    @Column(name = "Numero_casa", nullable = false, length = 10)
    private String numeroCasa;

    @Temporal(TemporalType.DATE)
    @Column(name = "Data_nascimento")
    private Date dataNascimento;

    @ManyToOne
    @JoinColumn(name = "Credenciais_id")
    private Credenciais credenciais;

    // Getters and setters

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
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Credenciais getCredenciais() {
        return credenciais;
    }

    public void setCredenciais(Credenciais credenciais) {
        this.credenciais = credenciais;
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

    @Override
    public String toString() {
        return "Funcionarios [id=" + id + "]";
    }

}
