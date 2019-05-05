package com.convergence.TechfestManagementSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.convergence.TechfestManagementSystem.model.College;
import com.convergence.TechfestManagementSystem.model.KeyGeneratedByCampaigner;
import com.convergence.TechfestManagementSystem.model.KeyGeneratedByProctor;
import com.convergence.TechfestManagementSystem.repository.KeyGeneratedByCampaignerRepository;

@Service
public class KeyGeneratedByCampaignerService {

	@Autowired
	private KeyGeneratedByCampaignerRepository keyCampaignerRepository;

	public List<KeyGeneratedByCampaigner> getAllKeys() {
		List<KeyGeneratedByCampaigner> keyList = new ArrayList<KeyGeneratedByCampaigner>();
		keyCampaignerRepository.findAll().forEach(keyList::add);
		;
		return keyList;
	}

	public List<KeyGeneratedByCampaigner> getAllKeysByProctr(String campaignerName) {
		List<KeyGeneratedByCampaigner> keyList = new ArrayList<KeyGeneratedByCampaigner>();
		keyCampaignerRepository.findByAddedBy(campaignerName).forEach(keyList::add);
		return keyList;
	}
	
	public void addKeyByCampaigener(String name, String email, College college, String mobileNo) {
		KeyGeneratedByCampaigner key = new KeyGeneratedByCampaigner();
		key.setName(name);
		key.setEmail(email);
		key.setCollege(college);
		key.setMobileNo(mobileNo);
		key.setRegistered(false);
		key.setAddedBy("Change it here");
		key.setKey(randomAlphaNumeric(8));
		keyCampaignerRepository.save(key);
	}

	public void deleteKeyByCampaigner(Long id) {
		keyCampaignerRepository.deleteById(id);
	}
	
	public static String randomAlphaNumeric(int count) {
		final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789#$+=*";
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}
}
