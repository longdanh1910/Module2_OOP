import  java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap he so b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap he so c: ");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        double root1 = equation.getRoot1();
        double root2 = equation.getRoot2();
        double delta = equation.getDiscriminant();
        if (delta>0){
            System.out.println("Phuong trinh co 2 nghiem phan biet: " + root1 + " and " + root2);
        }else if (delta==0){
            System.out.println("Phuong trinh co nghiem kep: " + root1);
        }else{
            System.out.println("Phuong trinh vo nghiem.");
        }

    }
}