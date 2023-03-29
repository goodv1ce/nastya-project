package ua.goodvice.easylib.easylib.communicator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ua.goodvice.easylib.easylib.entity.Book;

import java.util.List;

@Component
public class RestBookCommunicator {
    @Autowired
    private RestTemplate restTemplate;
    private final String URL = "http://localhost:8080/api/books";
    String userAndPass = "test:test";

    public List<Book> getAllBooks() {
        ResponseEntity<List<Book>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null
                , new ParameterizedTypeReference<List<Book>>() {
                });
        return responseEntity.getBody();
    }

    public Book getBookById(int id) {
        return restTemplate.getForObject(URL + "/" + id, Book.class);
    }

}
