import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

class Parser() {
    fun run(url: String): String {
        val chrome = Chrome.setUp()
        chrome.get(url)
        val wait = WebDriverWait(chrome, Duration.ofSeconds(10))
        if (url.contains("april")) {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".body-card")))
        } else {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".product")))
        }
        return chrome.pageSource
    }
}
