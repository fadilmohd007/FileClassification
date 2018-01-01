import java.util.ArrayList;

public class RunFileInfo implements Runnable {
    public String filename;
    public String extension;

    public RunFileInfo(String filename, String extension) {
        this.filename = filename;
        this.extension = extension;
    }


    @Override
    public void run() {
        //            //file Info
        if (!(extension == "" || extension == null)) {
            System.out.println();
            ArrayList<FileInfoResult> Inforesult = new SearchFileInfo().searchfileinfo(extension);

            if (Inforesult == null) {
                System.out.println("No extension found in fileInfo");
            } else {
                int count = 1;
                for (FileInfoResult info : Inforesult) {
                    System.out.println("FileInfo Result" + count + " for " + filename);
                    System.out.println("Type:" + info.getType());
                    System.out.println("Category: " + info.getCategory());
                    System.out.println("Format: " + info.getFormat());
                    ArrayList<FileInfoResult.platformwithapp> list = info.getApplications();

                    for (FileInfoResult.platformwithapp item : list) {
                        System.out.print(item.getOs() + " : ");
                        int k = 0;
                        for (String app : item.getApp()) {
                            if (k++ != item.getApp().size() - 1) {
                                System.out.print(app + " , ");
                            } else {
                                System.out.print(app);
                            }

                        }
                        System.out.println();
                    }
                    count++;
                    System.out.println();
                }

            }


        }
    }
}
