package com.example.crawl.model.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganicResult {
    int position;
    String title;
    String link;
    String redirect_link;
    String displayed_link;
    String thumbnail;
    String favicon;
    String snippet;
    String source;
}
