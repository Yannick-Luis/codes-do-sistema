package Serviços;

import java.io.Serializable;

import jakarta.persistence.PersistenceContext;
import modelo.Funcionarios;
import repositorio.Funcionario;
import util.Transacional;

public class CadastroFuncioServiços implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
    private Funcionario funcionario;

    @Transacional
    public void salvar(Funcionarios funcionarios) {
        Funcionario.guardar(funcionarios);
    }

    @Transacional
    public void excluir(Funcionarios funcionarios) {
        Funcionario.remover(funcionarios);
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
