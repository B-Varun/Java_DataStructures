package com.java.learn.ds.graph.adj.list;
import com.java.learn.ds.graph.node.Node;
import java.util.List;
import java.util.ArrayList;
public class Graph{
List<String> vertexList;
Node[] adjList;

public Graph(){
vertexList = new ArrayList<>();
String[] vertices = new String[]{"a", "b", "c", "d", "e"};
for(int i=0; i<vertices.length; i++)
	vertexList.add(vertices[i]);

adjList = new Node[vertices.length];
}

public void insertEdge(String vertex1, String vertex2){
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
if((v1 == -1) || (v2 == -1))
	return;

Node new_Node = new Node(v2);

if(adjList[v1] == null){
 adjList[v1] = new_Node;
}
else{
 Node temp = adjList[v1];
 new_Node.next = temp;
 temp = new_Node;
}
}

public boolean deleteEdge(String vertex1, String vertex2){
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
if((v1 == -1) || (v2 == -1))
	return false;

if(adjList[v1] == null)
	return false;
else if((adjList[v1].data == v2) && (adjList[v1].next == null)){
 adjList[v1] = null;
 return true;
}
else{
 Node temp = adjList[v1];
 if(temp.data == v2){
	temp = temp.next;
	return true;
 }
 
 Node pointer = temp;
 while((pointer.next != null) && (pointer.next.data != v2)){
	pointer = pointer.next;
 }
 if(pointer.next == null)
	return false;
 else if(pointer.next.data == v2){
	pointer.next = pointer.next.next;
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

Node temp = adjList[v1];
while(temp!=null){
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