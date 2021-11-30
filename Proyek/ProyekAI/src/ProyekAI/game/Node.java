/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User1
 */
public class Node implements Comparable<Node>{
     // Id for readability of result purposes
      private static int idCounter = 0;
      public int id;

      // Parent in the path
      public Node parent = null;

      public List<Edge> neighbors;

      // Evaluation functions
      public double f = Double.MAX_VALUE;
      public double g = Double.MAX_VALUE;
      // Hardcoded heuristic
      public double h; 

      Node(double h){
            this.h = h;
            this.id = idCounter++;
            this.neighbors = new ArrayList<>();
      }

      @Override
      public int compareTo(Node n) {
            return Double.compare(this.f, n.f);
      }

      public static class Edge {
            Edge(int H, Node node){
                  this.H = H;
                  this.node = node;
            }

            public int H;
            public Node node;
      }

      public void addBranch(int H, Node node){
            Edge newEdge = new Edge(H, node);
            neighbors.add(newEdge);
      }

      public double calculateHeuristic(Node target){
            return this.h;
      }
}
