import java.util.Arrays;
import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args){
        String ascendNum = "";
        String descendNum = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number");
        int num2 = input.nextInt();
        System.out.println("Please enter the third number");
        int num3 = input.nextInt();
        Integer[] numList = {num1, num2,num3};
        Arrays.sort(numList);
        for (int i= 0; i<3; i++) {
            System.out.println(numList[i]);
            ascendNum = ascendNum + " " + numList[i];
            descendNum = numList[i] + " "+ descendNum;
        }
        System.out.println(ascendNum);
        System.out.println(descendNum);
    }
}
