public class StringQuestion2 {
/*
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
 */
    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd1("ab"));
        System.out.println(extraEnd2("Hi"));
    }

    private static String extraEnd2(String hi) {
        hi = "Hi";

        String n = "";
        for (int i = 1; i < 4; i++) {

            n = hi + n;

        }
        return n;
    }

    public static String extraEnd1(String str1) {

            return str1+str1+str1;
        }

    public static String extraEnd(String str) {


        String n="";
        for (int i = 1; i <4 ; i++) {

     n=  str.substring(3)+n;
        }

        return  n ;
    }

}
