package java_week_5_writing_hw_ksp;

import java.util.ArrayList;

public class Programme_04_ColoursArrayList {
    /**
     * Created by Jay Vaghani
     */
    /*
    Write a Java programe to create a new array list, add some colours (string)
    and printout the collection usin for each loop.
     */
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("RED");
        colorList.add("BLUE");
        colorList.add("GREEN");
        colorList.add("YELLOW");
        colorList.add("BLACK");
        colorList.add("WHITE");
        colorList.add("ORANGE");
        colorList.add("PURPLE");
        colorList.add("CYAN");
        for (String colourList : colorList) {
            System.out.println(colourList + ", ");
        }
    }
}
