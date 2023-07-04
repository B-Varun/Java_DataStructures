package com.java.learn.ds.graph;
import java.util.List;
import java.util.ArrayList;
public class Graph{
int[][] adjMatrix;
List<String> vertexList = null;

public Graph(){
adjMatrix = new int[][]{{0,1,0,0},{1,0,1,1},{0,1,0,0},{0,1,0,0}};
vertexList = new ArrayList<>();

String[] arr = new String[]{"a", "b", "c", "d"};
for(int i=0; i<arr.length; i++)
	vertexList.add(arr[i]);
 
 System.out.println("The Adjacency Matrix from the list is : ");
for(int[] ar  : adjMatrix){
	for(int a : ar)
		System.out.print(a+"\t");
	System.out.println();
}
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