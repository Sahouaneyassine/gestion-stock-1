package orgsid.springmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import orgsid.springmvc.entities.Produit;
@RepositoryRestController
public interface ProduitRepository extends JpaRepository<Produit, Long> {
	

}
