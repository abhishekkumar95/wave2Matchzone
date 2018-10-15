package com.matchzone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.matchzone.model.Result;
import com.matchzone.model.Search;
import com.matchzone.service.SearchService;

@RestController
public class SearchController {
	
	private SearchService searchService;

	@Autowired
	public SearchController(SearchService searchService) {
		super();
		this.searchService = searchService;
	}
	
	@PostMapping("/searchengine")
	public ResponseEntity<?> searchEngine(@RequestBody Search search) {
		//Gson gson = new Gson();
		List<Result> list = searchService.search(search);
		return new ResponseEntity<List<Result>>(list, HttpStatus.OK);
	}
	
}
