public class GetExtension {
    private String filename;
    private String Extension;


    public String detectExtension(String filename) {
        if(filename==null)
            return null;
        int pos = filename.lastIndexOf('.');
        if (pos < 0)
            return "";
        return filename.substring(pos + 1).toUpperCase();
    }
}
