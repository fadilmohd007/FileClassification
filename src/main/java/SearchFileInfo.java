import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class SearchFileInfo {

    public ArrayList<FileInfoResult> searchfileinfo(String extension) {
        ArrayList<FileInfoResult> result = new ArrayList<>();
        String link = "https://fileinfo.com/extension/" + extension;
        Elements clases = new BasicWebCrawler().getPagetableforFileinfo(link);
        if(clases==null){
           // System.out.println("No extension found in FileInfo");
            return null;
        }
        for(Element clas :clases){
            Elements heads = clas.select("h2");
            Element type= heads.get(0);

            FileInfoResult res =new FileInfoResult();
            res.setType(type.text().substring(11));

            Elements headerinfo = clas.select(".headerInfo");
            Elements rows = headerinfo.select("tr");
            int i;
            for ( i = 0; i < rows.size(); i++) {
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if (cols.get(0).text().equals("Category")) {
                    res.setCategory(cols.get(1).text());

                }
                if (cols.get(0).text().equals("Format")) {
                    res.setFormat(cols.get(1).text());

                }
            }

            Elements infoclas = clas.select(".infoBox");
            Element applic = infoclas.last();
            Elements rows2 =applic.select(".programs");
            for ( i = 0; i < rows2.size(); i++) {
                Element row2 = rows2.get(i);
                Elements cols2 = row2.select("td");
               FileInfoResult.platformwithapp platformwith = res.new platformwithapp();
                //FileInfoResult res =new FileInfoResult();
                platformwith.setOs(cols2.get(0).text());
                Elements app = cols2.get(1).select("tr");

                for(int j=0;j<app.size();j++){
                    Element sapp = app.get(j);
                   platformwith.addapp(sapp.text());
                }

                res.addApplications(platformwith);

            }

            result.add(res);


        }

        return result;
    }
}
