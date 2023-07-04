package com.java.learn.ds.graph.demo;
import com.java.learn.ds.graph.edge.list.Graph;

public class GraphDemo{
public static void main(String... arg){
Graph graph = new Graph();
System.out.println("An edge exists between 'a' & 'b' : "+graph.edgeExists("a", "b"));
System.out.println("Inserted an edge betwen vertices a & b");
System.out.println("An edge exists between 'a' & 'b' : "+graph.edgeExists("a", "b"));
}

}