public class Product implements IProducct {
     
     private String[] names;
     private double[] prices;
     private String[] months;
     private int[][] sales;
     
     public Product(String[] names, double[] prices ,String[] months, int[][] sales) {
         this.names = names;
         this.prices = prices;
         this.months = months;
         this.sales =sales
         
     }
     public int getUnitsForProduct(int index) {
         int total = 0;
         for int(int j = 0; j <sales[index].length; j++) {
             total += sales[index][j];
             
         }
         return total;
     }
     public int 