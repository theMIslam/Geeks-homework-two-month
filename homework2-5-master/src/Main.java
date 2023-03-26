import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            A.add("A" + i+1);
            B.add("B" + i+2);
        }
        System.out.println(A);
        System.out.println(B);
        Collections.reverse(B);
        System.out.println(B);
        for (int i = 0; i < A.size(); i++) {
            C.add(A.get(i));
            C.add(B.get(i));
        }
        System.out.println(C);
        Comparator<String> comparator = (o1, o2) -> o1.length() - o2.length();
        Collections.sort(C, comparator);
        System.out.println("Готовый с сортировкой ");
        System.out.println(C);
    }
}