package br.org.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogpessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
	List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
	//findaAll = ache tudo - ByTitulo = por titulo - Containing = seria equivalente ao like - IgnoreCase = ignorar maiusculo e minusculo 
		/*Select * from tb_postagens where titulo like "%titulo%"; */

}
 