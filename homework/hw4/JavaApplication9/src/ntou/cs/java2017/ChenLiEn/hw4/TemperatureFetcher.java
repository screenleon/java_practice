/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.ChenLiEn.hw4;

import java.util.ArrayList;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author user
 */
public class TemperatureFetcher {
    private static final String TARGET_URL = "http://www.cwb.gov.tw/V7/forecast/week/week.htm";
    private static final String PREFIX = "../../";
    private static final String NEW_PREFIX = "http://www.cwb.gov.tw/V7/";
    
    public static TemperatureBundle getTemperature (String location) throws IOException, IndexOutOfBoundsException{
            //Read the body of the response into a local buffer, so that parse()
            //may be called repeatedly on the same connection response (otherwise, 
            //once the response is read, its InputStream will have been drained and may not be re-read)
            Connection.Response res = Jsoup.connect(TARGET_URL).userAgent(
            "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:26.0) Gecko/20100101 Firefox/26.0").method(Method.GET).execute();
            Document doc = res.parse();

            //The Element interface represents an element in an HTML or XML document
            Element weekDays = doc.select("tr:contains(星期日)").get(0);
            String weekDates[] = getWeekDates(weekDays);

            Element dayWeathers = doc.select("tr:contains(" + location + ")").get(0);
            Element nightWeathers = dayWeathers.nextElementSibling();

            String dayInfo[][] = getTempratureInfo(dayWeathers);
            String nightInfo[][] = getTempratureInfo(nightWeathers);

            TemperatureBundle tempBundle = new TemperatureBundle(location,weekDates, dayInfo[0], nightInfo[0], dayInfo[1], nightInfo[1]);
            return tempBundle;
    }
    
    private static String[] getWeekDates (Element dateFragment){
        ArrayList<String> datesList = new ArrayList<String>();
        Elements dates = dateFragment.getElementsByTag("th");

        for (Element cell : dates){
                if (cell.text().contains("星期")){
                        String text = cell.text();
                        int splitIndex = text.indexOf(" ");
                        String dateStr = text.substring(0, splitIndex);
                        datesList.add(dateStr);
                }
        }
        String[] datesAry = new String[datesList.size()];
        datesAry = datesList.toArray(datesAry);
        return datesAry;
    }
    
    // 取得白天或晚上的當週所有高低氣溫與氣候圖示網址
    private static String[][] getTempratureInfo (Element tempFragment) throws IOException, IndexOutOfBoundsException{
        ArrayList<String> tempsList = new ArrayList<String>();
        ArrayList<String> imagesList = new ArrayList<String>();
        Elements temps = tempFragment.getElementsByTag("td");
        for (Element cell : temps){
                String seperator = " ~ ";
                if (cell.text().contains(seperator)){
                    String url = cell.getElementsByTag("img").attr("src");
                    url = NEW_PREFIX + url.substring(PREFIX.length());
                    String temp = cell.text();
                    tempsList.add(temp);
                    imagesList.add(url);
                }
        }
        String[] tempsAry = new String[tempsList.size()];
        String[] imagesAry = new String[imagesList.size()];
        tempsAry = tempsList.toArray(tempsAry);
        imagesAry = imagesList.toArray(imagesAry);
        String combined[][] = new String[2][];
        combined[0] = tempsAry;
        combined[1] = imagesAry;
        return combined;
    }
    public TemperatureBundle run(String location){
        try{
            TemperatureBundle tempBundle = getTemperature(location);
            return tempBundle;
        } catch (IOException ie){
            System.err.println(ie);
            System.out.println("error IOE");
            return null;
        } catch (IndexOutOfBoundsException iobe){
            System.err.println(iobe);
            System.out.println("Bound error");
            return null;
        }
    }
}
