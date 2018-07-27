package com.plasticmobile.craiglist.search.controller;

import com.plasticmobile.craiglist.search.domain.SearchResponse;
import com.plasticmobile.craiglist.search.service.Config;
import com.plasticmobile.craiglist.search.service.CraigListSearch;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class SearchController {
    @Autowired
    Config config;

    @Autowired
    CraigListSearch search;

    @GetMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SearchResponse> index(@RequestParam(value = "query") String query, @RequestParam(value = "category") String category) {
        try {
            return search.search(query, category);
        } catch (Exception e) {
            log.error("error processing request", e);

        }
        return new ArrayList<>();

    }
}
