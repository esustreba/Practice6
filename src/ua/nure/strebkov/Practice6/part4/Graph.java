package ua.nure.strebkov.Practice6.part4;


        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.Iterator;
        import java.util.Map.Entry;

public class Graph {
    private int maxVertex;
    private ArrayList<Object> vertexList = new ArrayList<>();
    private HashMap<Object, Object> graph = new HashMap<>();

    public Graph(int maxVertex) {
        this.maxVertex = maxVertex;
        vertexList = new ArrayList<>(this.maxVertex);

    }

    boolean addEdge(Object from, Object to) {
        if (vertexList.contains(from) && vertexList.contains(to)) {
            graph.put(from, to);
            return true;
        }
        return false;
    }

    boolean deleteEdge(Object from, Object to) {
        if (vertexList.contains(from) && vertexList.contains(to)) {
            for (Object eObject : graph.keySet()) {
                if (eObject.equals(from) && graph.get(eObject).equals(to)) {
                    graph.remove(eObject);
                }
            }
            return true;

        }
        return false;
    }

    boolean addVertex(Object vertex) {
        if (vertexList.size() < maxVertex && !vertexList.contains(vertex)) {
            vertexList.add(vertex);
            return true;
        }
        return false;
    }

    boolean deleteVertex(Object vertex) {
        if (vertexList.contains(vertex) && (graph.containsKey(vertex) || graph.containsValue(vertex))) {
            Iterator graphIt = graph.entrySet().iterator();
            while (graphIt.hasNext()) {
                Entry item = (Entry) graphIt.next();
                if (item.getValue().equals(vertex) || item.getKey().equals(vertex)) {
                    graphIt.remove();
                }

            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object eObject : graph.keySet()) {
            stringBuilder.append("" + eObject + " ----> " + graph.get(eObject) + "\n");
        }
        return stringBuilder.toString();
    }

}