import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       // exemple1();
       // exemple2();
       // exemple3();

       // exemple4();

        exemple5_box();
        exemple6_arrayList();

    }

    private static void exemple6_arrayList() {
        ArrayList<Elephant> list1 = new ArrayList<>();
        list1.add(new Elephant("ASDS", 12));
        list1.add(new Elephant("DDDD", 13));

        System.out.println(list1);

        list1.add(null);
        System.out.println(list1);
    }

    private static void exemple5_box() {

        BoxForTwo<Elephant> box1 = new BoxForTwo<>();
        System.out.println(box1+": "+box1.getCount());
        box1.put(new Elephant("ACDS", 47));
        System.out.println(box1+": "+box1.getCount());
        box1.put(new Elephant("UYTRE", 77));
        System.out.println(box1+": "+box1.getCount());
        box1.put(new Elephant("qqq", 14));
        System.out.println(box1+": "+box1.getCount());

        box1.swap();
        System.out.println(box1+": "+box1.getCount());


        BoxForTwo<Crocodile> box2 = new BoxForTwo<>();
        box2.put(new Crocodile());
        System.out.println(box2);
    }

    private static void exemple4() {

        Crocodile c = new Crocodile();
        Elephant e = new Elephant("кришна",45);

        Printer<Elephant> pe = new Printer<>();
        //pe.printPairOfSimilar(e, c);
        Printer<Crocodile> pc = new Printer<>();
        //pc.printPairOfSimilar(e, c);
        Printer<Animal> pa = new Printer<>();
        pa.printPairOfSimilar(e, c);

    }

    private static void exemple3() {
        String g = "Grisha";
        Elephant e = new Elephant("Рама",80);
        Printer<String> pr= new Printer();
        pr.printPairOfSimilar("hggj", g);
       // pr.printPairOfSimilar(e, g);

        Printer<Elephant> pr2 = new Printer<>();
        pr2.printPairOfSimilar(e, new Elephant("QWER", 99));


    }

    private static void exemple2() {
        String g = "Grisha";
        Elephant e = new Elephant("Рама",80);
        printPair(e, g);
    }

    private static void exemple1() {
        String v = "Vasya";
        printSmth(v);

        Elephant e = new Elephant("Хатхи", 36);
        printSmth(e);

        Double d = 36.5;
        printSmth(d);

    }

    public static void printSmth(Object o) {
        System.out.println("у меня тут такая штука:");
        System.out.println(o.toString());
        System.out.println("и все");
    }

    public static void printPair(Object o1, Object o2) {
        System.out.println("у меня тут пара штук:");
        System.out.println(o1.toString() + "; "+ o2.toString());
        System.out.println("и все");
    }



}

class Printer<T>{
    public void printPairOfSimilar(T o1, T o2) {
        System.out.println("у меня тут пара однотипных штук:");
        System.out.println(o1.toString() + "; "+ o2.toString());
        System.out.println("и все");
    }
}