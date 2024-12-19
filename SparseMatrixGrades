/*
Imagine you are developing a system to manage student grades in a school. The grades are
stored in a matrix where rows represent students, and columns represent subjects. However,
most students do not take all subjects, resulting in a sparse matrix where most elements are zero.
Given the sparse matrix representing student grades below, implement a solution using arrays to
efficiently manage and manipulate the grades data:(it is a 4x4 matrix with (2,1) being 85 and (3,4) being 92 rest all values of the matrix are null

Perform operations such as calculating the average grade for each subject, identifying students
with the highest grades, and finding the subject with the highest average grade.
 

dont take the input as compact matrix take the normal 4x4 matrix with (1,0)
 as 85 and (2,3) as 92 then convert that to compact matrix and then perform
operations on that compact matrix
*/
public class SparseMatrixGrades {
    public static void main(String[] args) {
        // Step 1: Initialize the normal 4x4 matrix
        int[][] grades = {
            {0, 0, 0, 0},
            {85, 0, 0, 0},
            {0, 0, 0, 92},
            {0, 0, 0, 0}
        };

        // Step 2: Convert the normal matrix to a compact matrix
        int[][] compactMatrix = convertToCompactMatrix(grades);
        System.out.println("Compact Matrix:");
        printMatrix(compactMatrix);

        // Step 3: Calculate the average grade for each subject
        double[] subjectAverages = calculateSubjectAverages(compactMatrix, grades[0].length);
        System.out.println("Average grade for each subject:");
        for (int i = 0; i < subjectAverages.length; i++) {
            System.out.println("Subject " + i + ": " + subjectAverages[i]);
        }

        // Step 4: Identify the students with the highest grades
        int[] highestGrades = findHighestGrades(compactMatrix);
        System.out.println("Students with highest grades:");
        for (int i = 0; i < highestGrades.length; i++) {
            if (highestGrades[i] != -1) {
                System.out.println("Subject " + i + ": Student " + highestGrades[i] + " with grade " + getGrade(compactMatrix, highestGrades[i], i));
            }
        }

        // Step 5: Find the subject with the highest average grade
        int subjectWithHighestAverage = findSubjectWithHighestAverage(subjectAverages);
        System.out.println("Subject with highest average grade: " + subjectWithHighestAverage);
    }

    // Method to convert the normal matrix to a compact matrix
    public static int[][] convertToCompactMatrix(int[][] matrix) {
        int nonZeroCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    nonZeroCount++;
                }
            }
        }

        int[][] compactMatrix = new int[nonZeroCount][3];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    compactMatrix[index][0] = i;
                    compactMatrix[index][1] = j;
                    compactMatrix[index][2] = matrix[i][j];
                    index++;
                }
            }
        }

        return compactMatrix;
    }

    // Method to calculate average grades for each subject
    public static double[] calculateSubjectAverages(int[][] compactMatrix, int numSubjects) {
        int[] subjectTotals = new int[numSubjects];
        int[] subjectCounts = new int[numSubjects];

        for (int[] entry : compactMatrix) {
            int subject = entry[1];
            int grade = entry[2];
            subjectTotals[subject] += grade;
            subjectCounts[subject]++;
        }

        double[] averages = new double[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            averages[i] = subjectCounts[i] > 0 ? (double) subjectTotals[i] / 4 : 0;
        }
        return averages;
    }

    // Method to identify students with the highest grades for each subject
    public static int[] findHighestGrades(int[][] compactMatrix) {
        int[] highestGrades = new int[4]; // Assuming 4 subjects
        int[] highestGradeValues = new int[4];

        for (int i = 0; i < 4; i++) {
            highestGradeValues[i] = -1;
            highestGrades[i] = -1;
        }

        for (int[] entry : compactMatrix) {
            int student = entry[0];
            int subject = entry[1];
            int grade = entry[2];

            if (grade > highestGradeValues[subject]) {
                highestGradeValues[subject] = grade;
                highestGrades[subject] = student;
            }
        }

        return highestGrades;
    }

    // Method to get the grade of a student in a subject
    public static int getGrade(int[][] compactMatrix, int student, int subject) {
        for (int[] entry : compactMatrix) {
            if (entry[0] == student && entry[1] == subject) {
                return entry[2];
            }
        }
        return 0;
    }

    // Method to find the subject with the highest average grade
    public static int findSubjectWithHighestAverage(double[] subjectAverages) {
        int maxIndex = 0;
        double maxAverage = 0;

        for (int i = 0; i < subjectAverages.length; i++) {
            if (subjectAverages[i] > maxAverage) {
                maxAverage = subjectAverages[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    // Utility method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
