package com.java.learn.ds.graph.adj.matrix;
import java.util.List;
import java.util.ArrayList;
public class Graph{
int[][] adjMatrix;
List<String> vertexList;

public Graph(){
adjMatrix = new int[][]{{0,1,1,0,1},{1,0,0,0,1},{1,0,0,1,0},{0,0,1,0,0},{1,1,0,0,0}};
vertexList = new ArrayList<>();

String[] vertices = new String[]{"a", "b", "c", "d", "e"};
for(int i=0; i<vertices.length; i++)
	vertexList.add(vertices[i]);
}

public void insertEdge(String vertex1, String vertex2){
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
if((v1 == -1) || (v2 == -1))
	return;

adjMatrix[v1][v2] = 1;
adjMatrix[v2][v1] = 1;
}

public boolean deleteEdge(String vertex1, String vertex2){
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
if((v1 == -1) || (v2 == -1))
	return false;
if(adjMatrix[v1][v2] == 1){
 adjMatrix[v1][v2] = 0;
 adjMatrix[v2][v1] = 0;
return true;
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
if(adjMatrix[v1][v2] == 1)
	return true;
return false;
}
}