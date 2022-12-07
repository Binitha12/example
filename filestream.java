import java.io.*;

public class filestream {
    public static void main(String[] args) {
        int ch;
        String str = "";
        
        try {
         FileInputStream   f = new FileInputStream("newfile.txt");
            while ((ch = f.read()) != -1) {
                str += (char) ch;
            }
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(e);
        }

        
        try {
         FileOutputStream   fw = new FileOutputStream("output.txt");
            byte b[] = str.getBytes();
            fw.write(b);
            fw.close();
            System.out.println("Wrote");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
