package util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entity.Pessoa;

public class PessoaDao {
	
	private EntityManager em;
	
	public PessoaDao() {
		this.em = ConnectionFactory.getConnection();
	}
	
	public boolean inserir(Pessoa pessoa){
		boolean isInsert = false;
		try {
			 em.getTransaction().begin();
			 em.persist(pessoa);
			 em.getTransaction().commit();
			 isInsert = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			em.getTransaction().rollback();
		}
		
		return isInsert;
	}
	
	
	public void alterar(Pessoa pessoa){
		try {
			 em.getTransaction().begin();
			 Pessoa p = em.find(Pessoa.class, pessoa.getId());
			 p.setNome(pessoa.getNome());
			 p.setEndereco(pessoa.getEndereco());
			 p.setTelefone(pessoa.getTelefone());
			 em.persist(p);
			 em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			em.getTransaction().rollback();
		}
	}
	
	
	public List<Pessoa> recuperarPessoas(){
		
		String jpql = "select p from Pessoa p";
		TypedQuery<Pessoa> query = this.em.createQuery(jpql, Pessoa.class);
		return query.getResultList();
	}
	
	

	
	
	
}
