public class StringQuestion {
    //Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
    //
    //
    //makeAbba("Hi", "Bye") → "HiByeByeHi"
    //makeAbba("Yo", "Alice") → "YoAliceAliceYo"
    //makeAbba("What", "Up") → "WhatUpUpWhat"
    public static String helloName( String name){


        return "Hello"+ name;
    }

    public static void main(String[] args) {
        makeAbba("Hi","Bye");
    }

    public static String makeAbba(String a, String b) {
        a="Hi";
       b="Bye";
        return a+b+b+a;
    }


}
