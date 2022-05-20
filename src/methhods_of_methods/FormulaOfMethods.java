package methhods_of_methods;

public class FormulaOfMethods {
   // SYNTAX : access_specifier return_type method_name (parameter){}
        public void study(){
        System.out.println("It is a Study Method.....");
        }
        public void work(){
        System.out.println("It is a Work Method.....");
    }
        public void fees(){
        System.out.println("It is a Fees Method.....");
    }
    public void name(){
            System.out.println("What is your Name....?");
    }
    public void answer(){
            System.out.println("My Name is Arbaz Alam.....");
    }
    public void join(){
            System.out.println("Which class you Study....?");
    }
    public void reply(){
            System.out.println("I Am in B.Com final Year....");
    }
    public static void main(String[]args){
        FormulaOfMethods obj=new FormulaOfMethods();
        obj.study();
        obj.work();
        obj.fees();
        obj.name();
        obj.answer();
        obj.join();
        obj.reply();

    }

}
