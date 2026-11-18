//Question 1.1

import java.util.Scanner;


public class MatressSalesReport {
    
    public static void main(String[] args) {
        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
            
            
        };
        
        doubles[] prices = {450.00, 520.00, 600.00};
        String[] months = {"Jan", "Feb", "March", "April", "May", "June",};
        
        int[][] sales = {
            {12, 15, 10, 18, 20, 14},      //Cozy Nights Monarch
            {20, 18, 22, 19, 25, 21},     //Restonic Barbados
            {14, 16, 15, 17, 13, 19},     //Sealy Phuket
        };
        
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your own sales data? (y/n):" );
        if (input.nextLine().trim().equalsIgnoreCase("y")){
            for (int i = 0; i< products.length; i++) {
                System.out.println("\n" + products[i] + " (units sold per month)");
                for (int j = 0; j < months.length; j++) {
                    System.out.print(" " +months[j] +  ":");
                    sales[i][j] = input.nextInt();
                }
                input.nextLine();  //Clear line
            }
        }
    }
    input.close(); 
    
    //------Calculations-----//
    int[]totalUnits = new int[products.length];
    intgrandTotalUnits = 0;
    double grandTotalRevenue;
    
    for (int i=0; i<sales.length;i++){
        for (int j = 0 ; j < sales[i].lenght; j++) {
            totalUnits[i] += sales[i][j];
        }
        grandTotalUnits += totalUnits[i];
        grandTotalRevenue += totalUnits[i] *prices[i];
    }
    
    int totalProducts = products.lenght;
    double averagePerProduct = (double) grandTotalUnits / totalProducts;
    
    //Most Popular Product = highest total sales
    inttopIndex = 0;
    for (int i = 1; i <totalUnits.length; i++) {
        if (totalUnits[i] > totalUnits[topIndex]) {
            topIndex = i;
        }
        
    }
    //----- Display Report ------Calculations-----
    System.out.println("\m============ MATRESS SALES REPORT========== ");
    System.out.printf("%-20s","Product");
    for (String m : months) {
        System.out.println("----------------");
        +"--------";
        
        for (int i = 0; i<products.length; i++) {
            System.out.printf("%-20s",products[i]);
            for (int j = 0; j < months.length; j++) {
                System.out.printf("%6d", sales[i][j]);
            }
            System.out.printf("%8d%%12.2f%n",totalUnits[i], totalUnits * prices[i];);
            
        }
        System.out.println("\n-----------SUMMARY------------");
        System.out.println("Totalnumber of products    : "+ totalProducts);
        System.out.println("Total units sold "    + grandTotalUnits);
        System.out.printf("Average units sold per product : %.2f%n", averagePerProduct);
        System.out.printf("Toatal revenue          :  %.2f%n", grandTotalRevenue);
        System.out.println("Most Popular product :  " + products[top index] + " (" +totalUnits[topIndex] + " units")");
        System.out.println("============================");
        
    }
    
}