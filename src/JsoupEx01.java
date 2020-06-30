import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strHtml = "<html><head><title>First parse</title><body><p>Hello JSOUP</p></body></html>";
		
		//Document doc = Jsoup.parse( strHtml );
		Document doc = null;
		
		try {
			// euc-kr / utf-8
			doc = Jsoup.parse(new File("./test.html"), "euc-kr");
			
			System.out.println(doc.toString());
			String title = doc.title();
			System.out.println(title);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
