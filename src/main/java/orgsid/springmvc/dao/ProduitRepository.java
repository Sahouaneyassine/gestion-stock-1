package orgsid.springmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import orgsid.springmvc.entities.Produit;
@RepositoryRestController
@CrossOrigin("*")
public interface ProduitRepository extends JpaRepository<Produit, Long> {
	

}
