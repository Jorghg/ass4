/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebshopDjikstra;

import java.util.List;

/**
 *Creats a list of vertexes and Edges creating a graph
 * @author Jørgen
 */
public class Graph {
  private final List<Vertex> vertexes;
  private final List<Edge> edges;

  public Graph(List<Vertex> vertexes, List<Edge> edges) {
    this.vertexes = vertexes;
    this.edges = edges;
  }

  public List<Vertex> getVertexes() {
    return vertexes;
  }

  public List<Edge> getEdges() {
    return edges;
  }
  
  
    
    
    
}
