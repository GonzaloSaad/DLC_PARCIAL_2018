/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlc_70785_saad.graph.parser;

import dlc_70785_saad.graph.Node;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Gonzalo Saad
 */
public abstract class GraphDepthFirstParser<T> {

    public GraphDepthFirstParser() {
        performDeepFirstTravel();
    }

    protected abstract void performDeepFirstTravel();

    protected abstract List<Node<T>> getNeighbours(Node<T> nodeToVisit);

    public abstract String travel();

    public abstract int countComponents();

    protected String visitInDepth(Node<T> nodeToVisit, Set<Node<T>> visited) {

        if (visited.contains(nodeToVisit)){
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nodeToVisit);
        stringBuilder.append(" ");

        visited.add(nodeToVisit);
        for (Node<T> node: getNeighbours(nodeToVisit) ){
            stringBuilder.append(visitInDepth(node,visited));
        }
        return stringBuilder.toString();
    }
}
