package com.java.learn.ds.graph.edge.list.demo;
import com.java.learn.ds.edge.list.Graph;
public class Graph_EdgeList{
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



}
}