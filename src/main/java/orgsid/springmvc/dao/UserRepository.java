package orgsid.springmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import orgsid.springmvc.entities.User;
import java.lang.String;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUsername(String username);

}
