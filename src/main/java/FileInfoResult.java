import java.util.ArrayList;

public class FileInfoResult {
    public String category;
    public String format;
    public String Type;
    public ArrayList<platformwithapp> applications = new ArrayList<>();

    public class platformwithapp{
       public String os;
        public ArrayList<String> apps= new ArrayList<>();

        public String getOs() {
            return os;
        }

        public void setOs(String os) {
            this.os = os;
        }

        public void addapp(String app){
            apps.add(app);
        }

        public ArrayList<String> getApp() {
            return apps;
        }
    }

    public ArrayList<platformwithapp> getApplications() {
        return applications;
    }

    public void addApplications(platformwithapp oslist) {
        this.applications.add(oslist);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
