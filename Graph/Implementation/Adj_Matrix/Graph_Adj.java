package com.java.learn.ds.graph.adj.matrix;
import com.java.learn.ds.graph.Graph;

public class Graph_Adj{
public static void main(String... graphs){
Graph graph = new Graph();
System.out.println("Edge exists b/w 'A' and 'B' : "+graph.doesEdgeExist("a", "b"));
System.out.println("Edge exists b/w 'B' and 'A' : "+graph.doesEdgeExist("b", "a"));
System.out.println("Edge exists b/w 'A' and 'B' : "+graph.doesEdgeExist("a", "d"));
System.out.println("Edge exists b/w 'A' and 'B' : "+graph.doesEdgeExist("d", "a"));



System.out.println("Edge exists b/w 'A' and 'C' : "+graph.doesEdgeExist("a", "c"));
System.out.println("Edge exists b/w 'C' and 'A' : "+graph.doesEdgeExist("c", "a"));
System.out.println("Added edge between 'A' and 'C'");

graph.insertEdge("a","c");

System.out.println("Edge exists b/w 'A' and 'C' : "+graph.doesEdgeExist("a", "c"));
System.out.println("Edge exists b/w 'C' and 'A' : "+graph.doesEdgeExist("c", "a"));

graph.deleteEdge("a", "b");
System.out.println("Edge exists b/w 'A' and 'B' : "+graph.doesEdgeExist("a", "b"));
System.out.println("Edge exists b/w 'B' and 'A' : "+graph.doesEdgeExist("b", "a"));


}
}