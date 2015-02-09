/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.solution;

/**
 *
 * @author Kallie
 */
public interface Course {
    abstract String getCourseNumber();
    abstract String getCourseName();
    abstract double getCredits();
    abstract void setCourseNumber(String courseNumber);
    abstract void setCourseName(String courseName);
    abstract void setCredits(double credits);
    
    }
