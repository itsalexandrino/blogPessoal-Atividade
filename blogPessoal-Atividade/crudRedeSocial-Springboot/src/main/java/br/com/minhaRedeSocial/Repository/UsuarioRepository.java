package br.com.minhaRedeSocial.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.minhaRedeSocial.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

}