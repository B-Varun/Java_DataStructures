package com.java.learn.ds.graph.demo;
import com.java.learn.ds.graph.edge.list.Graph;
public class GraphExample{
public static void main(String... demo){
 Graph graph = new Graph();
 System.out.println("Edge present between vertices 'a' and 'e'"+graph.doesEdgeExist("a", "e"));
 System.out.println("Edge present between vertices 'e' and 'a'"+graph.doesEdgeExist("e", "a"));
 System.out.println("Edge present between vertices 'd' and 'a'"+graph.doesEdgeExist("d", "a"));

graph.insertEdge("e", "a");
graph.insertEdge("d", "a");
graph.insertEdge("c", "a");

System.out.println("Added edge between 'e' and 'a'");
System.out.println("Added edge between 'd' and 'a'");
System.out.println("Added edge between 'c' and 'a'");

 System.out.println("Edge present between vertices 'e' and 'a'"+graph.doesEdgeExist("e", "a"));

 System.out.println("Edge present between vertices 'd' and 'a'"+graph.doesEdgeExist("d", "a"));

 System.out.println("Edge present between vertices 'c' and 'a'"+graph.doesEdgeExist("c", "a"));

System.out.println("Deleted edge between 'd' and 'a' : "+graph.deleteEdge("d", "a"));

System.out.println("Deleted edge between 'e' and 'a' : "+graph.deleteEdge("e", "a"));

 System.out.println("Edge present between vertices 'e' and 'a'"+graph.doesEdgeExist("e", "a"));

 System.out.println("Edge present between vertices 'd' and 'a'"+graph.doesEdgeExist("d", "a"));
}
}