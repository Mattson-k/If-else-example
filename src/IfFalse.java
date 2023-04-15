import  java.util.Scanner;

public class IfFalse {

    public static void main(String[] args) {
        int marksObtained, passMark;
        passMark = 60;
        Scanner input = new Scanner(System.in);
        System.out.println("Input Marks as scored");
        marksObtained = input.nextInt();
        if (marksObtained >= passMark){
            System.out.println("you have passed highly welcome");
        }else {
            System.out.println("you have failed terribly");
        }
    }


}