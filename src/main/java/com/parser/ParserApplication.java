package com.parser;

import com.parser.template.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableAutoConfiguration
@EnableAsync
@Configuration
public class ParserApplication implements CommandLineRunner {

    @Value("${tui.base.url}")
    String url;

    public static void main(String[] args) {
        SpringApplication.run(ParserApplication.class, args);
    }

    @Bean
    public ThreadPoolTaskExecutor fetchExecutor() {
        ThreadPoolTaskExecutor pool = new ThreadPoolTaskExecutor();
        pool.setCorePoolSize(5);
        pool.setMaxPoolSize(10);
        pool.setWaitForTasksToCompleteOnShutdown(true);
        pool.initialize();
        return pool;
    }

    @Bean
    public ThreadPoolTaskExecutor saveExecutor() {
        ThreadPoolTaskExecutor pool = new ThreadPoolTaskExecutor();
        pool.setCorePoolSize(2);
        pool.setMaxPoolSize(5);
        pool.setWaitForTasksToCompleteOnShutdown(true);
        pool.initialize();
        return pool;
    }

    @Autowired
    Fetcher fetcher;

    @Override
    public void run(String... args) throws Exception {

        RestTemplate restTemplate = new RestTemplate();
        Response response = restTemplate.getForObject(String.format(url, 0), Response.class);
        for (int i = 10350; i < 10727; i++) {
            fetcher.fetch(String.format(url, i), i);
        }
//        fetcher.fetch(String.format(url, 1), 1);
    }
}
