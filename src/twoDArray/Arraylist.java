package twoDArray;
import java.util.*;
public class Arraylist {
    static void main() {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        for(int i = 0; i < 3; i++) {

            matrix.add(new ArrayList<>());
        }

        matrix.get(0).add(1);
        matrix.get(0).add(2);
        matrix.get(0).add(3);

        matrix.get(1).add(4);
        matrix.get(1).add(5);
        matrix.get(1).add(6);

        matrix.get(2).add(7);
        matrix.get(2).add(8);
        matrix.get(2).add(9);

        System.out.println(matrix);
    }
}
