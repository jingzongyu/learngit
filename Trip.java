package chapter2;

import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请选择您的出行月份：");
        int mouth=input.nextInt();
        switch (mouth){
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("请选择机舱：");
                int jicang=input.nextInt();
                switch (jicang){
                    case 1:
                        System.out.println("4500元");
                        break;
                    case 2:
                        System.out.println("4000元");
                }
                break;
            case 1:
            case 2:
            case 3:
            case 11:
            case 12:
                System.out.println("请选择机舱：");
                int jican=input.nextInt();
                switch (jican){
                    case 1:
                        System.out.println("2500元");
                        break;
                    case 2:
                        System.out.println("2000元");
                }
                break;
        }
    }
}
