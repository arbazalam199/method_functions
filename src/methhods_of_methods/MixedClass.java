package methhods_of_methods;

public class MixedClass {
    public void cuboid(){
        int number=5;
        int cube=number*number*number;
        System.out.println("Cube of the number....." +cube);

    }
    public void square(){
        int a=8;
        int square=a*a;
        System.out.println("Square of the number of....." +square);

    }
    public void addition(){
        int b=2456;
        int c=4864;
        int addition=b+c;
        System.out.println("Additional of the two numbers......" +addition);
    }
    public void substration(){
        int d=85456;
        int e=51564;
        int substration=d-e;
        System.out.println("Substraction of the two numbers......" +substration);
    }
    public void multipication(){
        int f=7895;
        int g=54468;
        int multiply=f*g;
        System.out.println("Muktipication of the two numbers......" +multiply);
    }
    public void dividation(){
        int h=245;
        int i=10;
        int divide=h/i;
        System.out.println("Dividation of the two numbers......" +divide);
    }
    public void eligibility(){
        int age=25;
        if (age>18){
            System.out.println("This person is eligible for Driving Lisence");
        }
        else {
            System.out.println("This person is NOT eligible for Driving Lisence");
        }




        }

    public static void main(String args[]){
        MixedClass obj=new MixedClass();
        obj.cuboid();
        obj.square();
        obj.addition();
        obj.substration();
        obj.multipication();
        obj.dividation();
        obj.eligibility();
    }
}
