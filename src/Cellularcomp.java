import java.util.Locale;
import java.util.Scanner;

public class Cellularcomp {
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        int accountno = 0;
        char service = ' ';
        try {
            System.out.println("Please enter your account number: ");
            accountno = bill.nextInt();

        } catch (Exception ex) {
            System.out.println("ERROR! Please ensure you entered the correct information.");
            System.exit(0);

        }
        System.out.println("Please enter your service code");
        service = bill.next().toUpperCase().charAt(0);

        switch (service) {
            case 'A':
                Rservice(0, 0, 0, 0, 0);
                break;
            case 'B':
                Pservice(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                break;
            default:
                System.out.println("ERROR INVALID SERVICE CODE");
                return;
        }
    }

    private static void Rservice(int serveCost, int Rlimit, int minutes, double totalCost, double amtDue) {
        try {
            serveCost = 10;
            Rlimit = 50;
            Scanner bill = new Scanner(System.in);
            System.out.println("Please enter the amount of minutes used");
            minutes = bill.nextInt();
            if (minutes > Rlimit) {
                totalCost = (minutes - Rlimit) * 0.2;
                amtDue = (serveCost + totalCost);
                System.out.println("The total amount due is: $" + amtDue);
            } else {
                System.out.println("The total amount due is: " + serveCost);
            }
        }catch (Exception p){
            System.out.println("ERROR! Please ensure you entered the correct information.");
            System.exit(0);
        }
        }

    private static void Pservice(int PserveCost, int Pdaymins, double Pday, double Ptotalcost, double total,
                                 int Pnightmins, double Pnight, int nighlimit, double damtDue, double namtDue) {
        try {
            PserveCost = 25;
            Scanner bill = new Scanner(System.in);
            System.out.println("How many minutes did you use between the hours of 6am to 6pm? :");
            Pdaymins = bill.nextInt();
            System.out.println("How many minutes did you use between the hours of 6pm to 6am? :");
            Pnightmins = bill.nextInt();

            if (Pdaymins > 75) {
                Ptotalcost = (Pdaymins - 75) * 0.10;
                damtDue = (PserveCost + Ptotalcost);

            }
            if (Pnightmins > 100) {
                Ptotalcost = (Pnightmins - 100) * 0.05;
                namtDue = (PserveCost + Ptotalcost);
                total = damtDue + namtDue;
                System.out.println("The total amount due is: $" + total);
            } else {
                System.out.println("The total amount due is: " + PserveCost);
            }
        } catch (Exception E) {
            System.out.println("ERROR! Please ensure you entered the correct information.");
            System.exit(0);
        }
    }
}
