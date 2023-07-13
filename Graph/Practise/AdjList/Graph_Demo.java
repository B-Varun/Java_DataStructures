package com.java.practise.graph.adj.list;
import com.java.practise.graph.adj.list.Graph;
import com.java.practise.node.Node;

public class Graph_Demo{
public static void main(String[] graphs){
Graph graph = new Graph();
System.out.println("Does edge exists between 'C' and 'A' : "+graph.doesEdgeExist("c", "a"));
graph.addEdge("c", "a");
System.out.println("Inserted edge between 'C' and 'A'");
System.out.println("Does edge exists between 'C' and 'A' : "+graph.doesEdgeExist("c", "a"));

System.out.println("Does edge exists between 'D' and 'A' :"+ graph.doesEdgeExist("d", "a"));

graph.addEdge("d", "a");
System.out.println("Inserted edge between 'D' and 'A'");
System.out.println("Does edge exists between 'D' and 'A' : "+graph.doesEdgeExist("d", "a"));


graph.deleteEdge("d", "a");
System.out.println("Deleted edge between 'D' and 'A'");
System.out.println("Does edge exists between 'D' and 'A' : "+graph.doesEdgeExist("d", "a"));

System.out.println("");


}
}