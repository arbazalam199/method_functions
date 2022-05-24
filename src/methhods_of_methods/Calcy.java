package methhods_of_methods;

public class Calcy {
    public void add(){
        int a=5;
        int b=25;
        int sum=a+b;
        System.out.println("Sum of two numbers......" +sum);
        int s=12;
        int d=5;
        int subtract=s-d;
        System.out.println("Subtract of two numbers......" +subtract);
        int e=85;
        int j=5;
        int multiply=e*j;
        System.out.println("Multiply of two numbers......." +multiply);
        int t=105;
        int h=35;
        int divide=t/h;
        System.out.println("Dividation of two numbers......" +divide);
        int height=5;
        int length=6;
        int area=height*length;
        System.out.println("Area of the House......" +area);
        int strating_kilometer=255;
        int ending_kilometer=125;
        int distance_between=strating_kilometer-ending_kilometer;
        System.out.println("Distance between the ROAD......" +distance_between);

    }
    public static void main(String[]args){
        Calcy obj=new Calcy();
        obj.add();
        System.out.print("araz");

    }
}
