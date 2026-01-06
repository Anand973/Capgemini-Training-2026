import java.util.Scanner;

class StudentGrades {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        int number = input.nextInt();

        double[] percentage = new double[number];
        char[] grade = new char[number];

        double[][] marks = new double[number][3];

        for (int i = 0; i < number; i++) {

          
            marks[i][0] = input.nextDouble();

           
            marks[i][1] = input.nextDouble();

           
            marks[i][2] = input.nextDouble();

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 50) grade[i] = 'C';
            else grade[i] = 'D';
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Percentage: " + percentage[i] + " Grade: " + grade[i]);
        }

       
    }
}
