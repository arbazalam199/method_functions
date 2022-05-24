package methhods_of_methods;

public class ReturnType {
    public String hello(String name){
        String message="Welcome to JAVA....." +name;
        //System.out.println(message);
        return message;
    }
    public int makingsquare(int number){
        int square= number*number;
        return square;
    }
    public String eligibility(double marks){
        if (marks>75.5) {
        return "Taken science";
        }
        else {
            return "NOT Taken Science";
        }
    }
    public static void main(String args[]){
        ReturnType obj=new ReturnType();
        String result= obj.hello("Arbaz Alam");
        System.out.println("Printing in main method" +result);
        int output= obj.makingsquare(5);
        System.out.println("Square is......" +output);
        String percentage= obj.eligibility(65.2);
        System.out.println("output is......" +percentage);

    }
}
