/*
 * Mark Hesser
 * HesserCAN
 * mark@hessercan.com
 * www.hessercan.com
 */
package demohorses;

/**
 *
 * @author mark
 */
public class DemoHorses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Horse horse1 = new Horse("Carrot", "Black", 2005);
        RaceHorse horse2 = new RaceHorse("Pumpkin", "White", 2004, 6);

        horse1.Display();
        System.out.println();
        horse2.Display();
    }

}
