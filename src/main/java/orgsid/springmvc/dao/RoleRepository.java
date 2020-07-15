package orgsid.springmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import orgsid.springmvc.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Role findByRole(String role);
	

}
