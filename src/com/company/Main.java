package com.company;

        // Arrays store data of any type
        //to declare an array:
        //1. String [] names = new String [3];
        //2. String [] names = {"Carina", "Mai", "Oscar"};
        //Type: String; Name of Array = names; Length of array= number of elements in the array/3; because we have 3 elements/our names that are fixed, never changes.
        //Array can only have 1 type and elements have to be same type. Give size(total number of elements) and size 3 can never change.

        //Elements in an array are referred to as by index. Index refers to elements. So value of first index 0= Carina, value of index 1= Mai, index 2= Oscar.
        //Last index = Length of Array-1; (length of array minus 1);
        //Length of array = 3; can't modify that number, or take away/add people. Can change individual element but not length. So Swap Mai for Hailu.

        //How to loop through Arrays to print out values of arrays
        //For loops very good to print out array values

//        for (index = 0; index < names.length; index++) { //start at index 0 coz first index = 0, and go up to 3
//            System.out.println(names[index]); //array[index]; names[0] Carina
//        } //index 3 is not less than names.length so the code will stop running


        //First look at Arrays

//        double [] temperatures = new double [15];
//
//        temperatures[0] = 20.0;
//        temperatures[14] = 90.0;
//
//        System.out.println("The first element is " + temperatures[0]);
//
//
//
//
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int randomInt;

        //Declare array to hold ten test scores
        int scores[] = new int[10];
        //Initialize elements of an array
        for (int i = 0; i < 10; i++){
            randomInt = 1 + rnd.nextInt(100);//creates a random number between 1 and 100
            scores[i] = randomInt;
        }
        //Print the elements of an array
        for (int i = 0; i < 10; i++){
            System.out.printf("Element # %d value is %d\n", i, scores[i]);
        }
        //print the fifth element
        System.out.println("The fifth value is " + scores[4]);
        //Print every other element
        for (int i = 0; i < 10; i+=2){
            System.out.printf("Score %s is %d\n", i, scores[i]);
        }
        //Print the number of elements
        System.out.println("The array length is " + scores.length);
        //Change an element
        scores[0] = 100;
        System.out.println("The first element is now 100");


        //this line will not generate the ArrayIndexOutOfBoundsException
        //we'll learn more about Exception (error) handling soon
        try{
            System.out.println(scores[10]);
        }catch(Exception e){
            System.out.println("We caught the ArrayIndexOutOfBoundsException error");
        }

        //this line will generate an ArrayIndexOutOfBoundsException
        //since we did not wrap it in the try..catch for error handling
        System.out.println(scores[10]);
    }
}