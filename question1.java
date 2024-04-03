// here is no second largest element.
public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 15, 30};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}







import java.util.Scanner;

public class Example {
    // Returns the index of x if it is present in arr[], else return -1
    int binarySearch(String arr[], String x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if x is present at mid
            if (arr[mid].equalsIgnoreCase(x))
                return mid;

            // If x greater, ignore left half
            if (arr[mid].compareToIgnoreCase(x) < 0)
                left = mid + 1;

            // If x is smaller, ignore right half
            else
                right = mid - 1;
        }

        // if we reach here, then element was not present
        return -1;
    }

    // Driver method to test above
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Example ob = new Example();
        String arr[] = {"Alice", "Bob", "Charlie", "David", "Emily", "Frank"};
        System.out.print("Enter the name of the student to search: ");
        String nameToSearch = scanner.nextLine();
        int result = ob.binarySearch(arr, nameToSearch);
        if (result == -1)
            System.out.println("Student not found");
        else
            System.out.println("Student found at index " + result);
    }
}









// missingNumber
public class Example{
    static int sumOfNnumbers(int n)
    {
        int sum = (n * (n+1))/ 2;
        return sum;
    }
  
    static int sumOfElements(int[] array)
    {
        int sum = 0;
 
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
 
        return sum;
    }
    public static void main(String[] args)
    {
        int n = 8;
        int[] a = {1, 4, 5, 3, 7, 8, 6};
        int sumOfNnumbers = sumOfNnumbers(n);
        int sumOfElements = sumOfElements(a); 
        int missingNumber = sumOfNnumbers - sumOfElements; 
        System.out.println("Missing Number is = "+missingNumber);
    }
}











import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example{
    public static void main(String[] args){
        int[] nums = {1,2,3,1,2,3,4};
        Set<Integer> set = new LinkedHashSet<>();
        for(int num : nums){
            set.add(num);
        }

        Integer[] result = set.toArray(new Integer[set.size()]);
        System.out.println(Arrays.toString(result));
    } 
}









import java.util.Scanner;

public class Example {
    // Returns the index of x if it is present in arr[], else return -1
    int binarySearch(String arr[][], String x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if x is present at mid
            if (arr[mid][0].equalsIgnoreCase(x))
                return mid;

            // If x greater, ignore left half
            if (arr[mid][0].compareToIgnoreCase(x) < 0)
                left = mid + 1;

            // If x is smaller, ignore right half
            else
                right = mid - 1;
        }

        // if we reach here, then element was not present
        return -1;
    }

    // Driver method to test above
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Example ob = new Example();
        String students[][] = {
            {"Alice", "85", "90"},
            {"Bob", "75", "80"},
            {"Charlie", "90", "95"},
            {"David", "80", "85"},
            {"Emily", "95", "90"},
            {"Frank", "70", "75"}
        };
        System.out.print("Enter the name of the student to search: ");
        String nameToSearch = scanner.nextLine();
        int result = ob.binarySearch(students, nameToSearch);
        if (result == -1)
            System.out.println("Student not found");
        else {
            int practicalMarks = Integer.parseInt(students[result][1]);
            int theoryMarks = Integer.parseInt(students[result][2]);
            double averageMarks = (practicalMarks + theoryMarks) / 2.0;
            
            System.out.println("Student found at index " + result);
            System.out.println("Practical marks: " + practicalMarks);
            System.out.println("Theory marks: " + theoryMarks);
            System.out.println("Average marks: " + averageMarks);
            
            if (averageMarks > 50)
                System.out.println("Result: PASS");
            else
                System.out.println("Result: FAIL");
        }
    }
}








import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input basic salary and overtime hours
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();
        System.out.print("Enter overtime hours: ");
        double overtimeHours = scanner.nextDouble();

        // Calculate overtime pay (assuming overtime rate is 1.5 times the hourly rate)
        double overtimePay = 0;
        if (overtimeHours > 0) {
            double hourlyRate = basicSalary / 40; // Assuming 40 hours per week
            overtimePay = overtimeHours * (hourlyRate * 1.5);
        }

        // Calculate total salary including overtime pay
        double totalSalary = basicSalary + overtimePay;

        // Output total salary
        System.out.println("Total Salary: " + totalSalary);
    }
}








// Calculate Salary with Different Overtime Rates:
import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input basic salary and overtime hours
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();
        System.out.print("Enter overtime hours: ");
        double overtimeHours = scanner.nextDouble();

        // Input overtime rate
        System.out.print("Enter overtime rate: ");
        double overtimeRate = scanner.nextDouble();

        // Calculate overtime pay
        double overtimePay = 0;
        if (overtimeHours > 0) {
            double hourlyRate = basicSalary / 40; // Assuming 40 hours per week
            overtimePay = overtimeHours * (hourlyRate * overtimeRate);
        }

        // Calculate total salary including overtime pay
        double totalSalary = basicSalary + overtimePay;

        // Output total salary
        System.out.println("Total Salary: " + totalSalary);
    }
}



 

 

