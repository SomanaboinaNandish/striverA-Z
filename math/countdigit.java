package math;

import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int digit =0;
    while(num!=0){
        digit++;
        num/=10;
    }
    System.out.println(digit);
    }
}
