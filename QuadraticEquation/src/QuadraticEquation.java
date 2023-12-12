import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;
    public QuadraticEquation(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getter(){
    return 1;
    }
    public double getDiscriminant(){
    return (this.b * this.b - 4 * this.a * this.c);
    }
    public double getRoot1(){
        return (-this.b + Math.pow (getDiscriminant (),0.5)) / 2 * this.a;
    }
    public double getRoot2(){
        return (-this.b - Math.pow (getDiscriminant (),0.5)) / 2 * this.a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Nhập a, b, c:");
        int a = sc.nextInt ();
        int b = sc.nextInt ();
        int c = sc.nextInt ();
        QuadraticEquation x = new QuadraticEquation(a, b, c);
        double delta = x.getDiscriminant ();
        String result;
        if (delta < 0){
            result = "The equation has no roots";
        }else if (delta == 0) {
            result = "The equation has roots" + x.getRoot1();
        }else {
            result = "The equation has roots " + x.getRoot1() + " and " + x.getRoot2();
        }
        System.out.println (result);
    }
}