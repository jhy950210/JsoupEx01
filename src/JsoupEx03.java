import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document doc = null;
		
		try {
			// get(url) / post(header)
			doc = Jsoup.connect("https://www.daum.net").post();
		
			System.out.println(doc.title());
			
			Elements addresses = doc.getElementsByTag("strong");
			
			for( Element address : addresses) {
//				System.out.println(address.toString());
				Elements newses = address.getElementsByClass("tit_item");
				for( Element news : newses) {
//					System.out.println(news.toString());
					System.out.println(news.text());
				}
				
//				Elements anchors = address.getElementsByTag("class");
//				System.out.println(anchors.toString());
				
//				for( Element anchor : anchors ) {
//					System.out.println(anchor.attr("href"));
//					System.out.println(anchor.text());
//				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
