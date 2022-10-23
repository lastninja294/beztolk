import java.util.LinkedList;


public class forLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>();

        // LinkedListga element qo'shish
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);


        // Boshiga element qo'shish
        numbers.addFirst(7);
        System.out.println(numbers);

        // Oxiriga element qo'shish
        numbers.addLast(0);
        System.out.println(numbers);

        // Boshidan element o'chirish
        numbers.removeFirst();
        System.out.println(numbers);

        // Oxiridan element o'chirish
        numbers.removeLast();
        System.out.println(numbers);


        // Berilgan indexdagi elementni o'chirish
        numbers.remove(1);
        System.out.println(numbers);


        // Berilgan indexga element qo'shish
        numbers.add(2, 90);
        System.out.println(numbers);

        

    }
}
