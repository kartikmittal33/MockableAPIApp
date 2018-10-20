package com.testing.mockableapiapp;

public class Message {
    private String name;
    private String msg;
    private Integer id;

    public Message(String name, String msg, Integer id) {
        this.name = name;
        this.msg = msg;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getMsg() {
        return msg;
    }

    public Integer getId() {
        return id;
    }
}
