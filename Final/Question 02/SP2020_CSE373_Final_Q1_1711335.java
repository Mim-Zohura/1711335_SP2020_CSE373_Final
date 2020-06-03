package com.nsu.cse373.spring2020.ID1711335;
import java.io.*; 
import java.util.*; 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
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
	  public void SP2020_CSE373_Final_Q1_1711335() {
		 
			    vertexList[0].Visited = true;
			    displayVertex(0);
			    s.push(0);
			    
			    while(!s.isEmpty()) {    
			      int v = getAdjUnvisitedVertex(s.peek());
			      
			      if(v == -1) {
			        s.pop();
			      } else {
			        vertexList[v].Visited = true;
			        displayVertex(v);
			        s.push(v);
			      }
			    }
			  
		  }
}
public class SP2020_CSE373_Final_Q1_1711335 {
	  int n;
      int e;
      SP2020_CSE373_Final_Q1_1711335 g = null;
     
      
      Scanner sc= new Scanner(System.in);
      
      String filename="FinalQ1INPUT.txt";
      try {
          BufferedReader br;
          br = new BufferedReader(new FileReader(new File("C:\\Users\\Mim\\Documents\\Final\\FinalQ1Input.txt")));//open the file
         
          String line;

          line = br.readLine();//first line

          String param[] = line.split(" ");

          n = Integer.parseInt(param[0]);
          e = Integer.parseInt(param[1]);
          
          g = new SP2020_CSE373_Final_Q1_1711335(n);
          System.out.println(n+" "+e);
            
          System.out.print("Vertices: \n{" );
          for (int i = 1; i <= n; i++) {
              if(i==n){
              System.out.print(br.readLine()+"}");
              }
              else{
              System.out.print(br.readLine()+", ");
              }
            if(i%10==0){
                System.out.println();
            }
          }
            System.out.print("\nEdges:\n{");
            
            
      Writer writer = null;

	    try {
	        writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream("FinalQ1Input.txt"), "utf-8"));
	        writer.write("g.AddEdge()");
	    } catch (IOException ex) {
	        // Report
	    } finally {
	       try {writer.close();} catch (Exception ex) {//ignore}
	       }
	    }

	    int count=0;
        while ((line=br.readLine()) != null) {//read a line 
           count++;
          
          param = line.split(" ");
          int v = Integer.parseInt(param[0]);
          int w = Integer.parseInt(param[1]);
          
          //add the edge with parameter v and w 
          if(count==e){
          System.out.print("("+v+","+w+")}");
          }
          else{
          System.out.print("("+v+","+w+"),");
          }
          
          g.addEdge(v, w);
          
          
           if(count%5==0){
               System.out.println();
              
           }
      }
	   
	  
	    BufferedReader inFile;
        inFile = new BufferedReader(new FileReader("C:\\Users\\Mim\\Documents\\Final\\FinalQ1Input.txt"));
        File file = new File("C:\\Users\\Mim\\Documents\\Final\\FinalQ1Input.txt");
        Scanner fIn = new Scanner(file);
        fIn.nextLine(); //skipping the first line!
        while (fIn.hasNext())
        {
           // System.out.print(fIn.next());
            System.out.print(" Visited Vertex:  ");
            System.out.print(fIn.nextInt());
            System.out.print(" Parents:  ");
            System.out.println(fIn.nextInt());
        }
	        
        fIn.close();
}
