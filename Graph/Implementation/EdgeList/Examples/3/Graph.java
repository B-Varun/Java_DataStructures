package com.java.learn.ds.graph.edge.list;
import com.java.learn.ds.edge.Edge;
import java.util.*;
public class Graph
{
List<String> vertexList;
List<Edge> edgeList;

public Graph(){
vertexList = new ArrayList<>();
edgeList = new ArrayList<>();

 String[] vertices = new String[]{"a","b","c","d","e"};
 for(int i=0; i<vertices.length; i++)
	vertexList.add(vertices[i]);	

 edgeList.add(new Edge(0,1));
 edgeList.add(new Edge(0,2));
 edgeList.add(new Edge(0,4));
 edgeList.add(new Edge(1,2));
 edgeList.add(new Edge(2,3));
 edgeList.add(new Edge(3,4));
}

public boolean doesEdgeExist(String vertex1, String vertex2){
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
if((v1 == -1) || (v2 == -1))
	return false;

for(Edge e : edgeList)
if((e.start == v1 && e.end == v2) || (e.start == v2 && e.end == v1))
	return true;

return false;
}

public int vertexIndex(String vertex){
return vertexList.contains(vertex) ? vertexList.indexOf(vertex) : -1;
}

public boolean deleteEdge(String vertex1, String vertex2){
boolean toDelete = false;
Edge toDeleteEdge = null;
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
if((v1 == -1) || (v2 == -1))
	return false;

for(Edge e : edgeList){
if((e.start == v1 && e.end == v2) || (e.start == v2 && e.end == v2)){
 toDelete = true;
 toDeleteEdge = e;
}
}

if(toDelete == true){
	edgeList.remove(toDeleteEdge);
	toDelete = false;
	toDeleteEdge = null;
	return true;
 }

return false;
}

public void insertEdge(String vertex1, String vertex2){
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
if((v1 == -1) || (v2 == -1))
	return;
Edge edge = new Edge(v1, v2);
edgeList.add(edge);
}
}