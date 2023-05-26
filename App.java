int[] totalCarSales = new int[12]; 

 

b) String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; 

// print the name of the first month 

System.out.println(months[0]); 

  

// iterate over the array and print all the months 

for (String month : months) { 

    System.out.println(month); 

} 

c) public class Main { 

    public static void main(String[] args) { 

        // initialize the arrays 

        int[] totalCarSales = {100000, 150000, 80000, 120000, 200000, 90000, 

                               180000, 170000, 140000, 250000, 120000, 190000}; 

        String[] months = {"January", "February", "March", "April", "May", "June", 

                           "July", "August", "September", "October", "November", "December"}; 

  

        // find the highest sales value and its index 

        int maxSales = totalCarSales[0]; 

        int maxIndex = 0; 

        for (int i = 1; i < totalCarSales.length; i++) { 

            if (totalCarSales[i] > maxSales) { 

                maxSales = totalCarSales[i]; 

                maxIndex = i; 

            } 

        } 

  

        // print the results to the console 

        System.out.println("The highest sales value of " + maxSales + " occurred in " + months[maxIndex] + "."); 

    } 

} 