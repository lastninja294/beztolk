import java.util.Vector;

public class forVector {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<Integer>();

        // vectorga element qo'shish
        vec.add(1);
        vec.add(2);
        vec.add(3);
        System.out.println(vec);

        // Berilgan indexga element qo'shish
        vec.add(0, 7);
        System.out.println(vec);

        // vectordan element o'chirish
        vec.remove(3);
        System.out.println(vec);

        
    }
}
