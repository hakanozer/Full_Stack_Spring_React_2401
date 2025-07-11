package com.works.services;

import com.works.entities.Note;
import com.works.repositories.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NoteRepository noteRepository;
    private final CircuitBreakerFactory globalCircuitBreakerFactory;

    public Note save(Note note ) {
        return noteRepository.save(note);
    }

    public List<Note> findAll() {
        CircuitBreaker circuitBreaker = globalCircuitBreakerFactory.create("globalCircuitBreaker");
        return circuitBreaker.run(
                () -> list(),
                throwable -> fallBack()
        );
    }

    private List<Note> list() {
        try {
            Random random = new Random();
            Thread.sleep( (random.nextInt(3800) + 1000));
        }catch (Exception ex){}
        return noteRepository.findAll();
    }

    private List<Note> fallBack(){
        List<Note> noteList = new ArrayList<>();
        return noteList;
    }


}
