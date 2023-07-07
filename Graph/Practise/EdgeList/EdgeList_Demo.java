package com.java.practise.ds.graph.edge.list;
import com.java.practise.ds.graphs.edge.list.Graph;
public class EdgeList_Demo{
public static void main(String... graphs){
Graph graph = new Graph();

System.out.println("Is there an edge between a and b : "+graph.doesEdgeExist("a", "b"));
System.out.println("Is there an edge between a and c : "+graph.doesEdgeExist("a", "c"));
System.out.println("Is there an edge between b and e : "+graph.doesEdgeExist("b","e"));
System.out.println("Is there an edge between c and f : "+graph.doesEdgeExist("c", "f"));
System.out.println("Is there an edge between e and d : "+graph.doesEdgeExist("d", "e"));

System.out.println("Is there an edge between a and h : "+graph.doesEdgeExist("a", "h"));
System.out.println("Is there an edge between d and f : "+graph.doesEdgeExist("f", "d"));
System.out.println("Is there an edge between a and g : "+graph.doesEdgeExist("a", "g"));
System.out.println("Is there an edge between a and e : "+graph.doesEdgeExist("a", "e"));

graph.insertEdge("a","h");
System.out.println("Edge inserted between 'a' and 'h' ");

graph.insertEdge("d","f");
System.out.println("Edge inserted between 'd' and 'f' ");

graph.insertEdge("a","g");
System.out.println("Edge inserted between 'a' and 'g' ");

graph.insertEdge("a","e");
System.out.println("Edge inserted between 'a' and 'e' ");


System.out.println("Edge deleted between 'a' and 'g' : "+graph.deleteEdge("a","g"));
System.out.println("Is there an edge between a and g : "+graph.doesEdgeExist("a", "g"));


System.out.println("Edge deleted between 'a' and 'e' : "+graph.deleteEdge("a","e"));
System.out.println("Is there an edge between a and e : "+graph.doesEdgeExist("a", "e"));

}
}