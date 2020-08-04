package br.com.minhaRedeSocial.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.minhaRedeSocial.model.Tema;

public interface TemaRepository extends JpaRepository <Tema, Long> {

}
