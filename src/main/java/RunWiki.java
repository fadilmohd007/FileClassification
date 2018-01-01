

import java.util.ArrayList;

public class RunWiki implements Runnable{
    public String filename;
    public java.lang.String extension;

    public RunWiki(String  filename, java.lang.String extension) {
        this.filename = filename;
        this.extension = extension;
    }

    @Override
    public void run() {
        //wiki

        if (!(extension == "" || extension == null)) {


            ArrayList<WikiResult> wikiresult = new SearchWiki().wikiresult(extension);

            if (wikiresult.isEmpty()) {
                System.out.println("No extension found in wiki");
            } else {
                int count = 1;
                for (WikiResult wiki : wikiresult) {
                    System.out.println("Wiki Result" + count + " for " + filename);
                    System.out.println("Description:" + wiki.getDescription());
                    System.out.println("UsedBy:" + wiki.getUsedBy());
                    System.out.println();
                    count++;

                }
            }
            System.out.println();
            System.out.println();


        }
    }
}
