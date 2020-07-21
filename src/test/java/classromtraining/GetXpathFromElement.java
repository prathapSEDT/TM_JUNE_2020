package classromtraining;

public class GetXpathFromElement {
    public static void main(String[] args) {
        String xpath="[[ChromeDriver: chrome on WINDOWS (4f89d8d3bbc29e4d58f886f6cbe3ba05)] -> xpath: //th[text()='Company']/ancestor::table]";

        System.out.println(xpath.substring(xpath.lastIndexOf(" ")+1,xpath.length()-1));



    }
}