// Calculate Salary for Multiple Employees:
import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();

        for (int i = 1; i <= numEmployees; i++) {
            System.out.println("Employee " + i + ":");
            System.out.print("Enter basic salary: ");
            double basicSalary = scanner.nextDouble();
            System.out.print("Enter overtime hours: ");
            double overtimeHours = scanner.nextDouble();

            // Calculate salary
            double salary = calculateSalary(basicSalary, overtimeHours);
            System.out.println("Total Salary: " + salary);
        }
    }

    public static double calculateSalary(double basicSalary, double overtimeHours) {
        double overtimeRate = 1.5;
        double overtimePay = 0;
        if (overtimeHours > 0) {
            double hourlyRate = basicSalary / 40; // Assuming 40 hours per week
            overtimePay = overtimeHours * (hourlyRate * overtimeRate);
        }
        return basicSalary + overtimePay;
    }
}








// Calculate Salary with Deductions:
import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input basic salary and overtime hours
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();
        System.out.print("Enter overtime hours: ");
        double overtimeHours = scanner.nextDouble();

        // Calculate overtime pay
        double overtimeRate = 1.5;
        double overtimePay = 0;
        if (overtimeHours > 0) {
            double hourlyRate = basicSalary / 40; // Assuming 40 hours per week
            overtimePay = overtimeHours * (hourlyRate * overtimeRate);
        }

        // Calculate total salary including overtime pay
        double totalSalary = basicSalary + overtimePay;

        // Input deductions
        System.out.print("Enter deductions: ");
        double deductions = scanner.nextDouble();

        // Calculate net salary after deductions
        double netSalary = totalSalary - deductions;

        // Output net salary
        System.out.println("Net Salary: " + netSalary);
    }
}












// Student Grade Calculation:
import java.util.Scanner;

public class StudentGradeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks
        System.out.print("Enter practical marks: ");
        int practicalMarks = scanner.nextInt();
        System.out.print("Enter theory marks: ");
        int theoryMarks = scanner.nextInt();
        
        // Calculate average
        double averageMarks = (practicalMarks + theoryMarks) / 2.0;
        
        // Calculate grade
        char grade;
        if (averageMarks >= 90) {
            grade = 'A';
        } else if (averageMarks >= 80) {
            grade = 'B';
        } else if (averageMarks >= 70) {
            grade = 'C';
        } else if (averageMarks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Output grade
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
    }
}









// Search by Subject Marks:
import java.util.Scanner;

public class SearchBySubjectMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student marks
        System.out.print("Enter practical marks: ");
        int practicalMarks = scanner.nextInt();
        System.out.print("Enter theory marks: ");
        int theoryMarks = scanner.nextInt();
        
        // Input search marks
        System.out.print("Enter marks to search for: ");
        int searchMarks = scanner.nextInt();
        
        // Check if student has marks equal to the search marks
        if (practicalMarks == searchMarks || theoryMarks == searchMarks) {
            System.out.println("Student found!");
        } else {
            System.out.println("Student not found!");
        }
    }
}










// Top N Students:
import java.util.Arrays;
import java.util.Scanner;

public class TopNStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Input student names and marks
        String[] names = new String[numStudents];
        double[] averages = new double[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            
            System.out.print("Enter average marks for " + names[i] + ": ");
            averages[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
        }
        
        // Sort students by average marks
        for (int i = 0; i < numStudents - 1; i++) {
            for (int j = 0; j < numStudents - i - 1; j++) {
                if (averages[j] < averages[j + 1]) {
                    // Swap names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                    
                    // Swap averages
                    double tempAverage = averages[j];
                    averages[j] = averages[j + 1];
                    averages[j + 1] = tempAverage;
                }
            }
        }
        
        // Output top N students
        System.out.print("Enter the number of top students to display: ");
        int topN = scanner.nextInt();
        
        System.out.println("Top " + topN + " Students:");
        for (int i = 0; i < topN && i < numStudents; i++) {
            System.out.println((i + 1) + ". " + names[i] + ": " + averages[i]);
        }
    }
}






// StudentGradeCalculation
import java.util.Scanner;
public class StudentGradeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the grading scale
        char[] grades = {'A', 'B', 'C', 'D', 'F'};
        int[] scoreLimits = {90, 80, 70, 60, 0};

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input student names and marks
        String[] names = new String[numStudents];
        double[] averages = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.print("Enter practical marks for " + names[i] + ": ");
            int practicalMarks = scanner.nextInt();
            System.out.print("Enter theory marks for " + names[i] + ": ");
            int theoryMarks = scanner.nextInt();
            averages[i] = (practicalMarks + theoryMarks) / 2.0;

            scanner.nextLine(); // Consume newline
        }

        // Calculate and print grades for each student
        System.out.println("\nGrades:");
        for (int i = 0; i < numStudents; i++) {
            char grade = calculateGrade(averages[i], grades, scoreLimits);
            System.out.println(names[i] + ": " + grade);
        }
    }

    public static char calculateGrade(double average, char[] grades, int[] scoreLimits) {
        for (int i = 0; i < grades.length; i++) {
            if (average >= scoreLimits[i]) {
                return grades[i];
            }
        }
        return 'F'; // Default grade if none of the score limits are met
    }
}
