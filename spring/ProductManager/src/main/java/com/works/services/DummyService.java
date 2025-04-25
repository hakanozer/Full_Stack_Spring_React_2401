package com.works.services;

import com.works.models.Comment;
import com.works.models.DummyComments;
import com.works.models.LoginUser;
import com.works.models.UserToken;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
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

    public Comment comment(Integer id) {
        String url = "https://dummyjson.com/comments/" + id;
        Comment response = restTemplate.getForObject(url, Comment.class);
        return response;
    }

    public ResponseEntity userLogin(String username, String password) {
        String url = "https://dummyjson.com/auth/login";
        LoginUser loginUser = new LoginUser();
        loginUser.setUsername(username);
        loginUser.setPassword(password);

        /*
        try {
            ResponseEntity<UserToken> responseEntity = restTemplate.postForEntity(url, loginUser, UserToken.class);
            if (responseEntity.getStatusCode() == HttpStatus.OK) {
                UserToken userToken = responseEntity.getBody();
                return new ResponseEntity<>(userToken, HttpStatus.OK);
            }else {
                return new ResponseEntity("Username or Password Fail!", HttpStatus.BAD_REQUEST);
            }
        }catch (Exception ex) {
            return new ResponseEntity("Username or Password Fail!", HttpStatus.BAD_REQUEST);
        }
         */


        try {
            UserToken response = restTemplate.postForObject(url, loginUser, UserToken.class);
            System.out.println( response.getAccessToken() );
            return ResponseEntity.ok().body(response);
        }catch ( RestClientException ex) {
            System.out.println(ex);
            return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }


    }



}
