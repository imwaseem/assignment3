package assignment3;
import java.util.Scanner;
public class Assignment {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // TODO code application logic here
        String source;
        String destinationFile;
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the Source of Input Stream ");
        source = getUserInput.next();
        System.out.println();
        System.out.print("Enter the name of Output file :");
        destinationFile = getUserInput.next();
        if(source.startsWith("http"))
           StreamUtil.getInstance().URLToFile(source, destinationFile);
        else
        StreamUtil.getInstance().CopyFileToFile(source, destinationFile);
       
    }


}
