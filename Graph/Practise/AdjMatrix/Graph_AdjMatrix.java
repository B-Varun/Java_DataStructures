package com.java.practise.ds.graph.adj.matrix;
public class Graph_AdjMatrix{
public static void main(String... graphs){
Graph graph = new Graph();
System.out.println("Does edge exists between 'A' and 'B' : "+graph.doesEdgeExist("a", "b"));
System.out.println("Does edge exists between 'A' and 'C' : "+graph.doesEdgeExist("a", "c"));
System.out.println("Does edge exists between 'A' and 'D' : "+graph.doesEdgeExist("a", "d"));


System.out.println("Does edge exists between 'B' and 'D' : "+graph.doesEdgeExist("b", "d"));
System.out.println("Inserted edge between 'B' and 'D' : "+graph.insertEdge("b", "d"));
System.out.println("Does edge exists between 'B' and 'D' : "+graph.doesEdgeExist("b", "d"));


}
}