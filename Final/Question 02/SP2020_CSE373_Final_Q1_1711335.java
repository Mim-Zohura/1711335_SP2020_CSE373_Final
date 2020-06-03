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
	  private final int MAX_VERTS = 20;
	  private Vertex vertexList[];
	  private int adjMat[][];
	  private int nVerts;
	  private Stack<Integer> s;
}
public class SP2020_CSE373_Final_Q1_1711335 {

}
