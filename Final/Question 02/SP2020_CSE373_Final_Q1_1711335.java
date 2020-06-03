package com.nsu.cse373.spring2020.ID1711335;
import java.io.*; 
import java.util.*; 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Stack;
class Vertex {
	  public char label;
	  public boolean Visited;
	  
	  public Vertex(char lab) {
	    label = lab;
	    Visited = false;
	  }
	}
class Graph{
	  private final int MAX_VERTS;
	  private Vertex vertexList[];
	  private int adjMat[][];
	  private int nVerts;
	  private Stack<Integer> s;
	  public Graph() {
		    vertexList = new Vertex[MAX_VERTS];
		    adjMat = new int[MAX_VERTS][MAX_VERTS];
		    nVerts = 0;
		    s = new Stack<Integer>();
		  }
	  public void addVertex(char lab) {
		    vertexList[nVerts++] = new Vertex(lab);
		  }
	  public void addEdge(int start, int end) {
		    adjMat[start][end] = 1;
		    adjMat[end][start] = 1;
		  }
	  public void displayVertex(int v) {
		    System.out.print(vertexList[v].label + " ");
		  }
	  public int getAdjUnvisitedVertex (int v) {
		    for(int j = 0; j < nVerts; j++) {
		      if(adjMat[v][j] == 1 && vertexList[j].Visited == false) {
		        return j;
		      }
		    }
		    return -1;
		  }
		  
}
public class SP2020_CSE373_Final_Q1_1711335 {

}
