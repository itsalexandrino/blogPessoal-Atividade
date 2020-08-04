package br.com.minhaRedeSocial.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.minhaRedeSocial.model.Postagem;

public interface PostagemRepository extends JpaRepository <Postagem, Long> {

}