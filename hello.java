import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.printf("Please input your full name : ");
        String name = userIn.nextLine();
        System.out.printf("\nYour name is %s\n", name);
        userIn.close();
    }
}