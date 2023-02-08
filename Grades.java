package PACKAGE_NAME;

import java.util.Scanner;

public class Grades {
    int[] arr = new int[8];
    int sum= 0;
    Scanner sc = new Scanner(System.in);

   public int addMarks(int mark){
       for(int i = 0; i<8; i++){
           arr [i] = sc.nextInt();

           sum += arr[i];
       }
       return sum;
   }
}
