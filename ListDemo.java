package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListDemo
{
    public static void main(String[] args)
    {
        ListDemo listDemo=new ListDemo();
        listDemo.execute();
    }
    private void execute()
    {
        List<String> furnitureType= new ArrayList<>();
        furnitureType.add("Couch");
        furnitureType.add("Table");
        furnitureType.add("Chair");
        printList(furnitureType);
        System.out.println();

        furnitureType.add("Ottoman");
        printList(furnitureType);
        System.out.println();

        furnitureType.add("Love Seat");
        printList(furnitureType);
        System.out.println();

        furnitureType.add(3,"Stool");
        printList(furnitureType);
        System.out.println();

        furnitureType.remove(5);
        printList(furnitureType);
        System.out.println();

        furnitureType.remove(0);
        printList(furnitureType);
        System.out.println();

        furnitureType.remove(1);
        printList(furnitureType);

    }
    public void printList(List<String> furniture)
    {
        for (int x=0; x<furniture.size(); x++)
        {
            System.out.println("Furniture "+x+": "+furniture.get(x));
        }
    }
}
