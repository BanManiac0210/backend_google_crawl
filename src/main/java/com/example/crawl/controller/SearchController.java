package com.example.crawl.controller;

import com.example.crawl.model.dto.response.CustomApiResponse;
import com.example.crawl.model.dto.response.OrganicResultList;
import com.example.crawl.service.SearchService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SearchController {
    SearchService searchService;

    @GetMapping("/search")
    public CustomApiResponse<OrganicResultList> search(@RequestParam String q) {
        return CustomApiResponse.<OrganicResultList>builder()
                .result(searchService.search(q))
                .build();
    }
}
