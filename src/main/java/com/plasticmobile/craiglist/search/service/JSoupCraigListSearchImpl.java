package com.plasticmobile.craiglist.search.service;

import com.plasticmobile.craiglist.search.domain.SearchResponse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class JSoupCraigListSearchImpl implements CraigListSearch {
    @Autowired
    ParserConfig parserConfig;
    @Autowired
    Config config;

    @Override
    public List<SearchResponse> search(String query, String category) throws Exception {
        List<SearchResponse> output = new ArrayList<>();
        Document doc = Jsoup.connect(String.format("%s/%s?s=0&query=%s&sort=rel",config.getProvider(),category,query)).get();
        Elements results = doc.select(parserConfig.getResult());

        for(int i=0;i < results.size();i++){
            output.add(
                    new SearchResponse(
                            String.format("%s %s %s", results.get(i).select(parserConfig.getTitle()).text(),
                                    results.get(i).select(parserConfig.getPrice()).text(),
                                    results.get(i).select(parserConfig.getLocation()).text()
                            ),
                            results.get(i).select(parserConfig.getDate()).text()
                    )
            );

        }
        return output;
    }
}
