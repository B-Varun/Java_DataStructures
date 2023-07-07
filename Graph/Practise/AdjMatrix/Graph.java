package com.java.ds.practise.adj.matrix;
import java.util.List;
import java.util.ArrayList;
public class Graph{
int[][] adjMatrix;
List<String> vertexList;

public Graph(){
String[] vertices = new String[]{"a","b","c","d","e"};
vertexList = new ArrayList<>();
for(int i=0;i<vertices.length;i++)
vertexList.add(vertices[i]);

adjMatrix = new int[][]{
{0,1,0,0,0},
{1,0,0,0,1},
{0,0,0,0,1},
{0,0,0,0,0},
{0,1,1,0,0}
};
}
public void insertEdge(String vertex1, String vertex2){
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
if((v1 == -1) || (v2 == -1))
	return;

if((adjMatrix[v1][v2] == 0) || (adjMatrix[v2][v1] == 0)){
  adjMatrix[v1][v2] = 1;
  adjMatrix[v2][v1] = 1;
}

}

public boolean deleteEdge(String vertex1, String vertex2){
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
if((v1 == -1) || (v2 == -1))
	return false;
else if((adjMatrix[v1][v2] == 1) || (adjMatrix[v2][v1] == 1)){
  adjMatrix[v1][v2] = 0;
  adjMatrix[v2][v1] = 0;
return true;
}
return false;
}

public boolean doesEdgeExist(String vertex1, String vertex2){
int v1 = vertexIndex(vertex1);
int v2 = vertexIndex(vertex2);
if((v1 == -1) || (v2 == -1))
	return false;
else if((adjMatrix[v1][v2] == 0) || (adjMatrix[v2][v1] == 0))
	return false;
return true;
}

public int vertexIndex(String vertex){
return vertexList.contains(vertex) ? vertexList.indexOf(vertex) : -1;
}
}