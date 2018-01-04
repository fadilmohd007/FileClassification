

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //1. Pick a URL from the frontier
        Scanner in = new Scanner(System.in);
        String location = in.nextLine();
        Scanner inFile = new Scanner(new FileReader(location));
        if(!inFile.hasNextLine()){
            System.out.println("No files found ");
            return;
        }

        while (inFile.hasNextLine()) {

            String filename = inFile.nextLine();
            String extension = new GetExtension().detectExtension(filename);
            if (extension == "") {
                System.out.println("Extension not found for " + filename);
            }
            if (extension == null) {
                System.out.println("Filename  not found ");
            }


         //wiki
            Thread wikifetch = new Thread(new RunWiki(filename,extension));
            wikifetch.start();

            Thread fileInfofetch = new Thread(new RunFileInfo(filename,extension));
            fileInfofetch.start();

            Thread fileConverterfetch = new Thread(new RunFileConverter(filename,extension));
            fileConverterfetch.start();


        }
    }
}
