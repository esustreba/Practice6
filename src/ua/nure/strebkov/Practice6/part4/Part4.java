package ua.nure.strebkov.Practice6.part4;

public class Part4 {

	public static void main(String[] args) {
		Graph graph = new Graph(4);
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addVertex(5);
		graph.addEdge(1, 3);
		graph.addEdge(3, 2);
		graph.addEdge(2, 5);
		graph.addEdge(5, 1);
		System.out.println(graph);
		graph.deleteVertex(3);
		System.out.println(graph);
	}

}
