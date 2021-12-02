package com.company;

public class StringConcatenation {
    public static void main (String[] args){
        String s = "Hello";
        String s1 = "100";
        String s2 = "hi this my java selenium code";
        String f1 = "12.33";

        int a = 100;
        int b = 200;
        String x = "Hello";
        String y = "Selenium";
        System.out.println(a+b); //300
        System.out.println(x+y); //HelloSelenium
        System.out.println(x+a); //Hello100
        System.out.println(a+b+x+y); //300HelloSelenium
        System.out.println(x+y+a+b); //HelloSelenium100200
        System.out.println(x+y+(a+b)); //HelloSelenium300
        System.out.println("The value of a is " + a); //the value of a is 100
        System.out.println("The value of b is " + b); //the value of b is 200
        System.out.println("The sum of a and b is " + (a+b)); //the sum of a and b is 300

        double d1 = 12.33;
        double d2 = 34.44;
        System.out.println(a+b+x+y+d1+d2); //300HelloSelenium12.3334.33
        System.out.println(x+y+a+b+d1+d2); //HelloSelenium10020012.3334.44
        System.out.println(x+d1+d2+y+a+b); //Hello12.3334.44Selenium100200
        System.out.println(x+(d1+d2)+y+(a+b)); //Hello46.769999999999996Selenium300

        char c1 = 'a';
        char c2 = 'b';
        System.out.println(x+a); //Helloa
        System.out.println(c1+c2); //Ascii value of a is 95 anb b is 97. output 95+97 =195
        System.out.println(a+""+b); //ab

        //Escaping character with slash\
        //hi this is "sunil" here
        System.out.println("hi this is \"sunil\" here");

        int m = 9;
        int n = 2;
        System.out.println(m/n); //4
        System.out.println(9/2); //4
        System.out.println(9/2.0); //4.5
        System.out.println(9.0/2); //4.5
        System.out.println(9.0/2.0); //4.5
        //System.out.println(9/0); //infinity
        System.out.println(0/9); //0

        System.out.println(8 % 2); //0 -> reminder is 0
        System.out.println(9 % 2); //1 => reminder is 1
        System.out.println(1000); // 1000

    }
}
