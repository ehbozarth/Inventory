import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by earlbozarth on 10/12/15.
 */
public class Inventory {

    public static void main (String[] args){

        ArrayList <Item> inventory = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        /*
        Item item1 = new Item("dog test");
        inventory.add(item1);
        Built for testing purposes
        */
        while (true) {

            int counter = 1;
            System.out.println("Here is a list of items:");

            for (Item item : inventory) {
                System.out.println(String.format("%d [%d] %s %s",counter, item.quantity, item.name, item.category));
                //System.out.println(counter + ". [" + item.quantity + "] " + item.name);
                counter++;
            }//End of For loop

            System.out.println("Here is a list of options:");
            System.out.println("[1] Create new item");
            System.out.println("[2] Remove item by its number");
            System.out.println("[3] Update quantity");

            String choice = scanner.nextLine();
            int choiceNum = Integer.valueOf(choice);

            if (choiceNum == 1) {
                System.out.println("What item would you like to add?");
                String itemName = scanner.nextLine();
                System.out.println("How many of " + itemName + "s do you have?");
                String qNum = scanner.nextLine();
                int qtyNum = Integer.valueOf(qNum);
                System.out.println("What category is you item in?");
                String cat = scanner.nextLine();
                cat = cat.toUpperCase();
                //Item newItem = new Item(itemName, qtyNum);

                if (!cat.equals("DRIVER") && !cat.equals("FAIRWAY METAL") && !cat.equals("IRON")
                        && !cat.equals("WEDGE") && !cat.equals("PUTTER")){
                    System.out.println("You entered in an INVALID category");
                    System.out.println("Please choose from:");
                    System.out.println("Driver");
                    System.out.println("Fairway Metal");
                    System.out.println("Iron");
                    System.out.println("Wedge");
                    System.out.println("Putter");
                }//end of if statement checking if the category exists or not

                if(cat.equals("DRIVER") || cat.equals("FAIRWAY METAL") || cat.equals("IRON")
                || cat.equals("WEDGE") || cat.equals("PUTTER")){
                    Item newItem = createItem(itemName,qtyNum,cat);
                    inventory.add(newItem);
                }//Only adds item if the category is found



            }//End of choice 1
            else if (choiceNum == 2) {
                System.out.println("Enter in the list number of the item you would like removed:");
                String itemNum = scanner.nextLine();
                int num = Integer.valueOf(itemNum);
                Item newItemNum = inventory.get(num - 1);
                inventory.remove(newItemNum);
            }//End of choice 2

            else if (choiceNum == 3) {
                System.out.println("Please enter in the item name");
                String name = scanner.nextLine();
                int pos = 0;
                for (Item item : inventory){
                    if (item.name.equals(name)) {
                        break;
                    }
                    pos++;
                }//End of For Loop
                System.out.println("Please enter in the new total in quantity");
                String num1 = scanner.nextLine();
                int number = Integer.valueOf(num1);
                Item item2 = inventory.get(pos);
                item2.quantity = number;

            }//End of choice 3

        }//End of while loop

    }//End of Main Method

    static Item createItem(String name, int qty, String cat){
        Item i = new Item(name, qty, cat);
        return i;
        /*
                if(cat.equals("DRIVER")){
                    return new Driver();
                }
                else if(cat.equals("FAIRWAY METAL")){
                    return new FairwayMetal();
                }
                else if(cat.equals("IRON")){
                    return new Iron();
                }
                else if(cat.equals("WEDGE")){
                    return new Wedge();
                }
                else if(cat.equals("PUTTER")){
                    return new Putter();
                }
                else{
                    return new Item();
                }
       */
    }//end of createItem

}//End of Inventory Class
