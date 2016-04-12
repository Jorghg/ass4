/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebshopDjikstra;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Main {
    
    public static void main(String[] args) {
        WebShop ws = new WebShop();
        
        ws.printRooms();
        ArrayList<Room> r = ws.findProduct("Stol");
        
        System.out.println("ASDFASDFASDFASDF");
        
        for (Room room : r) {
            System.out.println(room.getName());
        }
    }
    
}
