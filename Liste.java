import java.util.*;



public class Liste {

    public static void greet() {
        System.out.println("Hello");
    }

    public static double mediaNr(double a, double b, double c){
        return  (a + b + c) / 3;
    }
    public static void main(String[] args) {
        List<String> fructe = new ArrayList<>();
        fructe.add("mar");
        fructe.add(1, "banana");
        fructe.add(2, "banana");
        fructe.add(1, "portocala");
        System.out.println(fructe);
        fructe.remove("banana");
        fructe.remove(2);
        System.out.println(fructe.size());
        System.out.println(fructe);
        System.out.println(Arrays.toString(fructe.toArray()));

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Sep", 9);
        mapa.put("Oct", 10);
        mapa.put("Nov", 11);
        mapa.put("Feb", 2);
        mapa.put("Mar", 3);
        mapa.put("Apr", 4);
        System.out.println(mapa);
        greet();
        System.out.println(mediaNr(3, 2, 5.3));
    }
}
