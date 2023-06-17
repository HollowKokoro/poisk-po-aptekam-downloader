import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.firefox.FirefoxDriver

object Chrome {

    private var driver: FirefoxDriver? = null

    fun setUp(): FirefoxDriver {
        if (driver == null) {
            WebDriverManager.firefoxdriver().setup()
            driver = FirefoxDriver()
            return driver as FirefoxDriver
        }
        return driver as FirefoxDriver
    }
}
