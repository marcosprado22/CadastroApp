package br.com.cadastroapp.repository;

import br.com.cadastroapp.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository <User, Long>{
    Optional<User> findByEmail(String email);

    void salvar(User user);
}
