import java.util.ArrayList;

public class RunFileConverter implements Runnable {
    public String filename;
    public String extension;


    public RunFileConverter(String filename, String extension) {
        this.filename = filename;
        this.extension = extension;
    }

    @Override
    public void run() {


        //            //file converter
        if (!(extension == "" || extension == null)) {
            ArrayList<ConverterResult> Converterlist = new SearchConverter().searchconverter(extension);
            if (Converterlist == null) {
                System.out.println("No category found in fileInfo");
            } else {
                int count = 1;
                for (ConverterResult info : Converterlist) {
                    System.out.println("FileConverter Result" + count + " for " + filename);
                    System.out.println("Classification: " + info.getClassification());
                    System.out.println("Format Name : " + info.getFormatName());
                    count++;
                }
            }
            System.out.println();

        }

    }
}
