import org.jsoup.select.Elements;


import org.jsoup.nodes.Element;
import java.util.ArrayList;

public class SearchConverter {

    private static ArrayList<String > head = new ArrayList<String>();
    public ArrayList<ConverterResult> searchconverter(String extension){
        extension=extension.toLowerCase();
        ArrayList<ConverterResult> result = new ArrayList<>();
        Elements mainbar = new BasicWebCrawler().getformatlists("https://www.online-convert.com/file-type");
        if(mainbar==null){
            return null;
        }
        Elements formatlistclas = mainbar.select(".list_file_formats");
        Elements heading = mainbar.select("h2");
        int i,j;
        for(i=0;i<heading.size();i++){
            head.add(heading.get(i).text());
        }

        for(i=0;i<formatlistclas.size();i++){
            ConverterResult res= null;

            Elements rows = formatlistclas.get(i).select("tr");
            for(j=1;j<rows.size();j++){
                Elements cols = rows.get(j).select("td");
                Element col = cols.get(0);
                if(col.select("a").text().equals(extension)){
                    res = new ConverterResult();
                    res.setClassification(head.get(i));
                    res.setFormatName(cols.get(1).text());

                }

            }
            if(res!=null) {
                result.add(res);
            }
        }



        if(result.size()==0){
            return null;
        }
        return result;

    }
}
