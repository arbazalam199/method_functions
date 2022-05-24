package methhods_of_methods;

public class CalculatorClass {
    public void makesquare(){
        int number=4;
        int square=number*number;
        System.out.println("Square of number is....." +square);
    }
    public void eligiblityvotes(){
        int age=19;
        if (age>18){
            System.out.println("Eligible for votings");
        }
        else{
            System.out.println("NOT Eligible for voitings");
        }
    }
        public static void main(String[]args){
            CalculatorClass obj = new CalculatorClass();
            obj.makesquare();
            obj.eligiblityvotes();
        }


    }


