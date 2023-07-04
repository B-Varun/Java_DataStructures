package com.java.learn.ds.graph.demo;
import com.java.learn.ds.graph.Graph;

public class GraphDemo{
public static void main(String... arg){
Graph graph = new Graph();
System.out.println("An edge exists between 'a' & 'b' : "+graph.doesEdgeExist("a", "b"));
System.out.println("An edge exists between 'b' & 'd' : "+graph.doesEdgeExist("b", "d"));
graph.insertEdge("b", "d");
System.out.println("Inserted an edge betwen vertices b & d");
System.out.println("An edge exists between 'b' & 'd' : "+graph.doesEdgeExist("b", "d"));
graph.deleteEdge("b", "d");
System.out.println("Deleted an edge betwen vertices b & d");
System.out.println("An edge exists between 'b' & 'd' : "+graph.doesEdgeExist("b", "d"));
}

}