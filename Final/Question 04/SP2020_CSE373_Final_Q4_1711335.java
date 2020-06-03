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
	            
	      }
	      
	      
	}
}
