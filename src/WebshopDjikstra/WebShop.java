/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebshopDjikstra;
import java.util.ArrayList;

/**
 *
 * @author Jørgen
 */
public class WebShop {
    private ArrayList<Room> rooms;
    private ArrayList<Room> roomWithProduct;
    
    public WebShop() {
         rooms = new ArrayList<Room>();
         roomWithProduct = new ArrayList<Room>();
         createRooms();
    }
    
    public void createRooms() {
        for(int i = 1; i <= 5; i++) {
            rooms.add(new Room(Integer.toString(i), "Room" + i));
            
        }
    }
    
    public ArrayList<Room> findProduct(String product) {
        for (Room r : rooms) {
            roomWithProduct.add(r.getRoomWithProduct(product)); 
        }
        return roomWithProduct;
    }
    
    public void printRooms() {
        for (Room r : rooms) {
            System.out.println(r.getName());
        }
    }
    
}
