
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.

    public static void print(int[][] array) {
        for (int[] i : array) {
            System.out.println(i);
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers

    public static int sum(int[][] array) {
        int sum = 0;
        for (int[] i : array) {
            for (int j : i) {
                sum += j;
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.

    public static double average(int[][] array) {
        int sum = sum(array);
        int total = 0;
        for (int[] i : array) {
            for (int j : i) {
                total += 1;
            }
        }
        return (double) sum / total;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.

    public static int minimum(int[][] array) {
        int min = array[0][0];
        for (int[] i : array) {
            for (int j : i) {
                if (j < min) {
                    min = j;
                }
            }
        }
        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.

    public static int maximum(int[][] array) {
        int max = array[0][0];
        for (int[] i : array) {
            for (int j : i) {
                if (j > max) {
                    max = j;
                }
            }
        }
        return max;
    }


    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.

    public static int evenCountStandard(int[][] array) {
        int even = 0;
        for (int i = 0; i < array.length; i++) { // i is only an index rn
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    even += 1;
                }
            }
        }
        return even;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.

    public static int evenCountEnhanced(int[][] array) {
        int even = 0;
        for (int[] i : array) { // i is the entire list
            for (int j : i) {
                if (j % 2 == 0) {
                    even += 1;
                }
            }
        }
        return even;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.

    public static boolean allPositive(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                if (j < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.

    public static int[] rowSums(int[][] array) {
        int sum = 0; // sum of each lists
        int curr = 0; // indexes for each sum in the final list
        int[] result = {0,0,0,0,0}; //final list
        for (int[] i : array) {
            for (int j : i) {
                sum += j;
            }
            result[curr] = sum;
            sum = 0;
            curr += 1; //curr is the index, so we need to add one everytime so the sum would shift right and eventually turn into a final list
        }
        return result;
    }


    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.

    public static int[] colSums(int[][] array) {
        int curr = 0;
        int sum = 0;
        int[] result = {0,0,0,0,0};
        while (curr < array[0].length) {
            for (int[] i : array) {
                sum += i[curr];
            }
            result[curr] += sum;
            sum = 0;
            curr += 1;
        }
        return result;
    }
}

