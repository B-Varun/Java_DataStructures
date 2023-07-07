package com.java.practise.ds.graphs.edge.list;
import java.util.List;
import java.util.ArrayList;
import com.java.practise.ds.edge.Edge;
public class Graph{
List<String> vertexList;
List<Edge> edgeList;

public Graph(){
String[] vertices = new String[]{"a","b","c","d","e","f","g","h"};
vertexList = new ArrayList<>();
for(int i=0; i<vertices.length;i++)
 vertexList.add(vertices[i]);


edgeList = new ArrayList<>();
edgeList.add(new Edge(0,1));
edgeList.add(new Edge(0,2));
edgeList.add(new Edge(1,4));
edgeList.add(new Edge(2,5));
edgeList.add(new Edge(3,6));
edgeList.add(new Edge(4,5));
edgeList.add(new Edge(4,3));
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
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
if((v1 == -1) || (v2 == -1))
	return false;
boolean toDelete = false;
Edge toDeleteEdge = null;

for(Edge e : edgeList){
 if((e.start == v1 && e.end == v2) || (e.start == v2 && e.end == v1)){
	toDelete = true;
	toDeleteEdge = e;	
 }
}
if(toDelete == true){
 edgeList.remove(toDeleteEdge);
 return true;
}
return false;	
}

public boolean doesEdgeExist(String vertex1, String vertex2){
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
if((v1 == -1) || (v2 == -1))
	return false;

for(Edge e : edgeList){
if((e.start == v1 && e.end == v2) || (e.start == v2 && e.end == v1))
	return true;
}
return false;
}

public int vertexIndex(String vertex){
return vertexList.contains(vertex) ? vertexList.indexOf(vertex) : -1;
}

}