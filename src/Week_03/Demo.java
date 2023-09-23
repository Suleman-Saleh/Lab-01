package Week_03;

import java.util.Scanner;
public class Demo {
    public static void main (String[] args){
        Music music1 = new Music("Cruel Summer",new Artist("Sullu","indian","101"),2,"Rockstar",new Date(11,12,2003));
        Music music2 = new Music("Strangers",new Artist("Kenny Grace","American","04"),4,"Hip Hop",new Date(22,9,2023));
        Music music3 = new Music("Snooze",new Artist("SZA","American","01"),50,"SOS",new Date(12,12,2022));
        Music music4 = new Music("Vampire",new Artist("Olivia Rodrigo","British","17"),2,"PSP",new Date(2,12,2023));
//        System.out.println(music1);
//        System.out.println(music2);
//        System.out.println(music3);
//        System.out.println(music4);
//        Music list[] = new Music[10];
//        list[0] = music1;
//        list[1] = music2;
//        list[2] = music3;
//        list[3] = music4;
//          Music list[] = {music1, music2, music3, music4};
//
//        for (int i = 0; i <= list.length ; i++)
//            System.out.println(list[i]);

//        boolean m = music1.equals(music2);
//        System.out.println(m);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title");
        String title = sc.next();
        System.out.println("Enter artist detail");
        String name = sc.next();
        String nationality = sc.next();
        String ranking = sc.next();
        System.out.println("Enter duration");
        int duration = sc.nextInt();
        System.out.println("Enter albumname");
        String albumname = sc.nextLine();
        System.out.println("Enter date");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        Music music5 = new Music(title,new Artist(name,nationality,ranking),duration,albumname,new Date(day,month,year));
        System.out.println(music5);
    }
}
