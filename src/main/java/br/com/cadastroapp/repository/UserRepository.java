package br.com.cadastroapp.repository;

import br.com.cadastroapp.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository <User, Long>{

    void salvar(User user);
}
