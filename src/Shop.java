public class Shop {
        public static void main(String[] args) {


                System.out.println("Suleman Supermart");

        Product p1=new Product("Bottle", 50000, 2,new Date(11,8,2023));
        Product p2=new Product("Keyboard",700,10,new Date(12,12,2022));

        //new date
             //   p1.setMfgdate(new Date("20","DEC","2023"));

        System.out.println(p1);
        System.out.println(p2);
        Product p3 = p1.recentdate(p1,p2);
                System.out.println("Recent product ");
                System.out.println(p1.recentdate(p1,p2));
        }
    }

