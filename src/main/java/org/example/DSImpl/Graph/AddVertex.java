package org.example.DSImpl.Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class AddVertex {
    private HashMap<String, ArrayList<String>> adjList =
            new HashMap<>();

    public boolean addVertex(String vertex){
        if(adjList.get(vertex) == null){
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }
}
