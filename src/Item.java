/**
 * Created by earlbozarth on 10/12/15.
 */
public class Item {
    String name;
    int quantity;

    public Item(String name){
        this.name = name;
        quantity = 1;
    }//End of constructor

    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

}//End of Item Class
