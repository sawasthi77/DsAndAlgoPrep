package org.example.DSImpl.Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveVertex {
    private HashMap<String, ArrayList<String>> adjList =
            new HashMap<>();

    public boolean removeVertex(String vertex) {
        if (adjList.get(vertex) == null) return false;
        for (String otherVertex : adjList.get(vertex)) {
            adjList.get(otherVertex).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }
}
