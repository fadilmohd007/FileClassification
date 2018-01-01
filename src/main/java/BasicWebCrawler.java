

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;

public class BasicWebCrawler {

    private HashSet<String> links;

    public BasicWebCrawler() {
        links = new HashSet<String>();
    }


    public Elements getPageTables(String URL) {
        //4. Check if you have already crawled the URLs
        //(we are intentionally not checking for duplicate content in this example)
        if (!links.contains(URL)) {
            try {
                //4. (i) If not add it to the index
//                if (links.add(URL)) {
//                    System.out.println("connecting...");
//                }

                //2. Fetch the HTML code
                Document document = Jsoup.connect(URL).get();
                //3. Parse the HTML to extract links to other URLs
                Elements tables  = (document.select("table"));
                return tables;

            } catch (IOException e) {
                //System.err.println("For '" + URL + "': " + e.getMessage());
                return null;
            }
        }
        return null;
    }


    public Elements getPagetableforFileinfo(String URL){
        if (!links.contains(URL)) {
            try {

//                if (links.add(URL)) {
//                    System.out.println("connecting...");
//                }


                Document document = Jsoup.connect(URL).get();
                Elements clas  = (document.select(".ext"));

                return clas;

            } catch (IOException e) {
                //System.err.println("For '" + URL + "': " + e.getMessage());
                return null;
            }
        }
        return null;
    }


    public Elements getformatlists(String URL) {
            if (!links.contains(URL)) {
                try {
                    Document document = Jsoup.connect(URL).get();
                    Elements clas = (document.select(".mainbar"));
                    return clas;

                } catch (IOException e) {
                    //System.err.println("For '" + URL + "': " + e.getMessage());
                    return null;
                }
            }


        return null;

    }




}