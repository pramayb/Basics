package com.java.basics;

import java.util.Iterator;
import java.util.LinkedList;

public class WeightedGraph {
	static class Edge {
		int source;
		int destination;
		int weight;

		public Edge(int source, int destination, int weight) {
			this.source = source;
			this.destination = destination;
			this.weight = weight;
		}
	}

	static class Graph {
		int vertices;
		LinkedList<Edge>[] adjacencylist;

		Graph(int vertices) {
			this.vertices = vertices;
			adjacencylist = new LinkedList[vertices];
			// initialize adjacency lists for all the vertices
			for (int i = 0; i < vertices; i++) {
				adjacencylist[i] = new LinkedList<>();
			}
		}

		public void addEgde(int source, int destination, int weight) {
			Edge edge = new Edge(source, destination, weight);
			adjacencylist[source].addFirst(edge); // for directed graph
		}

		public void printGraph() {
			for (int i = 0; i < vertices; i++) {
				LinkedList<Edge> list = adjacencylist[i];
				for (int j = 0; j < list.size(); j++) {
					System.out.println("vertex-" + i + " is connected to " + list.get(j).destination + " with weight "
							+ list.get(j).weight);
				}
			}
		}

		public boolean searchPathBFS(int s, int d) {
	        // Mark all the vertices as not visited(By default set 
	        // as false) 
	        boolean visited[] = new boolean[vertices]; 
	  
	        // Create a queue for BFS 
	        LinkedList<Integer> queue = new LinkedList<Integer>(); 
	  
	        // Mark the current node as visited and enqueue it 
	        visited[s]=true; 
	        queue.add(s); 
	  
	        // 'i' will be used to get all adjacent vertices of a vertex 
	        Iterator<Edge> i; 
	        while (queue.size()!=0) 
	        { 
	            // Dequeue a vertex from queue and print it 
	            s = queue.poll(); 
	  
	            int n; 
	            i = adjacencylist[s].listIterator(); 
	  
	            // Get all adjacent vertices of the dequeued vertex s 
	            // If a adjacent has not been visited, then mark it 
	            // visited and enqueue it 
	            while (i.hasNext()) 
	            { 
	                n = i.next().destination; 
	  
	                // If this adjacent node is the destination node, 
	                // then return true 
	                if (n==d)
	                    return true; 
	  
	                // Else, continue to do BFS 
	                if (!visited[n]) 
	                { 
	                    visited[n] = true; 
	                    queue.add(n); 
	                } 
	            } 
	        } 
	  
	        // If BFS is complete without visited d 
	        return false; 
		}

		public void searchPathDFS(int src, int dest) {

		}
	}

	public static void main(String[] args) {
		int vertices = 6;
		Graph graph = new Graph(vertices);
		graph.addEgde(0, 1, 4);
		graph.addEgde(0, 2, 3);
		graph.addEgde(1, 3, 2);
		graph.addEgde(1, 2, 5);
		graph.addEgde(2, 3, 7);
		graph.addEgde(3, 4, 2);
		graph.addEgde(4, 0, 4);
		graph.addEgde(4, 1, 4);
		graph.addEgde(4, 5, 6);
		graph.printGraph();
		System.out.println(graph.searchPathBFS(4, 2));
	}
}
