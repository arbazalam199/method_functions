package methhods_of_methods;

public class practiceClasses {
    public void school(String name){
        System.out.println("My First School Name...... " +name);
    }
    public void class_name(String class_name){
        System.out.println("My First Class Name..... " +class_name);
    }
    public void class_standard(int class_standard){
        System.out.println("My First Class Standard...... " +class_standard);
    }
    public void fees(double fees){
        System.out.println("My Fees in School...... " +fees);
    }
    public void maths_teacher(String maths_teacher){
        System.out.println("My Maths Teacher Name is...... " +maths_teacher);
    }
    public void hindi_teacher(String hindi_teacher){
        System.out.println("My Hindi Teacher Name is...... " +hindi_teacher);
    }
    public void english_teacher(String english_teacher){
        System.out.println("My English Teacher Name is...... " +english_teacher);
    }
    public void science_teacher(String science_teacher){
        System.out.println("My Science Teacher Name is...... " +science_teacher);
    }
    public void SocialStudy_Teacher(String SocialStudy_Teacher){
        System.out.println("My Social Study Teacher Name is...... " +SocialStudy_Teacher);
    }
    public void GeneralKnowledge_Teacher(String GenralKnowledge_Teacher){
        System.out.println("My General Knowledge Teacher Name is...... " +GenralKnowledge_Teacher);
    }
    public void addition (int a, int b){
        int sum = a+b;
        System.out.println("Addition Of The two Numbers..... " +sum);
    }
    public void subtraction (int c, int d){
        int subtraction = c-d;
        System.out.println("Subtraction Of Two Numbers..... " +subtraction);
    }
    public void multiply (int e, int f){
        int multiply = e*f;
        System.out.println("Multiply Of Two Numbers...... " +multiply);
    }
    public void Divide (int g, int h){
        int divide= g/h;
        System.out.println("Divide Of Two Number...... " +divide);
    }
    public void square (int i){
        int square= 45;
        System.out.println("SquareRoot Of The Number...... " +square*square);
    }
    public void cuboid (int j){
        int cube= 6;
        System.out.println("Cuboid Of This Number...... " +cube*cube*cube);
    }
    public void additional (){
        int ab=856;
        int bc=258;
        int sum=ab+bc;
        System.out.println("Sum Of The Two Numbers...... " +sum);
    }
    public void subtract (){
        int cd=658;
        int de=46;
        int subtract=cd-de;
        System.out.println("Subtract Of The Two Numbers..... " +subtract);
    }
    public void muiltiplier (){
        int eg=45;
        int nh=12;
        int multipilier=eg*nh;
        System.out.println("Multiply Of The Two Numbers...... " +multipilier);
    }
    public void dividation (){
        int fg=386;
        int ns=2;
        int dividation=fg/ns;
        System.out.println("Dividation Of The Two Number...... " +dividation);
    }
    public void square(){
        int mh=9;
        int square=mh*mh;
        System.out.println("Square Of The This Number...... " +square);
    }
    public void cube(){
        int nh=8;
        int cube=nh*nh;
        System.out.println("Cube Of This Number...... " +cube);
    }


    public static void main(String args[]){
        practiceClasses obj=new practiceClasses();
        obj.school("NCR INTER COLLEGE");
        obj.class_name("PlayWay");
        obj.class_standard(01);
        obj.fees(2583.25);
        obj.maths_teacher("BHURA LAL");
        obj.hindi_teacher("RAJESH KUMAR");
        obj.english_teacher("RAKESH SINGH THAKUR");
        obj.science_teacher("ANITA YADAV");
        obj.SocialStudy_Teacher("PRATHIVA YADAV");
        obj.GeneralKnowledge_Teacher("MAHIPAL SINGH SONKAR");
        obj.addition(15,29);
        obj.subtraction(85,45);
        obj.multiply(25,25);
        obj.Divide(325,15);
        obj.square(12);
        obj.cuboid(5);
        obj.additional();
        obj.subtract();
        obj.muiltiplier();
        obj.dividation();
        obj.square();
        obj.cube();

    }
}
