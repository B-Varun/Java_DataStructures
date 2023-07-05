package com.java.learn.ds.graph.adj.matrix.demo;
import com.java.learn.ds.graph.adj.matrix.Graph;
public class Graph_AdjMatrix{
public static void main(String... graphs){
Graph graph = new Graph();
System.out.println("Does edge exists between 'A' and 'B' : "+graph.doesEdgeExist("a", "b"));
System.out.println("Does edge exists between 'A' and 'C' : "+graph.doesEdgeExist("a", "c"));
System.out.println("Does edge exists between 'A' and 'D' : "+graph.doesEdgeExist("a", "d"));


System.out.println("Does edge exists between 'B' and 'D' : "+graph.doesEdgeExist("b", "d"));
System.out.println("Inserted edge between 'B' and 'D' : "+graph.insertEdge("b", "d"));
System.out.println("Does edge exists between 'B' and 'D' : "+graph.doesEdgeExist("b", "d"));


System.out.println("Does edge exists between 'B' and 'C' : "+graph.doesEdgeExist("b", "c"));
System.out.println("Inserted edge between 'B' and 'C' : "+graph.insertEdge("b", "c"));
System.out.println("Does edge exists between 'B' and 'C' : "+graph.doesEdgeExist("b", "c"));


System.out.println("Does edge exists between 'D' and 'E' : "+graph.doesEdgeExist("d", "e"));
System.out.println("Inserted edge between 'D' and 'E' : "+graph.insertEdge("d", "e"));
System.out.println("Does edge exists between 'D' and 'E' : "+graph.doesEdgeExist("d", "e"));


System.out.println("Does edge exists between 'B' and 'E' : "+graph.doesEdgeExist("b", "e"));
System.out.println("Inserted edge between 'B' and 'E' : "+graph.insertEdge("b", "e"));
System.out.println("Does edge exists between 'B' and 'E' : "+graph.doesEdgeExist("b", "e"));

System.out.println("\n\n\nDeleting edges in Graph\n\n");

System.out.println("Does edge exists between 'A' and 'B' : "+graph.doesEdgeExist("a","b"));
System.out.println("Deleted edge between 'A' and 'B' : "+graph.deleteEdge("a","b"));
System.out.println("Does edge exists between 'A' and 'B' : "+graph.doesEdgeExist("a","b"));

System.out.println("Does edge exists between 'A' and 'C' : "+graph.doesEdgeExist("a", "c"));
System.out.println("Deleted edge between 'A' and 'C' : "+graph.deleteEdge("a","c"));
System.out.println("Does edge exists between 'A' and 'C' : "+graph.doesEdgeExist("a", "c"));

System.out.println("Does edge exists between 'A' and 'E' : "+graph.doesEdgeExist("a", "e"));
System.out.println("Deleted edge between 'A' and 'E' : "+graph.deleteEdge("a","e"));
System.out.println("Does edge exists between 'A' and 'E' : "+graph.doesEdgeExist("a", "e"));

System.out.println("Does edge exists between 'C' and 'D' : "+graph.doesEdgeExist("c", "d"));
System.out.println("Deleted edge between 'C' and 'D' : "+graph.deleteEdge("c","d"));
System.out.println("Does edge exists between 'C' and 'D' : "+graph.doesEdgeExist("c", "d"));
}
}