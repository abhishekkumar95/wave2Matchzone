package com.matchzone.service;

import java.util.List;

import com.matchzone.model.Result;
import com.matchzone.model.Search;

public interface SearchService {
	
	public List<Result> search(Search search);
	
}
