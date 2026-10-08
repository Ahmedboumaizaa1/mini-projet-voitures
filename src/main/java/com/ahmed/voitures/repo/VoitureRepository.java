package com.ahmed.voitures.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ahmed.voitures.entities.voiture;
import java.util.List;
import com.ahmed.voitures.entities.Type;
@RepositoryRestResource(path = "rest")

public interface VoitureRepository extends JpaRepository<voiture, Long> {

	List<voiture> findBynomVoiture(String nom);
	List<voiture> findBynomVoitureContains(String nom);
	
	/*@Query("select p from voiture p where p.nomVoiture like %?1 and p.prixVoiture > ?2")
	List<voiture> findByNomPrix (String nom, Double prix);*/
	@Query("select p from voiture p where p.nomVoiture like concat('%', :nom) and p.prixVoiture > :prix")
	List<voiture> findByNomPrix(@Param("nom") String nom, @Param("prix") Double prix);
	
	@Query("select v from voiture v where v.type = ?1")
	List<voiture> findByType(Type type);
	
	List<voiture> findByTypeIdType(Long id);
	
	List<voiture> findByOrderByNomVoitureAsc();
	
	@Query("select v from voiture v order by v.nomVoiture ASC, v.prixVoiture DESC")
	List<voiture> trierVoituresNomsPrix();
}
