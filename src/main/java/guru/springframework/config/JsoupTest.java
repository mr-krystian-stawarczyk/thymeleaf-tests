package guru.springframework.config;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * A simple example, used on the jsoup website.
 */
public class JsoupTest {

  public static void main(String[] args) throws IOException {
    Document doc = Jsoup
      .connect("https://www.imdb.com/chart/top")
      .timeout(6000)
      .get();
    Elements body = doc.select("tbody.lister-list");
    // System.out.println(body.select("tr").size());//

    for (Element e : body.select("tr")) {
      String img = e.select("td.posterColumn img").attr("src");
      // System.out.println(img);//

      String title = e.select("td.posterColumn img").attr("alt");
      // System.out.println(title);//

      //Catching only raw year   regex 101.com  //
      String year = e.select("td.titleColumn span.secondaryInfo").text();
      // System.out.println(year.replaceAll("[^\\d]", ""));//
    }
  }
}
