
package lab1.solution;

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
    
}
