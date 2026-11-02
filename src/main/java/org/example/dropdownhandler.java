import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownhandler {
    public static void main(String[] args) {
        // 1. Start Firefox browser
        WebDriver driver = new FirefoxDriver();

        // 2. Open your local HTML page
        driver.get("file:///C:/selenium-project/object.html");

        // 3. Locate dropdown element and use Select class
        WebElement dropdownElement = driver.findElement(By.tagName("select"));
        Select dropdown = new Select(dropdownElement);

        // 4. Select an option by visible text
        dropdown.selectByVisibleText("Option 1");

        // 5. Print success message to console
        System.out.println("DROPDOWN TEST PASSED SUCCESSFULLY");

        // 6. Close the browser
        driver.quit();
    }
}
