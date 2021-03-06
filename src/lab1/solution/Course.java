/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

import javax.swing.JOptionPane;

/**
 *
 * @author Kallie
 */
public abstract class Course {
    public String courseName;
    public String courseNumber;
    public double credits;
    
    public String getCourseName(){
        return courseName;
    }
    
    public String getCourseNumber(){
        return courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

   public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    
}
