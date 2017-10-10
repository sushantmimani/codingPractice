package preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Graphs {

    ArrayList<Vertices> nodes;

    static class Vertices {
        int label;
        ArrayList<Vertices> adj;

        public Vertices(int data){
            this.label = data;
            adj = new ArrayList<Vertices>();
        }
    }

    public Graphs() {
        nodes = new ArrayList<Vertices>();
    }




    public void addEdge(int v1, int v2){
        Vertices node = getNode(v1);
        node.adj.add(getNode(v2));
    }

    public void displayGraph(){
        for(Vertices v: nodes){
            System.out.print(v.label+" ");
            for(Vertices x: v.adj)
                System.out.print(x.label+ " ");
            System.out.println();
        }

    }

    public Vertices getNode(int label){
        for(Vertices node: nodes){
            if(node.label == label){
                return node;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Graphs graph = new Graphs();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices");
        int v = sc.nextInt();
        for(int i =0;i<v;i++){
            System.out.println("Enter vertex value");
            int val = sc.nextInt();
            Vertices vertices = new Vertices(val);
            graph.nodes.add(vertices);
        }
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(3,2);
        graph.displayGraph();
    }
}
