package io.ccard.controllers;

public class MainController {

    public byte[] helloWorld(){
        return "Hello World! Now I've made a change! And another! Now I'm checking for Jenkins polling...".getBytes();
    }
}
