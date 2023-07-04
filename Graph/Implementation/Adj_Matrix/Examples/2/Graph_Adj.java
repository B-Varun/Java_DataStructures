package com.java.learn.ds.graph.adj.matrix;
import com.java.learn.ds.graph.adj.matrix.Graph;
public class Graph_Adj{
public static void main(String... graphs){
Graph graph = new Graph();

System.out.println("Does edge exist between 'A' and 'E'"+graph.doesEdgeExist("a", "e"));
System.out.println("Does edge exist between 'A' and 'D'"+graph.doesEdgeExist("a", "d"));

System.out.println("Does edge exist between 'B' and 'D'"+graph.doesEdgeExist("b", "d"));

System.out.println("Does edge exist between 'C' and 'E'"+graph.doesEdgeExist("c", "e"));

graph.insertEdge("a", "d");
System.out.println("Inserted edge between 'A' and 'D'");

graph.insertEdge("c", "e");
System.out.println("Inserted edge between 'c' and 'E'");


graph.insertEdge("b", "d");
System.out.println("Inserted edge between 'B' and 'D'");

System.out.println("Does edge exist between 'A' and 'D'"+graph.doesEdgeExist("a", "d"));

System.out.println("Does edge exist between 'B' and 'D'"+graph.doesEdgeExist("b", "d"));

System.out.println("Does edge exist between 'C' and 'E'"+graph.doesEdgeExist("c", "e"));

System.out.println("\n\n");
System.out.println("Deleted Edge 'A' and 'D' : "+graph.deleteEdge("a","d"));

System.out.println("Deleted Edge 'B' and 'D' : "+graph.deleteEdge("b","d"));

System.out.println("Deleted Edge 'C' and 'E' : "+graph.deleteEdge("c","e"));

System.out.println("Does edge exist between 'A' and 'D'"+graph.doesEdgeExist("a", "d"));

System.out.println("Does edge exist between 'B' and 'D'"+graph.doesEdgeExist("b", "d"));

System.out.println("Does edge exist between 'C' and 'E'"+graph.doesEdgeExist("c", "e"));

}
}