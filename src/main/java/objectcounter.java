import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class objectcounter {
    public static void main(String[] args) {
        // 1. Start Firefox browser
        WebDriver driver = new FirefoxDriver();

        // 2. Open your local HTML page
        driver.get("file:///C:/selenium-project/object.html");

        // 3. Count different objects using tag names
        int links = driver.findElements(By.tagName("a")).size();
        int images = driver.findElements(By.tagName("img")).size();
        int buttons = driver.findElements(By.tagName("button")).size();
        int inputs = driver.findElements(By.tagName("input")).size();

        // 4. Calculate total objects
        int total = links + images + buttons + inputs;

        // 5. Print results to the console
        System.out.println("WEB PAGE OBJECT COUNT");
        System.out.println("Number of Links: " + links);
        System.out.println("Number of Images: " + images);
        System.out.println("Number of Buttons: " + buttons);
        System.out.println("Number of Inputs: " + inputs);
        System.out.println("Total Objects : " + total);

        // 6. Close the browser
        driver.quit();
    }
}