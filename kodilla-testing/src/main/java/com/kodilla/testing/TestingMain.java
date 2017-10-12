package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
       SimpleUser simpleUser = new SimpleUser("theForumUser");

       String result = simpleUser.getUsername();

       if (result.equals("theForumUser")){
           System.out.println("test OK");
       }
       else{
           System.out.println("Error!");
       }

       Calculator calculator = new Calculator();
       int addResult = calculator.add(10, 20);
       int substResult = calculator.subtract(20,10);

       if (addResult == 30){
           System.out.println("Addition test OK");
       }
       else{
           System.out.println("Addition error");
       }

       if (substResult == 10){
           System.out.println("Subtraction test OK");
       }
       else{
           System.out.println("Subtraction error");
       }
    }
}
