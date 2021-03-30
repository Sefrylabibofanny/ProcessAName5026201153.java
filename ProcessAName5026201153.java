package com.company;
import java.util.*;

public class ProcessAName5026201153 {

    public static void main(String[] args) {
        Scanner Sefry = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = Sefry.nextLine();

        int spcIndex = name.indexOf(" ");
        String FirstName = name.substring(0, spcIndex);
        String LastName = name.substring((spcIndex+1), name.length());

        String FullName = "Your name is: " + LastName + ", " + FirstName.substring(0,1);
        System.out.println(FullName);
    }
}