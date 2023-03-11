import java.util.*;

public class Euorepan_township {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double totalhours = 0;
            double accent = 0;
            double regular = 0;
            int town = sc.nextInt();
            while (town-- > 0) {
                
                String s = sc.next();
                String arr[] = s.split(",", 5);
                int totalBedrooms = Integer.parseInt(arr[0]);
                int roofBedrooms = Integer.parseInt(arr[1]);
                int standardrooms = Integer.parseInt(arr[2]);
                int victorialHall = Integer.parseInt(arr[3]);;
                double total1 = (double) (roofBedrooms * 3) + (double) (standardrooms * 4)
                        + (double) (victorialHall * 6);
                double totalHours1 = total1 * 1 / 3 * 2.5;
                double totalHours2 = total1 * 2 / 3 * 3.25;
                double totalHours = totalHours1 + totalHours2;
                double accent1 = total1 * 1 / 3 * 1.5;
                double regular1 = total1 * 2 / 3 * 2.25;
                totalhours += totalHours;
                accent += accent1;
                regular += regular1;
            }
           System.out.print(String.format("%.2f",totalhours)+", ");
           System.out.print(String.format("%.2f",accent)+", ");
           System.out.print(String.format("%.2f",regular)+" ");
           System.out.println();
        }
    }
}
