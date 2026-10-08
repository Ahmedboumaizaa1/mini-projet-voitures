package com.ahmed.voitures.service;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  com.ahmed.voitures.repo.VoitureRepository;
import com.ahmed.voitures.entities.Type;
import com.ahmed.voitures.entities.voiture;

@Service
public class VoitureServiceImpl implements VoitureService{
	
	private final VoitureRepository VoitureRepository;
	
	
	
	public VoitureServiceImpl(com.ahmed.voitures.repo.VoitureRepository voitureRepository) {
		super();
		VoitureRepository = voitureRepository;
	}

	@Override
	public voiture saveVoiture(voiture v) {
		return VoitureRepository.save(v);
	}

	@Override
	public voiture updateVoiture(voiture v) {
		return VoitureRepository.save(v);
	}

	@Override
	public void deleteVoiture(voiture v) {
		 VoitureRepository.delete(v);
	}

	@Override
	public void deleteVoitureById(Long id) {
		 VoitureRepository.deleteById(id);
		
	}

	@Override
	public voiture getVoiture(Long id) {
		 return VoitureRepository.findById(id).get();
	}

	@Override
	public List<voiture> getAllVoitures() {

		return VoitureRepository.findAll();
	}

	@Override
	public List<voiture> findByNomVoiture(String nom) {
		return VoitureRepository.findBynomVoiture(nom);
	}

	@Override
	public List<voiture> findByNomVoitureContains(String nom) {
		return VoitureRepository.findBynomVoitureContains(nom);
	}

	@Override
	public List<voiture> findByNomPrix(String nom, Double prix) {
		return VoitureRepository.findBynomVoitureContains(nom);
	}

	@Override
	public List<voiture> findByType(Type type) {
		return VoitureRepository.findByType(type);
	}

	@Override
	public List<voiture> findByTypeIdType(Long id) {
		return VoitureRepository.findByTypeIdType(id);
	}

	@Override
	public List<voiture> findByOrderByNomVoitureAsc() {
		return VoitureRepository.findByOrderByNomVoitureAsc();
	}	

	@Override
	public List<voiture> trierVoituresNomsPrix() {
		return VoitureRepository.trierVoituresNomsPrix();
	}

}
