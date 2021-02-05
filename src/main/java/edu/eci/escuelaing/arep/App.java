package edu.eci.escuelaing.arep;

import static spark.Spark.*;

import java.util.Scanner;

import spark.Request;
import spark.Response;
/**
 * Hello Spark!
 *
 * Minimal web app example for Heroku using SparkWeb
 *
 * @author daniel
 * modified by @author Yeisson Gualdron
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello LinkedList!" );
        port(getPort());
        get("/", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }
    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Mean and Standard Deviation Calculator</h2>"
                + "<form action=\"/results\">"
                + "  Enter the number of values:<br>"
                + "  <input type=\"string\" name=\"nNumbers\" value=\"1\">"
                + "  <br>"
                + "  Enter the values separed by ',':<br>"
                + "  <input type=\"string\" name=\"list\" value=\"2\">"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/results\".</p>"
                + "</body>"
                + "</html>";
        
        return pageContent;
    }
    private static String resultsPage(Request req, Response res) {
    	LinkedList lista = new LinkedList();
    	int n = Integer.parseInt(req.queryParams("nNumbers"));
    	Scanner sc = new Scanner(req.queryParams("list")).useDelimiter("\\s*,\\s*");
    	for(int i=0;i<n;i++) {
    		lista.addFirst(sc.nextDouble());    		 
    	}
    	Calculator cal = new Calculator(lista);
    	String pageContentOut = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Mean and Standard Deviation Calculator</h2>"
                + "<h3>Mean: </h3><p>"
                + String.valueOf(cal.mean())
                + "</p>"
                + "<h3>Standard Deviation: </h3><p>"
                + String.valueOf(cal.standardDeviation())
                + "</p>"
                + "</body>"
                + "</html>";
    			
    	return pageContentOut;
    }
    
    public static  int getPort(){
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        
        return 4567;
    }

}
