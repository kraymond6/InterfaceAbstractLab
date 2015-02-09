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
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course newIntroProgramming = new IntroToProgrammingCourse("Intro to Programming", "001");
        Course newIntroJava = new IntroJavaCourse("Intro to Java", "002");
        Course newAdvanced = new AdvancedJavaCourse("Advanced Java", "003");
        
        System.out.println(newIntroProgramming.getCourseNumber());
        newIntroJava.setCourseNumber("005");
        System.out.println(newIntroJava.getCourseNumber());
        newAdvanced.setCredits(3.0);
        System.out.println(newAdvanced.getCredits());
    }
    /*The disadvantage to using an interface in this situation is that you have to implement and
    provide method bodies to every method you use, which means there's a lot of repeated code between
    the different child classes. The advantage is that it makes it easier to implement each
    method however you'd like.
    
    I didn't think the Liskove 
    */
}
