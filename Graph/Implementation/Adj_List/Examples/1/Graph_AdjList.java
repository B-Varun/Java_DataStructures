package com.java.learn.ds.graph.adj.list;
import com.java.learn.ds.graph.adj.list.Graph;
public class Graph_AdjList{
public static void main(String... graphs){
Graph graph = new Graph();
System.out.println("Edge exists between 'A' and 'B' : "+graph.doesEdgeExist("a","b"));
graph.insertEdge("a", "b");
System.out.println("Inserted Edge between 'A' and 'B'");
System.out.println("Edge exists between 'A' and 'B' : "+graph.doesEdgeExist("a","b"));

graph.deleteEdge("a", "b");
System.out.println("Edge between 'A' and 'B' deleted");
System.out.println("Edge exists between 'A' and 'B' : "+graph.doesEdgeExist("a","b"));


System.out.println("Edge exists between 'A' and 'C' : "+graph.doesEdgeExist("a","c"));
graph.insertEdge("a", "c");
System.out.println("Inserted Edge between 'A' and 'C'");
System.out.println("Edge exists between 'A' and 'C' : "+graph.doesEdgeExist("a","c")+"\n\n");

System.out.println("Edge exists between 'A' and 'D' : "+graph.doesEdgeExist("a","d"));
graph.insertEdge("a", "d");
System.out.println("Inserted Edge between 'A' and 'D'");
System.out.println("Edge exists between 'A' and 'D' : "+graph.doesEdgeExist("a","d")+"\n\n");


System.out.println("Edge exists between 'C' and 'B' : "+graph.doesEdgeExist("c","b"));
graph.insertEdge("c", "b");
System.out.println("Inserted Edge between 'A' and 'C'");
System.out.println("Edge exists between 'C' and 'B' : "+graph.doesEdgeExist("c","b")+"\n\n");

System.out.println("Edge exists between 'B' and 'D' : "+graph.doesEdgeExist("b","d"));
graph.insertEdge("b", "d");
System.out.println("Inserted Edge between 'B' and 'D'");
System.out.println("Edge exists between 'B' and 'D' : "+graph.doesEdgeExist("b","d")+"\n\n");
System.out.println("");

}
}