import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class SearchWiki {
    public ArrayList<WikiResult> wikiresult(String extension) {

        ArrayList<WikiResult> result = new ArrayList<>();

        if (extension.charAt(0) == 'A') {
            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(A-E)");
            Element table = tables.get(1);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");


                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'B') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(A-E)");
            Element table = tables.get(2);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");


                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'C') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(A-E)");
            Element table = tables.get(3);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");


                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'D') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(A-E)");
            Element table = tables.get(4);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'E') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(A-E)");
            Element table = tables.get(5);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");


                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'F') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(F-L)");
            Element table = tables.get(1);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");


                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }

            }
        } else if (extension.charAt(0) == 'G') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(F-L)");
            Element table = tables.get(2);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'H') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(F-L)");
            Element table = tables.get(3);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");


                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }

            }
        } else if (extension.charAt(0) == 'I') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(F-L)");
            Element table = tables.get(4);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");


                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'J') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(F-L)");
            Element table = tables.get(5);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'K') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(F-L)");
            Element table = tables.get(6);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }

            }
        } else if (extension.charAt(0) == 'L') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(F-L)");
            Element table = tables.get(7);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'M') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(M-R)");
            Element table = tables.get(1);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'N') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(M-R)");
            Element table = tables.get(2);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'O') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(M-R)");
            Element table = tables.get(3);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }

                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }

                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'P') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(M-R)");
            Element table = tables.get(4);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'Q') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(M-R)");
            Element table = tables.get(5);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'R') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(M-R)");
            Element table = tables.get(6);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'S') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(S-Z)");
            Element table = tables.get(1);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'T') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(S-Z)");
            Element table = tables.get(2);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }

            }
        } else if (extension.charAt(0) == 'U') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(S-Z)");
            Element table = tables.get(3);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'V') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(S-Z)");
            Element table = tables.get(4);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'W') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(S-Z)");
            Element table = tables.get(5);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }

            }
        } else if (extension.charAt(0) == 'X') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(S-Z)");
            Element table = tables.get(6);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'Y') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(S-Z)");
            Element table = tables.get(7);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else if (extension.charAt(0) == 'Z') {

            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions_(S-Z)");
            Element table = tables.get(8);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }


            }
        } else {
            Elements tables = new BasicWebCrawler().getPageTables("https://en.wikipedia.org/wiki/List_of_filename_extensions#0%E2%80%939");
            Element table = tables.get(2);
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if ((cols.get(0).text().equals(extension))) {
                    WikiResult res = new WikiResult();
                    if (cols.get(1).text().isEmpty()) {
                        res.setDescription("N/A");
                    } else {
                        res.setDescription(cols.get(1).text());
                    }
                    if (cols.size() >= 3) {
                        if (cols.get(2).text().isEmpty()) {
                            res.setUsedBy("N/A");
                        } else {
                            res.setUsedBy(cols.get(2).text());
                        }
                    } else {
                        res.setUsedBy("N/A");

                    }
                    result.add(res);

                }
            }


        }
        return result;
    }
}

