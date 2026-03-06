import java.util.*;

public class  Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        ListIterator<Integer> it = list.listIterator();

        System.out.print("Forward: ");
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        System.out.print("Backward: ");
        while(it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }

        sc.close();
    }
}