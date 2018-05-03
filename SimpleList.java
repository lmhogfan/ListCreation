package com.company;

import java.util.ArrayList;
import java.util.List;

public class SimpleList
{
    public static void main (String[] args)
    {
        SimpleList simpleList= new SimpleList();
        simpleList.demo();
    }
    private void demo()
    {
        List<String> colors= new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("orange");
        colors.add("green");

        for (int i=0; i< colors.size(); i++)
        {
            System.out.println(colors.get(i));
        }
        System.out.println();
        for(String colorList:colors)
        {
            System.out.println(colorList);
        }
    }
}
