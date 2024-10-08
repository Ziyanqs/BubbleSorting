import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int size = 10;
        int a[] = new int[size];
        
        // Input array values
        for(int i = 0; i < size; i++) {
            System.out.print("Please give an integer (positive number): ");
            a[i] = input.nextInt();
        }
        
        // Choose sorting order
        System.out.println("\nChoose sorting order:");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        int choice = input.nextInt();
        boolean ascending = (choice == 1);
        
        // Display unsorted array
        System.out.println("\nUnsorted Array: ");
        for(int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
        
        // Sorting (Bubble Sort with visualization)
        for(int i = 0; i < a.length - 1; i++) {
            boolean swapped = false;
            System.out.println("Iteration " + (i+1) + ":");
            
            for(int j = 0; j < a.length - 1 - i; j++) {
                if((ascending && a[j] > a[j+1]) || (!ascending && a[j] < a[j+1])) {
                    // Swap elements
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
                
                // Visualize comparison
                for(int k = 0; k < a.length; k++) {
                    if(k == j || k == j+1) {
                        // Highlight compared elements
                        System.out.print("\u001B[31m" + a[k] + "\u001B[0m" + " "); // Red text for swap
                    } else {
                        System.out.print(a[k] + " ");
                    }
                }
                System.out.println();
            }
            
            if(!swapped) {
                // If no swaps occurred, the array is already sorted
                System.out.println("\nNo swaps in this iteration. The array is sorted!");
                break;
            }
            System.out.println();
        }
        
        // Display sorted array
        System.out.println("Sorted Array: ");
        for(int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n\nSorting completed!");
    }
}
