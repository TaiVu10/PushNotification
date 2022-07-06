package com.example.application;

import java.time.LocalTime;

public class Message {
    private String title = "title";
    private String body = "body";
    private LocalTime time = LocalTime.now();

    public Message() {

    }

    public Message(String title, String body, LocalTime time) {
        this.title = title;
        this.body = body;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String toString() {
        return title + " " + body + " " + time;
    }

}
