package com.java.learn.ds.graph.edge.list;
import java.util.List;
import java.util.ArrayList;
import com.java.learn.ds.graph.edge.Edge;

public class Graph
{
List<String> vertexList;
List<Edge> edgeList;

public Graph(){
vertexList = new ArrayList<>();
String[] arr = new String[]{"a", "b", "c", "d", "e"};
edgeList = new ArrayList<Edge>();

for(int i=0; i<arr.length; i++)
vertexList.add(arr[i]);

edgeList.add(new Edge(0, 1));
edgeList.add(new Edge(0, 2));
edgeList.add(new Edge(0, 3));
edgeList.add(new Edge(0, 4));
edgeList.add(new Edge(2, 3));
}
/*
public void insertEdge(){}

public void deleteEdge(){}
*/
public boolean doesEdgeExist(String vertex1, String vertex2){
 int v1 = vertexIndex(vertex1);
 int v2 = vertexIndex(vertex2);
 if((v1 ==-1) || (v2 ==-1))
	return false;   

 for(Edge edge : edgeList)
	if((edge.start==v1 && edge.end == v2) || (edge.start==v2 && edge.end == v1))
		return true;
return false;	
}

public int vertexIndex(String vertex){
return vertexList.contains(vertex) ? vertexList.indexOf(vertex) : -1;
}

public static void main(String... arg){
 Graph graph = new Graph();
 System.out.println("Index of d : "+graph.vertexIndex("d"));
 System.out.println("Index of z : "+graph.vertexIndex("z"));
 System.out.println("Is edge a -> z present : "+graph.doesEdgeExist("a", "z"));
 System.out.println("Is edge c -> d present : "+graph.doesEdgeExist("c", "d"));
 System.out.println("Is edge d -> e present : "+graph.doesEdgeExist("d", "e"));
}

}