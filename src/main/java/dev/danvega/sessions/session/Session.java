package dev.danvega.sessions.session;

import dev.danvega.sessions.speaker.Speaker;

public record Session (String title, Speaker speaker, String url) {

}
