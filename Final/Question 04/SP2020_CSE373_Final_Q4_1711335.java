package com.nsu.cse373.spring2020.ID1711335;
//https://www.geeksforgeeks.org/printing-paths-dijkstras-shortest-path-algorithm/
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




	public class SP2020_CSE373_Final_Q4_1711335 {
		private int V;   // No. of vertices 

	    private LinkedList<Integer> adj[];
	    
	 // Constructor 
	SP2020_CSE373_Final_Q4_1711335(int v) 
	{
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i) 
		{
			adj[i] = new LinkedList();
        }
    }
	
    void addEdge(int v, int w ,int t) {
        adj[v].add(w);  
        adj[w].add(v);  
       
        
    }
    private static void dijkstra(int[][] adjacencyMatrix, int startVertex) 
	{ 
		int nVertices = adjacencyMatrix[0].length; 

		int[] shortestDistances = new int[nVertices];
		boolean[] added = new boolean[nVertices]; 

		for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) 
		{ 
			shortestDistances[vertexIndex] = Integer.MAX_VALUE; 
			added[vertexIndex] = false; 
		} 
		
		shortestDistances[startVertex] = 0; 

		
		int[] parents = new int[nVertices]; 
		parents[startVertex] = NO_PARENT; 

		// Find shortest path for all vertices
		
		for (int i = 1; i < nVertices; i++) 
		{ 

			int nearestVertex = -1; 
			int shortestDistance = Integer.MAX_VALUE; 
			for (int vertexIndex = 0; 	vertexIndex < nVertices; vertexIndex++) 
			{ 
				if (!added[vertexIndex] && shortestDistances[vertexIndex] < shortestDistance) 
				{ 
					nearestVertex = vertexIndex; 
					shortestDistance = shortestDistances[vertexIndex]; 
				} 
			} 

			
			added[nearestVertex] = true; 
 
			for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) 
			{ 
				int edgeDistance = adjacencyMatrix[nearestVertex][vertexIndex]; 
				
				if (edgeDistance > 0 && ((shortestDistance + edgeDistance) < shortestDistances[vertexIndex])) 
				{ 
					parents[vertexIndex] = nearestVertex; 
					shortestDistances[vertexIndex] = shortestDistance + edgeDistance; 
				} 
			} 
		} 
		private static void printSolution(int startVertex, int[] distances, int[] parents) 
		{ 
			int nVertices = distances.length; 
			System.out.print("Vertex\t Path\tDistance"); 

			for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) 
            { 
				if (vertexIndex != startVertex) 
                  { 
					System.out.print("\n" + startVertex + " to "); 
                    System.out.print(vertexIndex + " \t\t "); 
                    System.out.print(distances[vertexIndex] + "\t\t"); 
                    printPath(vertexIndex, parents); 
                  } 
            } 

        } 
		private static void printPath(int currentVertex, int[] parents) 
        { 
			if (currentVertex == NO_PARENT) 
			{ 
				return; 
			} 
			printPath(parents[currentVertex], parents); 
			System.out.print(currentVertex + " "); 
        } 

		public static void main(String args[]) {
			int n;
			int e;
			int s;
			SP2020_CSE373_Final_Q4_1711335 g = null;
			Scanner sc= new Scanner(System.in);
			String filename="FinalQ4INPUT.txt";
			
			try {
	          BufferedReader br;
	          br = new BufferedReader(new FileReader(new File("C:\\Users\\Mim\\Documents\\Final\\FinalQ4Input.txt")));//open the file
	         
	          String line;

	          line = br.readLine();//first line
	          String param[] = line.split(" ");

	          n = Integer.parseInt(param[0]);
	          e = Integer.parseInt(param[1]);
	        

	          g = new SP2020_CSE373_Final_Q4_1711335(n);
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
	              if(i%10==0)
	              {
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
		          
		          	if(count==e)
		          	{
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
			
			catch (FileNotFoundException ex) 
			{
				System.out.println("There was an exception! The file was not found!");
			} 
				catch (IOException ex)
			{
					System.out.println("There was an exception handling The file!");

			}	 
	      
		}
	}
