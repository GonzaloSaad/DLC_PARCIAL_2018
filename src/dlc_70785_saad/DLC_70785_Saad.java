/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlc_70785_saad;

import dlc_70785_saad.graph.DirectedGraph;
import dlc_70785_saad.graph.Graph;
import dlc_70785_saad.graph.UndirectedGraph;
import dlc_70785_saad.graph.parser.GraphDepthFirstParser;

/**
 * @author Gonzalo Saad
 */
public class DLC_70785_Saad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        doTest();


    }

    private static void doTest(){
        System.out.println("**************** Undirected NonWeighted Graph ****************");
        Graph<String> undirectedNonWeightedGraph = getUndirectedNonWeightedGraph();
        GraphDepthFirstParser undirectedNonWeightedGraphDFParser = undirectedNonWeightedGraph.getGraphDepthFirstParser();
        System.out.println(undirectedNonWeightedGraphDFParser.countComponents());
        System.out.println(undirectedNonWeightedGraphDFParser.travel());

        System.out.println("**************** Undirected Weighted Graph ****************");
        Graph<String> undirectedWeightedGraph = getUndirectedWeightedGraph();
        GraphDepthFirstParser<String> undirectedWeightedGraphDFParser = undirectedWeightedGraph.getGraphDepthFirstParser();
        System.out.println(undirectedWeightedGraphDFParser.countComponents());
        System.out.println(undirectedWeightedGraphDFParser.travel());

        System.out.println("**************** Undirected NonWeighted Graph - 2 Components ****************");
        Graph<String> undirectedNonWeightedGraph2Components = getUndirectedNonWeightedGraph2Components();
        GraphDepthFirstParser undirectedNonWeightedGraphDFParser2Components = undirectedNonWeightedGraph2Components.getGraphDepthFirstParser();
        System.out.println(undirectedNonWeightedGraphDFParser2Components.countComponents());
        System.out.println(undirectedNonWeightedGraphDFParser2Components.travel());

        System.out.println("**************** Undirected Weighted Graph - 2 Components ****************");
        Graph<String> undirectedWeightedGraph3Components = getUndirectedWeightedGraph2Components();
        GraphDepthFirstParser<String> undirectedWeightedGraphDFParser2Components = undirectedWeightedGraph3Components.getGraphDepthFirstParser();
        System.out.println(undirectedWeightedGraphDFParser2Components.countComponents());
        System.out.println(undirectedWeightedGraphDFParser2Components.travel());

        System.out.println("**************** Directed NonWeighted Graph ****************");
        Graph<String> directedNonWeightedGraph = getDirectedNonWeightedGraph();
        GraphDepthFirstParser<String> directedNonWeightedGraphDFParser = directedNonWeightedGraph.getGraphDepthFirstParser();
        System.out.println(directedNonWeightedGraphDFParser.travel());

        System.out.println("**************** Directed Weighted Graph ****************");
        Graph<String> directedWeightedGraph = getDirectedWeightedGraph();
        GraphDepthFirstParser<String> directedWeightedGraphDFParser = directedWeightedGraph.getGraphDepthFirstParser();
        System.out.println(directedWeightedGraphDFParser.travel());

    }

    private static Graph<String> getUndirectedNonWeightedGraph() {
        Graph<String> undirectedNonWeightedGraph = new UndirectedGraph<>();
        undirectedNonWeightedGraph.add("a");
        undirectedNonWeightedGraph.add("b");
        undirectedNonWeightedGraph.add("c");
        undirectedNonWeightedGraph.add("d");
        undirectedNonWeightedGraph.add("e");
        undirectedNonWeightedGraph.add("f");
        undirectedNonWeightedGraph.add("g");
        undirectedNonWeightedGraph.add("h");
        undirectedNonWeightedGraph.add("i");
        undirectedNonWeightedGraph.add("j");
        undirectedNonWeightedGraph.addArc("a", "b");
        undirectedNonWeightedGraph.addArc("a", "c");
        undirectedNonWeightedGraph.addArc("a", "d");
        undirectedNonWeightedGraph.addArc("b", "e");
        undirectedNonWeightedGraph.addArc("b", "g");
        undirectedNonWeightedGraph.addArc("c", "e");
        undirectedNonWeightedGraph.addArc("c", "f");
        undirectedNonWeightedGraph.addArc("d", "f");
        undirectedNonWeightedGraph.addArc("d", "i");
        undirectedNonWeightedGraph.addArc("e", "g");
        undirectedNonWeightedGraph.addArc("e", "h");
        undirectedNonWeightedGraph.addArc("f", "h");
        undirectedNonWeightedGraph.addArc("g", "j");
        undirectedNonWeightedGraph.addArc("h", "j");
        undirectedNonWeightedGraph.addArc("i", "j");
        return undirectedNonWeightedGraph;
    }

    private static Graph<String> getUndirectedWeightedGraph() {
        Graph<String> undirectedNonWeightedGraph = new UndirectedGraph<>();
        undirectedNonWeightedGraph.add("a");
        undirectedNonWeightedGraph.add("b");
        undirectedNonWeightedGraph.add("c");
        undirectedNonWeightedGraph.add("d");
        undirectedNonWeightedGraph.add("e");
        undirectedNonWeightedGraph.add("f");
        undirectedNonWeightedGraph.add("g");
        undirectedNonWeightedGraph.add("h");
        undirectedNonWeightedGraph.add("i");
        undirectedNonWeightedGraph.add("j");
        undirectedNonWeightedGraph.addArc("a", "b", getRandomWeight());
        undirectedNonWeightedGraph.addArc("a", "c", getRandomWeight());
        undirectedNonWeightedGraph.addArc("a", "d", getRandomWeight());
        undirectedNonWeightedGraph.addArc("b", "e", getRandomWeight());
        undirectedNonWeightedGraph.addArc("b", "g", getRandomWeight());
        undirectedNonWeightedGraph.addArc("c", "e", getRandomWeight());
        undirectedNonWeightedGraph.addArc("c", "f", getRandomWeight());
        undirectedNonWeightedGraph.addArc("d", "f", getRandomWeight());
        undirectedNonWeightedGraph.addArc("d", "i", getRandomWeight());
        undirectedNonWeightedGraph.addArc("e", "g", getRandomWeight());
        undirectedNonWeightedGraph.addArc("e", "h", getRandomWeight());
        undirectedNonWeightedGraph.addArc("f", "h", getRandomWeight());
        undirectedNonWeightedGraph.addArc("g", "j", getRandomWeight());
        undirectedNonWeightedGraph.addArc("h", "j", getRandomWeight());
        undirectedNonWeightedGraph.addArc("i", "j", getRandomWeight());
        return undirectedNonWeightedGraph;
    }

    private static Graph<String> getUndirectedNonWeightedGraph2Components() {
        Graph<String> undirectedNonWeightedGraph = new UndirectedGraph<>();
        undirectedNonWeightedGraph.add("a");
        undirectedNonWeightedGraph.add("b");
        undirectedNonWeightedGraph.add("c");
        undirectedNonWeightedGraph.add("d");
        undirectedNonWeightedGraph.add("e");
        undirectedNonWeightedGraph.add("f");
        undirectedNonWeightedGraph.add("g");
        undirectedNonWeightedGraph.add("h");
        undirectedNonWeightedGraph.add("i");
        undirectedNonWeightedGraph.add("j");
        undirectedNonWeightedGraph.addArc("a", "b");
        undirectedNonWeightedGraph.addArc("a", "c");
        undirectedNonWeightedGraph.addArc("a", "d");

        undirectedNonWeightedGraph.addArc("e", "g");
        undirectedNonWeightedGraph.addArc("e", "h");
        undirectedNonWeightedGraph.addArc("f", "h");
        undirectedNonWeightedGraph.addArc("g", "j");
        undirectedNonWeightedGraph.addArc("h", "j");
        undirectedNonWeightedGraph.addArc("i", "j");
        return undirectedNonWeightedGraph;
    }

    private static Graph<String> getUndirectedWeightedGraph2Components() {
        Graph<String> undirectedNonWeightedGraph = new UndirectedGraph<>();
        undirectedNonWeightedGraph.add("a");
        undirectedNonWeightedGraph.add("b");
        undirectedNonWeightedGraph.add("c");
        undirectedNonWeightedGraph.add("d");
        undirectedNonWeightedGraph.add("e");
        undirectedNonWeightedGraph.add("f");
        undirectedNonWeightedGraph.add("g");
        undirectedNonWeightedGraph.add("h");
        undirectedNonWeightedGraph.add("i");
        undirectedNonWeightedGraph.add("j");
        undirectedNonWeightedGraph.addArc("a", "b", getRandomWeight());
        undirectedNonWeightedGraph.addArc("a", "c", getRandomWeight());
        undirectedNonWeightedGraph.addArc("a", "d", getRandomWeight());

        undirectedNonWeightedGraph.addArc("e", "g", getRandomWeight());
        undirectedNonWeightedGraph.addArc("e", "h", getRandomWeight());
        undirectedNonWeightedGraph.addArc("f", "h", getRandomWeight());
        undirectedNonWeightedGraph.addArc("g", "j", getRandomWeight());
        undirectedNonWeightedGraph.addArc("h", "j", getRandomWeight());
        undirectedNonWeightedGraph.addArc("i", "j", getRandomWeight());
        return undirectedNonWeightedGraph;
    }

    private static Graph<String> getDirectedNonWeightedGraph() {
        Graph<String> directedNonWeightedGraph = new DirectedGraph<>();
        directedNonWeightedGraph.add("a");
        directedNonWeightedGraph.add("b");
        directedNonWeightedGraph.add("c");
        directedNonWeightedGraph.add("d");
        directedNonWeightedGraph.add("e");
        directedNonWeightedGraph.add("f");
        directedNonWeightedGraph.add("g");
        directedNonWeightedGraph.add("h");
        directedNonWeightedGraph.add("i");
        directedNonWeightedGraph.add("j");
        directedNonWeightedGraph.addArc("a", "b");
        directedNonWeightedGraph.addArc("a", "c");
        directedNonWeightedGraph.addArc("a", "d");
        directedNonWeightedGraph.addArc("b", "e");
        directedNonWeightedGraph.addArc("b", "g");
        directedNonWeightedGraph.addArc("c", "e");
        directedNonWeightedGraph.addArc("c", "f");
        directedNonWeightedGraph.addArc("d", "f");
        directedNonWeightedGraph.addArc("d", "i");
        directedNonWeightedGraph.addArc("e", "g");
        directedNonWeightedGraph.addArc("e", "h");
        directedNonWeightedGraph.addArc("f", "h");
        directedNonWeightedGraph.addArc("g", "j");
        directedNonWeightedGraph.addArc("h", "j");
        directedNonWeightedGraph.addArc("i", "j");
        return directedNonWeightedGraph;
    }

    private static Graph<String> getDirectedWeightedGraph() {
        Graph<String> directedNonWeightedGraph = new DirectedGraph<>();
        directedNonWeightedGraph.add("a");
        directedNonWeightedGraph.add("b");
        directedNonWeightedGraph.add("c");
        directedNonWeightedGraph.add("d");
        directedNonWeightedGraph.add("e");
        directedNonWeightedGraph.add("f");
        directedNonWeightedGraph.add("g");
        directedNonWeightedGraph.add("h");
        directedNonWeightedGraph.add("i");
        directedNonWeightedGraph.add("j");
        directedNonWeightedGraph.addArc("a", "b", getRandomWeight());
        directedNonWeightedGraph.addArc("a", "c", getRandomWeight());
        directedNonWeightedGraph.addArc("a", "d", getRandomWeight());
        directedNonWeightedGraph.addArc("b", "e", getRandomWeight());
        directedNonWeightedGraph.addArc("b", "g", getRandomWeight());
        directedNonWeightedGraph.addArc("c", "e", getRandomWeight());
        directedNonWeightedGraph.addArc("c", "f", getRandomWeight());
        directedNonWeightedGraph.addArc("d", "f", getRandomWeight());
        directedNonWeightedGraph.addArc("d", "i", getRandomWeight());
        directedNonWeightedGraph.addArc("e", "g", getRandomWeight());
        directedNonWeightedGraph.addArc("e", "h", getRandomWeight());
        directedNonWeightedGraph.addArc("f", "h", getRandomWeight());
        directedNonWeightedGraph.addArc("g", "j", getRandomWeight());
        directedNonWeightedGraph.addArc("h", "j", getRandomWeight());
        directedNonWeightedGraph.addArc("i", "j", getRandomWeight());
        return directedNonWeightedGraph;
    }

    private static int getRandomWeight() {
        return (int) (Math.random() * 100);
    }
}
