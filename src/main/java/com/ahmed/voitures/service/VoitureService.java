package com.ahmed.voitures.service;
import java.util.List;
import com.ahmed.voitures.entities.voiture;

import com.ahmed.voitures.entities.Type;
import com.ahmed.voitures.entities.voiture;
public interface VoitureService {

    voiture saveVoiture(voiture v);
    voiture updateVoiture(voiture v);
    void deleteVoiture(voiture v);
    void deleteVoitureById(Long id);
    voiture getVoiture(Long id);
    List<voiture> getAllVoitures();
    
    List<voiture> findByNomVoiture(String nom);
	List<voiture> findByNomVoitureContains(String nom);
	List<voiture> findByNomPrix(String nom, Double prix);
	List<voiture> findByType(Type type);
	List<voiture> findByTypeIdType(Long id);
	List<voiture> findByOrderByNomVoitureAsc();
	List<voiture> trierVoituresNomsPrix();
}