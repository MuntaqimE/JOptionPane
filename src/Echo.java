import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 * Created by Muntaqim Elahi on 09/13/17
 * License
 * @author Muntaqim Elahi
 */
public class Echo {
    /**
     * display data types
     */
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a boolean value");
        boolean booleanVar = keyboard.nextBoolean();
        System.out.println("Enter a character");
        char charVar = keyboard.next().charAt(0);
        System.out.println("Enter a short ");
        short sVar = keyboard.nextShort();
        System.out.println("Enter a decimal value");
        byte bVar = keyboard.nextByte();
        System.out.println("Enter an integer value");
        int iVar = keyboard.nextInt();
        System.out.println("Enter long");
        long lVar = keyboard.nextLong();
        System.out.println("Enter double");
        double dVAr = keyboard.nextDouble();
        System.out.println("Enter float");
        float fVar = keyboard.nextFloat();
        JOptionPane.showMessageDialog(null, "Your boolean value is " + booleanVar + "\n" + "Your character value is " + charVar + "\n" + "Your short value is " + sVar + "\n" + "Your byte value is " + bVar + "\n" + "Your integer value is " + iVar + "\n" + "Your long value is " + lVar + "\n" + "Your double value is " + dVAr + "\n" + "Your float value is " + fVar + "\n");
//to print out all the values in separate lines



    }
}

