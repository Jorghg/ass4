/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebshopDjikstra;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Administrator
 */
public class Room extends Vertex {
    private ArrayList<String> products;
    private Random rand;

    public Room(String id, String name) {
        super(id, name);
        products = new ArrayList<String>();
        rand = new Random();
        populateRoom();
    }
    
    public void populateRoom() {
        String[] product = {"Stol", "Sofa", "Seng", "Lampe",    
            "Kopp", "Musematte", "Telefon", "Hammer", "Skrutrekker", "Kaffe"
        };
        
        for (int i = 0; i < 3; i++) {
            products.add(product[rand.nextInt(product.length)]);
        }
    }
    
    public Room getRoomWithProduct(String name) {
        if(products.contains(name)) {
            System.out.println(this.getName() + " contains " + name);
            return this;
        }
        System.out.println(this.getName() + " does not contain " + name);
        return null;
    }
}