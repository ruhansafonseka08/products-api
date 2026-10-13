import uk.ac.westminster.products_api.Product;

public class DigitalProduct extends Product{
    private String downloadUrl;
    private double fileSizeMB;
    // id, name and price are GONE from this file
// They now live only in Product.java file

    //    public void test(){
//        getId();
//        getName();
//        getPrice();
//        System.out.println(id);
//        System.out.println(name);
//        System.out.println(price);
//    }
    public DigitalProduct(){

    }

    public String getDownloadUrl() {
        return downloadUrl;
    }
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
    public double getFileSizeMB() {
        return fileSizeMB;
    }
    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }
}
