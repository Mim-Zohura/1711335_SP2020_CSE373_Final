package com.nsu.cse373.spring2020.ID1711335;

import java.io.*;
import java.util.*;

public class SP2020_CSE373_Final_Q4_1711335 {
	 private int V;   // No. of vertices 

	    // Array  of lists for Adjacency List Representation 
	    private LinkedList<Integer> adj[];
	    
	 // Constructor 
	Dfs(int v) {
     V = v;
     adj = new LinkedList[v];
     for (int i = 0; i < v; ++i) {
         adj[i] = new LinkedList();
     }
 }
	//Function to add an edge into the Dfs 
    void addEdge(int v, int w ,int t) {
        adj[v].add(w);  // Add w to v's list.
        adj[w].add(v);  // Add w to v's list.
        adj[w].add(t);
        adj[t].add(v);
        adj[t].add(w);
        adj[v].add(t);
        
    }
	public static void main(String args[]) {
		 int n;
	      int e;
	      int s;
	      Dfs g = null;
	      scanner sc= new Scanner(System.in);
	      
	      String filename="FinalQ4INPUT.txt";
	      try {
	          BufferedReader br;
	          br = new BufferedReader(new FileReader(new File("C:\\Users\\Mim\\Documents\\Final\\FinalQ4Input.txt")));//open the file
	         
	          String line;

	          line = br.readLine();//first line
	          String param[] = line.split(" ");

	          n = Integer.parseInt(param[0]);
	          e = Integer.parseInt(param[1]);
	          s = Integer.parseInt(param[1]);
	          

		    g = new Dfs(n);
	          System.out.println("Reading from FinalQ4Input.txt");
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
	            
	            int count=0;
		        while ((line=br.readLine()) != null) {//read a line 
		           count++;
		          
		          param = line.split(" ");
		          int v = Integer.parseInt(param[0]);
		          int w = Integer.parseInt(param[1]);
		          int t = Integer.parseInt(param[1]);
		          //add the edge with parameter v and w 
		          if(count==e){
		          System.out.print("(S:"+v+", D:"+w+", W:"+t+ ")}");
		          }
		          else{
		          System.out.print("(S:"+v+", D:"+w+", W:" +t+"),");
		          }
		          
		          g.addEdge(v, w , t);
		          
		          
		           if(count%5==0){
		               System.out.println();
		              
		           }
		      }
	      }
	      
	      
	      
	}
}
