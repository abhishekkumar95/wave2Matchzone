package com.matchzone.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matchzone.model.Result;
import com.matchzone.model.Search;
import com.matchzone.model.UserName;
import com.matchzone.repository.SearchRepository;

@Service
public class SearchServiceImpl implements SearchService{
	
	private SearchRepository searchRepository;

	@Autowired
	public SearchServiceImpl(SearchRepository searchRepository) {
		super();
		this.searchRepository = searchRepository;
	}

	public List<Result> search(Search search) {
		Set<UserName> list = new HashSet<>();
		if (!search.getSkills().isEmpty()) {
			list.addAll(searchRepository.getBySkill(search.getSkills()));
			//list.addAll(searchRepository.getBySameSkill(search.getSkills()));
			//logger.info(searchRepository.getBySkill(search.getSkills())+"Skill result");
		}
/*		if (!search.getLocation().isEmpty()) {
			list.addAll(searchRepository.getByLocation(search.getLocation()));
			//logger.info("Location RESULT"+UserNameRepository.getByLocation(search.getLocation()));
		}
		if (!search.getOrganization().isEmpty()) {
			list.addAll(searchRepository.getByOrganisation(search.getOrganization()));
			//logger.info("ORGANISATION RESULT"+searchRepository.getByOrganisation(search.getOrganization()));
			
		}*/

		/*if (!search.getYears().isEmpty()) {
			List<String> experince = search.getYears();
			for (String string : experince) {
				list.addAll(UserNameRepository.getByExperience(Integer.parseInt(string)));
				logger.info("EXPERINCE RESULT"+UserNameRepository.getByExperience(Integer.parseInt(string)));
				
			}
			
		}*/
		//String check;
		List<Result> result = new ArrayList<>();
		for (UserName profile : list) {
			Result resultProfile = new Result();
			resultProfile.setUserName(profile.getUserName());
			/*List<String> listOfSkills = searchRepository.getSkill(profile.getUserName());
			if (listOfSkills.isEmpty()) {
				listOfSkills.add(" ");
			}
			resultProfile.setSkills(listOfSkills);*/
			/*check = searchRepository.getDuration(profile.getUserName());
			resultProfile.setExperience(checkNull(check));
			check = searchRepository.getCity(profile.getUserName());
			resultProfile.setCity(checkNull(check));*/
			result.add(resultProfile);
		}
		//logger.info(result + "Result Set");
		return result;

	}

	/*private String checkNull(String check) {
		if (check == null)
			return "";
		return check;
	}*/

}
