package com.wolken.wolkenapp.DAO;

import java.util.List;

import com.wolken.wolkenapp.DTO.VegetableDTO;

public interface VegetableDAO {
	
	public void addVegetable(VegetableDTO vegetableDTO);
	
	public void updateVegetableNameById(int vegetableIdToUpdate, String vegetableNameToBeUpdated);
	
	public void DeleteVegetableById(int vegetableIdToDelete);
	
	public List<VegetableDTO> getAllVegetable();
	
	


}
