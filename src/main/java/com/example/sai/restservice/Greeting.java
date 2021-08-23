package com.example.sai.restservice;

public class Greeting {
    ///////////////////////////////////////////////////////////////////////////
    // The service will handle GET requests form /greeting, optionally with a
    // name parameter in the query string. The GET request should return a
    // 200 OK response with JSON in the body that represents a greeting.
    ///////////////////////////////////////////////////////////////////////////

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    ///////////////////////////////////////////////////////////////////////////
    // This application uses the Jackson JSON library to automatically marshal
    // instances of type Greeting into JSON. Jackson is included by default by
    // the web starter.
    ///////////////////////////////////////////////////////////////////////////
}
