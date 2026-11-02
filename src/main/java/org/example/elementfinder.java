import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class elementfinder {
    public static void main(String[] args) {
        // 1. Start Firefox browser
        WebDriver driver = new FirefoxDriver();

        // 2. Open your local HTML page or login page
        driver.get("file:///C:/selenium-project/object.html");

        // 3. Find an input box by name/id and type text into it
        WebElement inputField = driver.findElement(By.tagName("input"));
        inputField.sendKeys("STQA Exam Practice");

        // 4. Find a button and click it
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        // 5. Print success message to console
        System.out.println("ELEMENT FINDER TEST PASSED SUCCESSFULLY");

        // 6. Close the browser
        driver.quit();
    }
}