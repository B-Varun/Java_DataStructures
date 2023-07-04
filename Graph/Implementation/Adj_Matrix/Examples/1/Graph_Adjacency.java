package com.java.learn.ds.graph.adj.matrix;
import com.java.learn.ds.graph.Graph;
public class Graph_Adjacency{
public static void main(String... graphs){
Graph graph = new Graph();
System.out.println("Does edge exists between 'D' and 'A' :"+ graph.doesEdgeExist("d", "a"));
System.out.println("Does edge exists between 'C' and 'A' : "+graph.doesEdgeExist("c", "a"));

graph.insertEdge("c", "a");
System.out.println("Inserted edge between 'C' and 'A'");

graph.insertEdge("d", "a");
System.out.println("Inserted edge between 'D' and 'A'");

System.out.println("Does edge exists between 'D' and 'A' : "+graph.doesEdgeExist("d", "a"));
System.out.println("Does edge exists between 'C' and 'A' : "+graph.doesEdgeExist("c", "a"));


graph.deleteEdge("d", "a");
System.out.println("Deleted edge between 'D' and 'A'");

graph.deleteEdge("c", "a");
System.out.println("Deleted edge between 'C' and 'A'");

System.out.println("Does edge exists between 'D' and 'A' : "+graph.doesEdgeExist("d", "a"));
System.out.println("Does edge exists between 'C' and 'A' : "+graph.doesEdgeExist("c", "a"));
}
}