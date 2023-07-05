package com.java.learn.ds.graph.adj.list;
import com.java.learn.ds.edge.Edge;
import java.util.List;
import java.util.ArrayList;
public class Graph{
List<String> vertexList;
Edge[] adjList;

public Graph(){
vertexList = new ArrayList<>();
String[] vertices = new String[]{"a","b","c","d","e"};
for(int i=0;i<vertices.length;i++)
    vertexList.add(vertices[i]);

adjList = new Edge[vertices.length];
}

public boolean insertEdge(String vertex1, String vertex2){
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
 if((v1 == -1) || (v2 == -1))
	return false;
 else if(adjList[v1] == null){
	adjList[v1] = new Edge(v2);
	return true;
 }
 else{
	Edge edge = new Edge(v2);
	edge.next = adjList[v1];
	adjList[v1] = edge;
	return true;
 }
}

public boolean deleteEdge(String vertex1, String vertex2){
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
 if((v1 == -1) || (v2 == -1))
	return false;
 else if(adjList[v1] == null)
	return false;
 else if((adjList[v1].data == v2) && (adjList[v1].next == null)){
	adjList[v1] = null;
	return true;
 }
 else{
    Edge temp = adjList[v1];
    while((temp.next!=null) && (temp.next.data!=v2))
	temp = temp.next;
    if((temp.next == null) && (temp.data != v2))
	return false;
    if(temp.next.data == v2){
	temp.next = temp.next.next;
	return true;
    }
 }
return false;
}

public boolean doesEdgeExist(String vertex1, String vertex2){
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
 if((v1 == -1) || (v2 == -1))
	return false;

if(adjList[v1] == null)
    return false;
else{
    Edge temp = adjList[v1];
    while(temp != null) 
	if(temp.data == v2)
		return true;
	temp = temp.next;
    }
return false;
}

public int vertexIndex(String vertex){
return vertexList.contains(vertex) ? vertexList.indexOf(vertex) : -1;
}
}