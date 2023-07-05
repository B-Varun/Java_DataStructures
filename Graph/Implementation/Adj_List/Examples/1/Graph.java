package com.java.learn.ds.graph.adj.list;
import java.util.List;
import java.util.ArrayList;
import com.java.learn.ds.node.Node;
public class Graph{
List<String> vertexList;
Node[] adjList;

public Graph(){
vertexList = new ArrayList<>();
String[] vertices = new String[]{"a", "b", "c", "d", "e", "f", "g"};
for(int i=0; i<vertices.length; i++)
     vertexList.add(vertices[i]);

adjList = new Node[vertices.length];
}

public void insertEdge(String vertex1, String vertex2){
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
if((v1 == -1) || (v2 == -1))
	return;

Node newNode = new Node(v2);
if(adjList[v1] == null){
	adjList[v1] = newNode;
	return;
}
newNode.next = adjList[v1];
adjList[v1] = newNode;
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
 while((temp.next != null) && (temp.next.data!=v2))
	temp = temp.next;
 if((temp.next == null) || (temp.next.data!=v2))
	return false;
 else if(temp.next.data == v2){
	temp.next = temp.next.next;
	return true;
 }
}
return false;
}

public int vertexIndex(String vertex){
return vertexList.contains(vertex) ? vertexList.indexOf(vertex) : -1;
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

}