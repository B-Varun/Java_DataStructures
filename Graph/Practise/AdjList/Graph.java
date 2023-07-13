package com.java.practise.graph.adj.list;
import java.util.List;
import java.util.ArrayList;
import com.java.practise.node.Node;

public class Graph{
List<String> vertexList;
Node[] edgeList;

public Graph(){
String[] vertices = new String[]{"a","b","c","d","e"};
vertexList = new ArrayList<>();
edgeList = new Node[vertices.length];

for(int i=0; i<vertices.length; i++)
 vertexList.add(vertices[i]);
}

public void addEdge(String vertex1, String vertex2){
 int v1 = vertexIndex(vertex1);
 int v2 = vertexIndex(vertex2);
 if((v1 == -1) || (v2 == -1))
	return;
 Node newNode = new Node(v2);
 if(edgeList[v1] == null){
    edgeList[v1] = newNode;
    return;
   }
 newNode.next = edgeList[v1];
 edgeList[v1] = newNode;
}

public boolean deleteEdge(String vertex1, String vertex2){
 int v1 = vertexIndex(vertex1);
 int v2 = vertexIndex(vertex2);
 if((v1 == -1) || (v2 == -1))
	return false;
 if(edgeList[v1] == null)
    return false;
 else if((edgeList[v1].data == v2)) // && (edgeList[v1].next == null))
 {
    edgeList[v1] = edgeList[v1].next;
    return true;
     }
 else{
   Node node = edgeList[v1];
   while((node.next != null) && (node.next.data != v2))
      node = node.next;
   if((node.next == null) && (node.next.data != v2))
      return false;
   else if(node.next.data == v2){
   node.next = node.next.next;
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
 Node node = edgeList[v1];
 while(node != null){
   if(node.data == v2)
      return true;
   node = node.next;
 }
 return false;
}

public int vertexIndex(String vertex){
 return vertexList.contains(vertex) ? vertexList.indexOf(vertex) : -1;
}

}