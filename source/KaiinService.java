package com.example.kaiin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.kaiin.Kaiin;

@Service
public class KaiinService {
	
	@Autowired
	KaiinRepository kaiinRepo;

	public void register(Kaiin kaiin) {
		kaiinRepo.save(kaiin);
	}	
	
	public List<Kaiin> query() {
		return kaiinRepo.findAll();
		
	}

	public void delete(Kaiin kaiin) {
		List<Kaiin> kaiinList = kaiinRepo.findByUserid(kaiin.getUserId());
		kaiin.setName(kaiinList.get(0).getName());
		kaiinRepo.delete(kaiin);
	}
}
