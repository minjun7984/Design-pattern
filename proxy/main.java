import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;

public class Main {

    public static void main(String[] args) {
      
        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();


        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show(); //BrowserProxy loading html from 출력
        browser.show(); //cache 이용 BrowserProxy use cache html출력
        browser.show(); //cache 이용
    }
}
