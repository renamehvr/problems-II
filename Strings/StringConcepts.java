/*
*
*  All Implemented Interfaces:  Serializable, CharSequence, Comparable<String>
public final class String extends Object implements Serializable, Comparable<String>, CharSequence
*
*
* */



public class StringConcepts {
    public static void main(String[] args) {

        String str = "abc";
        String greeting = "Hi";
        String empt = "";
        String name = "Harshvarddhan";
        String lastname = "Rajpurohit";
        String vzid = "";
        char[] vz = new char[7];
        char[] data = {'a','b','c'};
        String str1 = new String(data);        //so there will be a constuctor for this implementation;
        String substr = new String(data,1,2);
        System.out.println(substr);
        System.out.println("length funtion :"+name.length());
        System.out.println(empt.isEmpty());
        System.out.println(str+" is string charAt() method to find its chat at 1th index : "+str.charAt(1));
        System.out.println("comparing 2 string using compareTo() method its zero when equal : "+str.compareTo(str1));
        System.out.println("ABC".compareTo("abc"));
        System.out.println("ABC".compareToIgnoreCase("abc"));
        System.out.println("Hi".concat(" Harsh"));
        System.out.println(name.concat(greeting));
        String temp = name.concat(" ");
        System.out.println(temp.concat(greeting));
        lastname.getChars(0,5 ,vz ,0);
        name.getChars(0,2,vz,5);
        vzid = new String(vz);
        System.out.println("Generating Verizon id "+vzid);

        String demo = "Harsh";
        String demo1 = new String("Harsh");
        String demo3 = demo;
        String demo4 = demo1;
        String demo5 ="Harsh";
        String demo6= new String("Harsh");
        if(demo==demo1) System.out.println("demo and demo1 are same object(==)");
        if(demo.equals(demo1)) System.out.println("demo and demo1 have same content(equals)");
        if(demo==demo3) System.out.println("demo1 and demo3 are same object(==)");
        if(demo.equals(demo3)) System.out.println("demo and demo3 have same content(equals)");
        if (demo3==demo4) System.out.println("demo3 and demo4 are same object(==)");
        if (demo==demo5) System.out.println("demo and demo5 are same object(==)");
        if (demo1==demo6) System.out.println("demo1 and demo6 are same object(==)");

    }
}
