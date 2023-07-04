package com.java.learn.ds.graph;
import java.util.List;
import java.util.ArrayList;
import com.java.learn.ds.edge.Edge;
public class Graph
{
List<String> vertexList = null;
List<Edge> edgeList = null;

public Graph(){
 vertexList = new ArrayList<>();
 edgeList = new ArrayList<>();
 String[] vertices = new String[]{"a","b","c","d","e"};
 for(int i=0; i<vertices.length; i++)
	vertexList.add(vertices[i]);	

 edgeList.add(new Edge(0,1));
 edgeList.add(new Edge(0,2));
 edgeList.add(new Edge(0,3));
 edgeList.add(new Edge(0,4));
 edgeList.add(new Edge(1,2));
 edgeList.add(new Edge(2,3));
 edgeList.add(new Edge(3,4));
}

public void insertEdge(String vertex1, String vertex2){
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
if((v1 == -1) || (v2 == -1))
	return;

Edge edge = new Edge(v1, v2);
edgeList.add(edge);
}

public boolean deleteEdge(String vertex1, String vertex2){
boolean toBeDeleted = false;
Edge deleteEdge = null;
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
if((v1 == -1) || (v2 == -1))
	return false;

for(Edge e : edgeList){
 if((e.start == v1 && e.end == v2) || (e.start == v2 && e.end == v1)){
	toBeDeleted = true;
	deleteEdge = e;
}
}
if(toBeDeleted == true){
	edgeList.remove(deleteEdge);
	return true;
}
return false;
}

public boolean doesEdgeExist(String vertex1, String vertex2){
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
if((v1 == -1) && (v2 == -1))
	return false;

for(Edge edge : edgeList)
  if((edge.start == v1 && edge.end == v2) || (edge.start == v2 && edge.end == v1))
	return true;

return false;
}

public int vertexIndex(String vertex){
return vertexList.contains(vertex)?vertexList.indexOf(vertex):-1;
}
}