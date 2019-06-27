import java.util.Scanner;

public class IllegalTriangleException{
    public static void checkIllegalTriangle(float side1,float side2, float side3) throws Exception {
        if((side1<=0)||(side2<=0)||(side3<=0)
                ||((side1+side2)<=side3)
                ||((side1+side3)<=side2)
                ||((side2+side3)<=side1))
            throw new Exception();

    }

    public static void main(String[] args) {

            System.out.println("Input 3 sides: ");
            Scanner scanner=new Scanner(System.in);
            float side1=scanner.nextFloat();
            float side2=scanner.nextFloat();
            float side3=scanner.nextFloat();
        try{
            checkIllegalTriangle(side1,side2,side3);
            System.out.println("OK Triangle");
        }
        catch (Exception e){
            System.out.println("Illegal Triangle");
        }
    }
}
