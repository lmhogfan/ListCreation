package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShoppingList
{
    public static void main(String[] args)
    {
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.run();
    }

    private void run()
    {
        List<String> myList = new ArrayList<>();
        System.out.println("Please choose from the following:");
        System.out.println("Add <Item Name>");
        System.out.println("Print Shopping List");
        System.out.println("Remove <Item Number>");
        System.out.println("Clear List");
        System.out.println("Sort List");
        System.out.println("Find");
        System.out.println("Exit");
        System.out.println("Your Selection:");
        Scanner selection= new Scanner(System.in);
        String choice;
        do
        {
            choice= selection.nextLine().toUpperCase();
            if (choice.startsWith("ADD"))
            {
                myList.add(choice.substring(4));
                System.out.println("Added "+choice.substring(4)+" to your list!");
                System.out.println("What else can I help you with?");
            }
            else if(choice.startsWith("PRINT"))
            {
                System.out.println("Your shopping list:");
                for (int x = 0; x < myList.size(); x++)
                {
                    System.out.println(x + " : " + myList.get(x));
                }
                System.out.println("What else can I help you with?");
            }
            else if(choice.startsWith("REMOVE"))
            {
                int removeItem= Integer.parseInt(choice.substring(7));
                if (removeItem>=myList.size())
                {
                    System.out.println("Please enter a valid item!");
                }
                else
                {
                    myList.remove(removeItem);
                    System.out.println("Your item was removed!");
                    System.out.println("What else can I help you with?");
                }
            }
            else if(choice.startsWith("CLEAR"))
            {
                myList.clear();
                System.out.println("Your shopping list was cleared!");
                System.out.println("What else can I help you with?");
            }
            else if(choice.startsWith("SORT"))
            {
                Collections.sort(myList);
                System.out.println("Your list has been sorted alphabetically!");
                System.out.println("What else can I help you with?");
            }
            else if(choice.startsWith("FIND"))
            {
                if(myList.contains(choice.substring(5)))
                {
                    System.out.println("Found it!");
                }
                else
                {
                    System.out.println("No such item!");
                }
            }
            else if(choice.startsWith("EXIT"))
            {
                break;
            }
            else
            {
                System.out.println("Please try your entry again");
            }
        }
        while(!choice.equals("EXIT"));
        System.out.println("Goodbye!");

    }


}
