import java.util.Scanner;

public class Main {
    public static double calculateAverageGrade(int[] grades) {
    	int soma = 0;
        for(int i = 0; i < grades.length; i++) {
        	soma += grades[i];
        	
        }
       double media = (double) soma / grades.length;
        
        return media;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] stringArr = text.split(",");
        int[] studentGrades = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
           studentGrades[i] = Integer.parseInt(stringArr[i]);
        }
        double averageGrade = calculateAverageGrade(studentGrades);
        System.out.printf("Average grade: %.2f", averageGrade);
        
        scanner.close();
    }
}
