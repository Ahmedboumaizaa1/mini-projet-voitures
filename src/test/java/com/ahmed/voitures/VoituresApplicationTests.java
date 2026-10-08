package com.ahmed.voitures;
import java.sql.Date;
import java.util.List;
import com.ahmed.voitures.entities.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ahmed.voitures.entities.voiture;
import com.ahmed.voitures.repo.VoitureRepository;

@SpringBootTest
class VoituresApplicationTests {

	@Autowired
	private VoitureRepository voitureRepository;

	@Test
	public void testCreateVoiture() {
		voiture voit = new voiture("BMW X5", 309000.000, new Date(System.currentTimeMillis()));
		voitureRepository.save(voit);
	}

	@Test
	public void testFindVoiture() {
		voiture v = voitureRepository.findById(1L).get();
		System.out.println(v);
	}

	@Test
	public void testUpdateVoiture() {
		voiture v = voitureRepository.findById(1L).get();
		v.setPrixVoiture(410500.0);
		voitureRepository.save(v);
	}

	@Test
	public void testDeleteVoiture()
	{
		voitureRepository.deleteById(1L);;
	}
		
	@Test
	public void testListerToutesVoitures() {
		List<voiture> voitures = voitureRepository.findAll();
		for (voiture v : voitures) {
			System.out.println(v);
		}
	}
	
	@Test
	public void testFindVoitureByNom() {
		List<voiture> voitures = voitureRepository.findBynomVoiture("BMW X6");
		for (voiture v : voitures) {
			System.out.println(v);
		}
	}

	@Test
	public void testFindVoitureByNomContains() {
		List<voiture> voitures = voitureRepository.findBynomVoitureContains("B");
		for (voiture v : voitures) {
			System.out.println(v);
		}
	}
	
	@Test
	public void testfindByNomPrix()
	{
	List<voiture> voitures = voitureRepository.findByNomPrix("BMW X6", 300000.0);
	for (voiture v : voitures)
	{
	System.out.println(v);
	}
	}
	
	@Test
	public void testFindByType() {
		Type type = new Type();
		type.setIdType(1L);

		List<voiture> voitures = voitureRepository.findByType(type);

		for (voiture v : voitures) {
			System.out.println(v);
		}
	}
	
	@Test
	public void testFindByTypeIdType() {
		List<voiture> voitures = voitureRepository.findByTypeIdType(1L);

		for (voiture v : voitures) {
			System.out.println(v);
		}
	}
	
	@Test
	public void testFindByOrderByNomVoitureAsc() {
		List<voiture> voitures = voitureRepository.findByOrderByNomVoitureAsc();

		for (voiture v : voitures) {
			System.out.println(v);
		}
	}
	
	@Test
	public void testTrierVoituresNomsPrix() {
		List<voiture> voitures = voitureRepository.trierVoituresNomsPrix();

		for (voiture v : voitures) {
			System.out.println(v);
		}
	}

	

}