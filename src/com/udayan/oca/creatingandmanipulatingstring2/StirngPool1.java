package com.udayan.oca.creatingandmanipulatingstring2;

public class StirngPool1{
    public static void main(String args[]) {
      String javaworld = "JavaWorld";
      final String java = "Java";
      final String world = "World";
        //java += world;
        String str1=java+world;
        System.out.println(str1 == javaworld);
    }
}
