package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShopListCopy
{
    public static void main(String[] args)
    {
        ShopListCopy shoppingListCopy = new ShopListCopy();
        shoppingListCopy.run2();
    }

    public void run2()
    {
        List<ListItem> myList = new ArrayList<>();
        System.out.println("WELCOME TO MARTIN MARKET!");
        System.out.println("==========================");
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
        String choice="";
        String[] commandSelection= choice.split(" ");
        do
        {
            choice= selection.nextLine().toUpperCase();
            if (commandSelection[0].equals("ADD"))
            {
                ListItem listItem=new ListItem(commandSelection[1],0);
                myList.add(listItem);
                System.out.println("Added "+commandSelection[1]+" to your list!");
                System.out.println("What else can I help you with?");
            }
            else if(commandSelection[0].equals("PRINT"))
            {
                System.out.println("Your shopping list:");
                for (int x = 0; x < myList.size(); x++)
                {
                    System.out.println(x + " : " + myList.get(x));
                }
                System.out.println("What else can I help you with?");
            }
            else if(commandSelection[0].equals("REMOVE"))
            {
                int removeItem= Integer.parseInt(commandSelection[1]);
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
            else if(commandSelection[0].equals("CLEAR"))
            {
                myList.clear();
                System.out.println("Your shopping list was cleared!");
                System.out.println("What else can I help you with?");
            }
            /*else if(commandSelection[0].equals("SORT"))
            {
                Collections.sort(myList);
                System.out.println("Your list has been sorted alphabetically!");
                System.out.println("What else can I help you with?");
            }*/
            else if(commandSelection[0].equals("FIND"))
            {
                if(myList.contains(commandSelection[1]))
                {
                    System.out.println("Found it!");
                }
                else
                {
                    System.out.println("No such item!");
                }
            }
            else if(commandSelection[0].equals("EXIT"))
            {
                break;
            }
            else
            {
                System.out.println("Please try your entry again");
            }
        }
        while(!commandSelection[0].equals("EXIT"));
        System.out.println("Goodbye!");

    }


}
