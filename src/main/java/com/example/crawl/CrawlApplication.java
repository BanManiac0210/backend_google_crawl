package com.example.crawl;

import com.example.crawl.config.SerpAPIConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CrawlApplication {
    public static void main(String[] args) {
		SpringApplication.run(CrawlApplication.class, args);
	}
}
