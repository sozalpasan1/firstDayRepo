import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class MyFileWriter{
    public static void main(String[] args) {
        String passwordShush = "if you find this ur sigma";
        String confidata = "confidentialdata";
        try {
            Path hiddenFile = Paths.get(".dontfindme.txt");
            Files.createFile(hiddenFile);
            Files.write(hiddenFile, passwordShush.getBytes(StandardCharsets.UTF_8));
            

            Path hiddenDir = Paths.get(".hideme");
            Files.createDirectory(hiddenDir);

            Path confidatafile = hiddenDir.resolve("confidata.dat");
            Files.createFile(confidatafile);
            Files.write(confidatafile, confidata.getBytes(StandardCharsets.UTF_8));
            
        } catch (IOException e) {
            e.printStackTrace();
        }


        printFileSize(".dontfindme.txt");
    }


    private static void printFileSize(String fileName){
        File file = new File(fileName);
        System.out.println((double) file.length() / 1024 + "  kb");
    }
}