package com.nsu.cse373.spring2020.ID1711335;

//References
//https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/
//https://www.freecodecamp.org/news/dfs-for-your-next-tech-giant-interview/
//https://thecodingsimplified.com/depth-first-search-dfs-on-graph-with-implementation/
//https://thecodingsimplified.com/depth-first-search-dfs-on-graph-with-implementation/


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
    
 // A function used by DFS 
    void DFSUtil(int v, boolean visited[],int parent) {
        // Mark the current node as visited and print it 
        visited[v] = true;
        if(parent==-1){
        System.out.println("Visited:"+v+" Parent: null");//the first element in the search

        }
        
        else{
        System.out.println("Visited:"+v+" Parent:"+parent);
          }
        // Recur for all the vertices adjacent to this vertex 
        Iterator<Integer> i = adj[v].descendingIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFSUtil(n, visited,v );
            }
        }
    }
    void DFS(int v) {
        // Mark all the vertices as not visited(set as 
        // false by default in java) 
        boolean visited[] = new boolean[V];

        // Call the recursive helper function to print DFS traversal 
        DFSUtil(v, visited,-1);
        
    
        
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
          System.out.print("("+v+","+w+")}");
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
      catch (FileNotFoundException ex) {
          System.out.println("There was an exception! The file was not found!");
      } catch (IOException ex) {
          System.out.println("There was an exception handling The file!");

      }

}
}
