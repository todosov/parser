package com.parser;

import com.parser.template.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tadasyan
 */

@Service
public class Fetcher {

    @Autowired
    TuiHotelsRepository tuiHotelsRepository;

    @Async("fetchExecutor")
    public void fetch(String url, int page) {

        RestTemplate restTemplate = new RestTemplate();
        Response response = restTemplate.getForObject(url, Response.class);
        List<TuiHotel> hotels = response.searchResult.getSearchResultItems()
                .stream()
                .flatMap(item -> item.getHotels().stream())
                .map(hotel -> TuiHotel.builder()
                        .code(hotel.getHotelId().toString())
                        .name(hotel.getHotelName().concat(",").concat(hotel.getHotelCategory()))
                        .build())
                .collect(Collectors.toList());
        System.out.println(page);
        save(hotels);
    }

    @Async("saveExecutor")
    public void save(List<TuiHotel> hotels) {
        hotels.stream()
                .distinct()
                .forEach(tuiHotel -> {
                    try{
                        tuiHotelsRepository.save(tuiHotel);
                        System.out.println(tuiHotel);
                    }catch(Exception e){}
                });
    }
}
