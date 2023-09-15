public class CircleTest {

    public static void main(String[] args) {
        Circle c1 = new Circle(25);
        Circle c2 = new Circle(22);


        Circle c4 = c1.clone();
        System.out.println("C4 = "+c4.areainfo());
//        c1.setRadius(25);
//        c2.setRadius(23);
        System.out.println("C1 = "+c1.areainfo());
        System.out.println("C2 = "+c2.areainfo());

        Circle c3 = c1.largestCircle(c1,c2);
        System.out.println("largest circle = "+c3.areainfo());

    }
}
