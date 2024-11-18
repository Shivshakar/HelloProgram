import java.util.Scanner;

public class Switch_Case {
        public static void main(String[] args) {
            int a, b;
            String operator;
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter value of a");
            a=sc.nextInt();
            System.out.println("Enter value of b");
            b=sc.nextInt();
            System.out.println("Enter a operation to be done");
            operator=sc.next();
            switch(operator) {
                case "+":
                    System.out.println(a+b);
                    break;
                case "-":
                    System.out.println(a-b);
                    break;
                case "*":
                    System.out.println(a*b);
                    break;
                case "/":
                    System.out.println(a/b);
            }
        }
    }
