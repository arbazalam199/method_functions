package methhods_of_methods;

public class CalcyInputParameter {
    public void addition(int a, int b){
        int sum=a+b;
        System.out.println("Addition of two numbers is......."+sum);
    }
    public void subtraction(int c, int d){
        int subtraction=c+d;
        System.out.println("Subtraction of the two Numbers......" +subtraction);
    }
    public void multiply(int e, int f){
        int multiply=e*f;
        System.out.println("Multiply of two Numbers......" +multiply);
    }
    public void divide(int g, int h){
        int divide=g/h;
        System.out.println("Divide of the two Numbers......" +divide);
    }
    public void squar(int i){
        int square=i;
        System.out.println("Square of the Numbers......" +square*square);
    }
    public void cube(int j){
        int cube=j;
        System.out.println("Cuboid of this Numbers......" +cube*cube*cube);
    }
    public static void main(String args[]){
        CalcyInputParameter obj=new CalcyInputParameter();
        obj.addition(6, 4);
        obj.subtraction(852,458);
        obj.multiply(45,90);
        obj.divide(230,10);
        obj.squar(15);
        obj.cube(5);
    }
}
