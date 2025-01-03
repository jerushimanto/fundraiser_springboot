package com.example.fundraiser;
import java.lang.RuntimeException;

public class custom_exception extends RuntimeException{
    public custom_exception (String s){
        super(s);
    }
    
}