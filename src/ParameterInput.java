public class ParameterInput {
    public void hello(String name){
        System.out.println("Welcome to the JAVA......" +name);
    }
    public void information(String course, int age){
        System.out.println("Your Course Name Is " +course + "Your Age is " +age);
    }
    public void squarroot(int number){
        System.out.println("Total Sqaure of the NUMBER" +number*number);
    }
    public void checkingage(int age){
        if (age>18){
            System.out.println("Your person is eligible for Driving License");
        }
        else {
            System.out.println("This person is NOT eligible for Driving License");
        }
    }
    public static void main(String args[]){
        ParameterInput obj=new ParameterInput();
        obj.hello("Arbaz Alam");
        obj.information("JAVA", 24);
        obj.squarroot(5);
        obj.checkingage(19);


    }
}
