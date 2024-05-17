import java.util.Scanner;

public class DijksrasAlgorithm {
//////Dijkstras Algorithm
    public static  int[] DijkstrasAlgorithm(){

    }
    public static void main(String[] args){

        /////This whole part belongs to User Input where we take info about different vertices or you can say different points between
        // which we will find the minimum distance using dijkstra's algo.
        Scanner sc = new Scanner(System.in);

        //Asking for number of vertex and edges
        int noOfvertex = sc.nextInt();
        int noOfEdges = sc.nextInt();

        int edges[][] = new int[noOfvertex][noOfvertex];
        for(int i=0;i<noOfvertex;i++){

            ///Here we are forming link between two vertices and storing them in edges
            System.out.print("Enter Starting vertex:");
            int startingVertex = sc.nextInt();
            System.out.print("Enter ending vertex:");
            int endingVertex = sc.nextInt();

            ///taking the input of distance between these two vertices
            System.out.println("Enter Distance between two:");
            int distance = sc.nextInt();

            ///Now we are u[dating our edge array based on above input values
            edges[startingVertex][endingVertex] = distance;
            edges[endingVertex][startingVertex] = distance;
        }
    }
}