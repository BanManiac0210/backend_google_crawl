package com.example.crawl.service;

import com.example.crawl.config.SerpAPIConfig;
import com.example.crawl.model.dto.response.OrganicResultList;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class SearchService {
    RestTemplate restTemplate;
    SerpAPIConfig serpAPIConfig;


    public OrganicResultList search(String query) {
        String url = "https://serpapi.com/search"
                + "?q=" + query
                + "&location=Vietnam"
                + "&hl=vi"
                + "&gl=vn"
                + "&google_domain=google.com.vn"
                + "&api_key=" + serpAPIConfig.getApiKey();
        try {
            return restTemplate.getForObject(url, OrganicResultList.class);
        } catch (Exception e) {
            log.error("Failed to call SerpAPI: {}", e.getMessage());
            return null;
        }
    }
}
