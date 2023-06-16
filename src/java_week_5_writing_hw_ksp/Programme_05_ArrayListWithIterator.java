package java_week_5_writing_hw_ksp;


import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Jay Vaghani
 */
/*
Write a Java program to iterate throuh all elements in a array list using Iterator.
 */
public class Programme_05_ArrayListWithIterator {
    public static void main (String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("APLE");
        fruitList.add("BANANA");
        fruitList.add("GRAPE");
        fruitList.add("MANGO");
        fruitList.add("KIWI");
        fruitList.add("ORANGE");
        fruitList.add("BLACKBERRY");
        fruitList.add("STRAWBERRY");
        fruitList.add("CHERRY");

        ListIterator<String> iterate = fruitList.listIterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next() + ", ");
        }
    }
}