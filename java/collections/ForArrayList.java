import java.util.ArrayList;


public class ForArrayList {
   public static void main(String[] args) {
      ArrayList<String> a = new ArrayList<String>();
      //Arrayga element qo'shish
      a.add("a");
      a.add("b");
      a.add("c");


      // arraydan berilgan indexli elementni olish
      System.out.println(a.get(0));

      // Arrayning o'lchamini aniqlash
      System.out.println(a.size());

      // Arraydan berilgan indexda joylashgan elementini o'chirish
      System.out.println(a.remove(1));

      // Berilgan indexga berilgan sonni qo'shish
      a.add(1, "Yangi");

      // arrayda berilgan element borligini tekshirish
      System.out.println(a.contains("e"));


      // Berilgan arrayni tozalash
      a.clear();

      System.out.println(a);
   }
}