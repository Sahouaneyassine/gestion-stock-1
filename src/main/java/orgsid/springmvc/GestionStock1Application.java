package orgsid.springmvc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import orgsid.springmvc.dao.ProduitRepository;
import orgsid.springmvc.dao.RoleRepository;
import orgsid.springmvc.dao.UserRepository;
import orgsid.springmvc.entities.Role;
import orgsid.springmvc.entities.User;

@SpringBootApplication
public class GestionStock1Application implements CommandLineRunner {
	
	
	@Autowired
	private  ProduitRepository produitRepository ;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		
		SpringApplication.run(GestionStock1Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception { 
		//oduit p1 = new Produit(null,"PC Portable",100,30);
	    //roduitRepository.save(p1);
		//User admin = new User(null, "admin", "password", true, roles)
		

		//roleRepository.save(roleUser);
		//roleRepository.save(roleAdmin);
//		List <Role> rolesuser = new ArrayList<Role>();
//		rolesuser.add(roleRepository.findByRole("ROLE_USER"));
//		List <Role> rolesadmin = new ArrayList<Role>();
//		rolesadmin.add(roleRepository.findByRole("ROLE_ADMIN"));
//		rolesadmin.add(roleRepository.findByRole("ROLE_USER"));
//
//		
//		User user = new User(null, "username", "password1", true,rolesuser);
//		User admin = new User(null, "admin", "password2", true, rolesadmin);
//		userRepository.save(user);
//		userRepository.save(admin);
		
	
		
	}
	

}
