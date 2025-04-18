package com.works.services;

import com.works.models.DummyComments;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class DummyService {

    private final RestTemplate restTemplate;

    public DummyComments comments() {
        String url = "https://dummyjson.com/comments";
        DummyComments response = restTemplate.getForObject(url, DummyComments.class);
        response.getComments().get(0).getId();
        return response;
    }


}
