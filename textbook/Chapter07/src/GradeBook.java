/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class GradeBook {
    private String courseName;
    private int[][] grades;
    
    public GradeBook(String _courseName, int[][] _grades){
        this.courseName = _courseName;
        this.grades = _grades;
    }
    
    public void setCourseName(String _courseName){
        this.courseName = _courseName;
    }
    
    public String getCourseName(){
        return this.courseName;
    }
    
    public void processGrades(){
        outputGrades();
        
        System.out.printf("%n%s %d%n%s %d%n%n", "Lowest grade in the grade book is",
                getMinimum(), "Hightest grade in the grade book is", getMaximum());
        
        outputBarChart();
    }
    
    public int getMinimum(){
        int lowGrade = this.grades[0][0];
        
        for(int[] studentGrades : this.grades){
            for(int grade : studentGrades){
                if(grade < lowGrade){
                    lowGrade = grade;
                }
            }
        }
        
        return lowGrade;
    }
    
    public int getMaximum(){
        int highGrade = this.grades[0][0];
        
        for(int[] studentGrade : this.grades){
            for(int grade : studentGrade){
                if(grade > highGrade){
                    highGrade = grade;
                }
            }
        }
        
        return highGrade;
    }
    
    public double getAverage(int[] setOfGrades){
        int total = 0;
        
        for(int grade : setOfGrades){
            total += grade;
        }
        
        return (double) total / setOfGrades.length;
    }
    
    public void outputBarChart(){
        System.out.println("Overall grade distribution:");
        
        int[] frequency = new int[11];
        
        for(int[] studentGrade : this.grades){
            for(int grade : studentGrade){
                ++frequency[grade / 10];
            }
        }
        
        for(int count = 0; count < frequency.length; count++){
            if(count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            
            for(int stars = 0; stars < frequency[count]; stars++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
    public void outputGrades(){
        System.out.printf("The grades are:%n%n");
        System.out.print("            ");
        
        for(int test = 0;test < grades[0].length; test++){
            System.out.printf("Test %d  ", test);
        }
        
        System.out.println("Average");
        
        for(int student = 0; student < this.grades.length; student++){
            System.out.printf("Student %2d", student + 1);
            
            for(int test : this.grades[student]){
                System.out.printf("%8d", test);
            }
            
            double average = this.getAverage(this.grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }
}
