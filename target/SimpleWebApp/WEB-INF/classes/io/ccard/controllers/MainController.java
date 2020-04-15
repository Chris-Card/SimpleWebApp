package io.ccard.controllers;

public class MainController {

    public byte[] helloWorld(){
        return new String("Hello World! Now I've made a change!").getBytes();
    }
}
