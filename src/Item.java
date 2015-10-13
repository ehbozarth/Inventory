/**
 * Created by earlbozarth on 10/12/15.
 */
public class Item {
    String name;
    int quantity;
    String category;

    public Item (){
    }//Default Constructor

    public Item(String name){
        this.name = name;
        quantity = 1;
    }//End of Name constructor

    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }//End of Name and Quantity contstructor

    public Item(String name, int quantity, String category){
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }//End of Name,Quantity,Category constructor

}//End of Item Class
