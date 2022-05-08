import java.io.*;

public class sign_up {
    public static void main(String[] args) {
        try {
            File file = new File("infoHolder.txt");
            if (!file.exists()) {
                file.createNewFile();

            }

            PrintWriter files = new PrintWriter(file);
            files.println("this is something in file");
            files.close();
            System.out.println("Done");
            System.out.println("Done step two")
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

}
