package com.java.learn.ds.graph.edge.list;

import com.java.learn.ds.edge.Edge;
import java.util.List;
import java.util.ArrayList;

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
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);

if((v1 == -1) || (v2 == -1))
	return false;

Edge edgeToBeDeleted = null;
boolean deleteEdge = false;

Edge e;
for(int i=0; i<edgeList.size(); i++){
e = edgeList.get(i);
if(((e.start == v1) && (e.end == v2)) || ((e.start == v2) && (e.end == v1))){
	deleteEdge = true;
	edgeToBeDeleted = e;
}
}

if(deleteEdge == true)
	return edgeList.remove(edgeToBeDeleted);
return false;
}

public boolean edgeExists(String v1, String v2){
int vertex1 = vertexIndex(v1);
int vertex2 = vertexIndex(v2);
if((vertex1 == -1) || (vertex2 == -1))
	return false;

for(Edge edge : edgeList)
  if(((edge.start == vertex1) && (edge.end == vertex2)) || ((edge.start == vertex2) && (edge.end == vertex1)))
	return true;
return false;
}

public int vertexIndex(String vertex){
 return vertexList.contains(vertex) ? vertexList.indexOf(vertex):-1;
}

}