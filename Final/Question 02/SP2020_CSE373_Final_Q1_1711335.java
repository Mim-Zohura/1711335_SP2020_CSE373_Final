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
	  public void dfs() {
		 
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
      Dfs g = null;
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

			System.out.print("15 32 \n");
       System.out.println("Vertices : \n { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, \n  10, 11, 12, 13, 14 }");
       System.out.println("Edges : \n { (0, 1), (0, 2), (1, 3), (2, 3), (1, 6),\n"
               + "(1, 3), (6, 3), (2, 3), (3, 7), (2, 7),\n"
               + "(6, 4), (3, 4), (3, 5), (5, 7), (4, 5),\n"
               + "(4, 9), (6, 9), (9, 10), (4, 10), (5, 10),\n"
               + "(5, 11), (10, 11), (7, 11), (9, 10), (10, 11),\n"
               + "(10, 12), (10, 13), (9, 14), (11, 14), (1, 14),\n"
               + "(2, 14) }");
	    
	    Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the source vertex: ");
	    int num = myObj.nextInt();
	    System.out.println(num);
	    
	    BufferedReader br;
        br = new BufferedReader(new FileReader(new File("FinalQ1INPUT.txt")));//open the file
        String line;


        line = br.readLine();//first line


        String param[] = line.split(" ");


        n = Integer.parseInt(param[0]);
        e = Integer.parseInt(param[1]);
	    Graph  g1 = new Graph(n);


        for (int i = 0; i < n * 2; i++) {


            br.readLine();


        }


        while ((br.readLine()) != null) {//read a line 


            line = br.readLine();//jump the line between    
            param = line.split(" ");
            int v = Integer.parseInt(param[0]);
            int w = Integer.parseInt(param[1]);
            //add the edge with parameter v and w 
            g1.addEdge(v, w);
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
