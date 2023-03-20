import java.util.ArrayList;

public class Lab5 {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<Integer>(5);
        for (int i = 0; i < 10; i++) {
            // [0, 99]
            double rand = Math.random() * 100;
            int randInt = (int) rand;
            intArray.add(randInt);
        }

        ArrayList<Integer> revIntArray = new ArrayList<Integer>(5);
        for (int integer : intArray) {
            revIntArray.add(0, integer);
        }

        System.out.println(intArray.toString());
        System.out.println(revIntArray.toString());

        ArrayList<HourlyEmployee> employees = new ArrayList<HourlyEmployee>(100);
        for (int i = 0; i < 4; i++) {
            employees.add(new HourlyEmployee());
        }
        System.out.println(employees.toString());
        System.out.println(employees.size());

        HourlyEmployee newEmployee = new HourlyEmployee();
        employees.set(0, newEmployee);
        System.out.println(employees.toString());

        employees.remove(3);
        employees.trimToSize();

        Pair<String> pair1 = new Pair<String>("Julia", "Tom");
        Pair<String> pair2 = new Pair<String>("Julia", "Tom");
        Pair<String> pair3 = new Pair<String>("Judie", "Tom");

        System.out.println("first pair==>" + pair1.toString());
        System.out.println("second pair==>" + pair2.toString());
        System.out.println("third pair==>" + pair3.toString());

        System.out.println("first and second pair are equal? " + pair1.equals(pair2));
        System.out.println("first and third pair are equal? " + pair1.equals(pair3));

        Triple<String, Double> trip1 = new Triple<String, Double>("Toronto", 547.0, "Montreal");
        Triple<String, Double> trip2 = new Triple<String, Double>("Toronto", 547.0, "Montreal");
        Triple<String, Double> trip3 = new Triple<String, Double>("Toronto", 264.5, "Kingston");

        System.out.println("first triple==>" + trip1.toString());
        System.out.println("second triple==>" + trip2.toString());
        System.out.println("third triple==>" + trip3.toString());

        System.out.println("first and second triple are equal? " + trip1.equals(trip2));
        System.out.println("first and third triple are equal? " + trip1.equals(trip3));
    }
}
