package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main (String args[]) {
      // Use main to test your methods

        Person graceHopper = new Person("Grace Hopper");
        graceHopper.setCity("Arlington");

      printHelloWorld();
        printSumOf1Upto10UsingForLoop();
        System.out.println(isOdd(2));
        System.out.println(isMultipleOfThree(5));
        System.out.println(repeatStringXTimes("Potato",3));
    }

    public static void printHelloWorld() {

        System.out.println("Hello World");
    }

    public static Boolean returnPrimitiveBooleanTrue() {

        return true;
    }

    public static int returnPrimitiveInt1729() {

        return 1729;
    }

    public static Double returnPrimitiveDoubleThreePointOneFour() {

        Double pi = 3.14;

        return pi;
    }

    public static char returnPrimitiveCharZ() {

        char dragonBall = 'Z';

        return dragonBall;
    }

    public static void printSumOf1Upto10UsingForLoop() {


        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;

        }
        System.out.println(sum);
        //if you want to print out every single instance simply put inside loop.

    }


    public static void printSumOf1Upto10000UsingForLoop() {
        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            sum += i;

        }
        System.out.println(sum);
        //if you want to print out every single instance simply put inside loop.
    }

    public static boolean isOdd(int n) {

        if (n%2!=0){
            return true;
        }else
        {
            return false;
        }
    }

    public static boolean isMultipleOfThree(int n) {
        if (n%3==0){
            return true;
        }else
        {
            return false;
        }
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {

        if (n%2!=0&&n%3==0){
            return true;
        }else
        {
            return false;
        }

    }

    public static String repeatStringXTimes(String input, int times) {
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".

        if(times==0){
            return "";
        }else
        {

            for(times = 1; times < input.length(); times++)
            {
                input.appen;
            }

            return input;
        }
    }

    public static String returnStringUntilQ(String input) {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".

        return "";
    }

    public static Person declareAndReturnPersonNamedAda() {
      Person ada = new Person("Ada");
        ada.setCity("Somewhere Cool");

        return ada;
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {
      Person alanTuring = new Person("Alan Turing");
        alanTuring.setCity("London");

        return alanTuring;
    }

    public static boolean isFromLondon(Person person) {

        if(person.getCity().equals("London")){
            return true;
        }
        return false;
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
        ArrayList<String> places = new ArrayList<String>();
        places.add("London");
        places.add("Montreal");
        places.add("tokyo");
        return null;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {
      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
        HashMap<String,Person> people = new HashMap<String, Person>();


        people.put("Grace hopper",
                   declareAndReturnPersonNamedAda());

        people.put(declareAndReturnPersonNamedAlanTuringFromLondon().getName(),
                   declareAndReturnPersonNamedAlanTuringFromLondon());

      return people;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {
        declareAndReturnPersonNamedAlanTuringFromLondon().setCity("Princeton");

    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {

    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {

    }
}
