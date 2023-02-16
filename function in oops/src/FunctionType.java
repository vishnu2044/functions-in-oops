import java.util.Scanner;

public class FunctionType {
    public static void main (String a[])
    {
        Scanner st = new Scanner(System.in);
        PersonalDetailStorage per1 = new PersonalDetailStorage();
        PersonalDetailStorage per2 = new PersonalDetailStorage();

        System.out.println("Enter your name : ");
        per1.name = st.nextLine();
        System.out.println("Enter your age : ");
        per1.age = st.nextInt();
        System.out.println("Enter your birth year : ");
        per1.BoY = st.nextInt();

        System.out.println("Enter your name : ");
        per2.name = st.nextLine();
        System.out.println("Enter your age : ");
        per2.age = st.nextInt();
        System.out.println("Enter your birth year : ");
        per2.BoY = st.nextInt();

        System.out.println("Person 1 details : ");
        per1.DisplayNameAge();
        System.out.println("Person 2 details : ");
        per2.DisplayNameAge();

    }
}
