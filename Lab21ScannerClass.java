import java.util.Scanner;
public class Lab21ScannerClass
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter NAME: ");
        String name = scan.nextLine();
        System.out.print("Enter ID: ");
        String id = scan.nextLine();
        System.out.print("Enter Birthday(dd/mm/yyyy): ");
        String birthday = scan.nextLine();
        System.out.print("Enter Age: ");
        int age = scan.nextInt();
        System.out.print("Enter GPA: "); 
        float GPA = scan.nextFloat();
        System.out.println("My name is " + name);
        System.out.println("Birthday: " + birthday + "\t Age:" + age);
        System.out.println("ID: " + id + "\t GPA: " + GPA);

    }
}