package com.craftinginterpreters.lox;

import java.io.IOException;

public class Lox {

    public static void main(String[] args) throws IOException {

      String teststr = "var mynum = 99;"; 
      System.out.println(new Scanner(teststr).scanTokens());
    }

}