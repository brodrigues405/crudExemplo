package entity;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import util.PessoaDao;

@SessionScoped
@ManagedBean
public class PessoaBean {
	
	private Pessoa pessoa = new Pessoa();
	private List<Pessoa> pessoas = null;
			
	
	public PessoaBean() {
		// TODO Auto-generated constructor stub
	}
	
	public void cadastrarPessoa(){
		if(new PessoaDao().inserir(this.pessoa)){
			 this.pessoa = new Pessoa();
			 
		}
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getPessoas() {
		
		if(this.pessoas == null){
			this.pessoas = new PessoaDao().recuperarPessoas();
		}
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	

}
