/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebshopDjikstra;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *Create a warehouse storage. 
 *Able to see the shortest way from "room" to "room"(Vertex)
 * @author Jørgen
 */
public class Warehouse {
    
    private List<Vertex> nodes;
    private List<Edge> edges;
    
    public void openWarehouse() {
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            Vertex location = new Vertex("Location of node "
                    + i, "Location of node" + i);
            nodes.add(location);
        }
        
        addRoom("Room1", 0, 1, 100);
        addRoom("Room2", 0, 2, 250);
        
        Graph graph = new Graph(nodes, edges);
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
        dijkstra.execute(nodes.get(0));
        LinkedList<Vertex> path = dijkstra.getPath(nodes.get(2));
        
        for (Vertex vertex : path) {
            System.out.println(vertex);
        }   
        
    }
    
    private void addRoom (String laneID, int sourceLocNo, int destLocNo,)
    
}
