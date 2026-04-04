package Lab7;

import java.util.Scanner;
import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class L7Q2 {
    public static void main(String[] args) {
    try{
        URL url= new URL("https://fsktm.um.edu.my/");
        URLConnection cnn= url.openConnection();
        InputStream stream = cnn.getInputStream();
        Scanner in = new Scanner(stream);

        // Prepare output file
        PrintWriter out = new PrintWriter(new FileOutputStream("C:\\Users\\Tan Chee Keat\\OneDrive\\Documents\\W1002 FOP\\cheecode\\WIX1002\\Lab\\Lab7\\Lab7 File\\index.htm"));

        while (in.hasNextLine()) {
            String line = in.nextLine();
            // Write line to file
            out.println(line);
        }
        
        in.close();
        out.close();
        System.out.println("Web page saved to index.htm");
    }
    catch(IOException e) {
        System.out.println("IO Error:" + e.getMessage());
    }
        
    }
}
