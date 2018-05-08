package com.company;

public class ListItem
{
    String itemName;
    int quantity=0;

    public ListItem(String itemName,int quantity)
    {
        this.itemName=itemName;
    }

    public void increaseQuantity()
    {
        quantity++;
    }

    public void decreaseQuantity()
    {
        quantity--;
    }
}
