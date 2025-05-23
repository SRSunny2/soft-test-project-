
import com.mycompany.junittesting.URLChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class URLCheckerTest {

    @Test
    void testFacebookReachable() {
        String url = "https://www.facebook.com/";
        assertTrue(URLChecker.isURLReachable(url), "Facebook should be reachable");
    }

    @Test
    void testFacebookLoginPageReachable() {
        String url = "https://www.facebook.com/login/";
        assertTrue(URLChecker.isURLReachable(url), "Facebook login page should be reachable");
    }

    @Test
    void testVBSCALoginReachable() {
        String url = "http://vbsca.ca/login/login.asp";
        assertTrue(URLChecker.isURLReachable(url), "VBSCA login page should be reachable");
    }

    @Test
    void testAutomationDemoReachable() {
        String url = "https://demo.automationtesting.in/Register.html";
        assertTrue(URLChecker.isURLReachable(url), "Automation testing demo should be reachable");
    }

    @Test
    void testPracticeTestAutomationReachable() {
        String url = "https://practicetestautomation.com/practice-test-login/";
        assertTrue(URLChecker.isURLReachable(url), "Practice test automation login page should be reachable");
    }
}
