import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document doc = null;
		
		try {
			// get(url) / post(header)
			doc = Jsoup.connect("https://www.naver.com").post();
			//System.out.println(doc.toString());
			System.out.println(doc.title());
			
			Elements addresses = doc.getElementsByTag("address");
//			System.out.println(addresses.toString());
			
//			Element div = doc.getElementById("adscript");
//			System.out.println(div.toString());
			
			for( Element address : addresses) {
				Elements anchors = address.getElementsByTag("a");
				System.out.println(anchors.toString());
				
				for( Element anchor : anchors ) {
					System.out.println(anchor.attr("href"));
					System.out.println(anchor.text());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
