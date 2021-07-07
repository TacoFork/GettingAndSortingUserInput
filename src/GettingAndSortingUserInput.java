import java.util.Scanner;
public class GettingAndSortingUserInput {
    public static void main(String[] args){
        Scanner keybd = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String firstInitial = keybd.next();
        String lastName = keybd.next();
        int houseNumber = keybd.nextInt();
        String streetName = keybd.next();
        String streetType = keybd.next();
        String city = keybd.next();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
