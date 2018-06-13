/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlc_70785_saad;

import dlc_70785_saad.graph.Graph;
import dlc_70785_saad.graph.UndirectedGraph;
import dlc_70785_saad.graph.parser.GraphDepthFirstParser;

/**
 *
 * @author Gonzalo Saad
 */
public class DLC_70785_Saad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph<String> ud1 = new UndirectedGraph<>();
        ud1.add("1");
        ud1.add("2");
        ud1.add("3");
        ud1.add("4");
        ud1.addArc("2","4",67);
        ud1.addArc("3","4",46);
        ud1.addArc("3","2",75);

        GraphDepthFirstParser graphDepthFirstParser = ud1.getGraphDepthFirstParser();
        System.out.println(graphDepthFirstParser.countComponents());
        System.out.println(graphDepthFirstParser.travel());


        Graph<String> ud2 = new UndirectedGraph<>();
        ud2.add("1");
        ud2.add("2");
        ud2.add("3");
        ud2.add("4");
        ud2.add("5");
        ud2.add("6");
        ud2.addArc("1","3",80);
        ud2.addArc("2","3",60);
        ud2.addArc("2","4",20);
        ud2.addArc("3","5",40);
        ud2.addArc("2","5",30);
        ud2.addArc("4","5",10);
        ud2.addArc("4","6",10);
        ud2.addArc("5","6",500);
        GraphDepthFirstParser graphDepthFirstParser2 = ud2.getGraphDepthFirstParser();
        System.out.println(graphDepthFirstParser2.countComponents());
        System.out.println(graphDepthFirstParser2.travel());


    }
    
}
