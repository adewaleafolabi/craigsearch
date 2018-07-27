package com.plasticmobile.craiglist.search.service;



import com.plasticmobile.craiglist.search.domain.SearchResponse;

import java.util.List;

public interface CraigListSearch {
    List<SearchResponse> search(String query, String category) throws Exception;
}
