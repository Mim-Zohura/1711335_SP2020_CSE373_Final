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

public class SP2020_CSE373_Final_Q1_1711335 {
	 private int V;   // No. of vertices 

	    // Array  of lists for Adjacency List Representation 
	    private LinkedList<Integer> adj[];
	    
	 // Constructor 
	SP2020_CSE373_Final_Q1_1711335(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }
	 //Function to add an edge into the Dfs 
    void addEdge(int v, int w) {
        adj[v].add(w);  // Add w to v's list.
        adj[w].add(v);  // Add w to v's list.
    }
	 public static void main(String args[]) {
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
            
      /*      
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
	    }*/

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
        
        System.out.print("\nEnter the source vertex: ");
        int source= sc.nextInt();
        g.DFS(source);
	   
	  
	   
}
	 }
}
