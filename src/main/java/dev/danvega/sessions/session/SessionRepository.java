package dev.danvega.sessions.session;

import dev.danvega.sessions.speaker.Speaker;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SessionRepository {

    private final List<Session> sessions = new ArrayList<>();

    public List<Session> findAll() {
        return sessions;
    }

    @PostConstruct
    private void init() {
        var parentsJava = new Session("This Ain't Your Parents' Java",
                new Speaker("Venkat Subramaniam","https://2024.springio.net/speakers/venkat-subramaniam/"),
                "https://2024.springio.net/sessions/this-aint-your-parents-java/");

        sessions.add(parentsJava);
    }

}
