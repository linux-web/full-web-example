package info.hb.repository;

import info.hb.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByEmail(String email);

}
