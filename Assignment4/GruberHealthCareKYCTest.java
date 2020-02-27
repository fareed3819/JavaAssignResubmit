package Assignment4;
import org.junit.jupiter.api.Test;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.*;
class GruberHealthCareKYCTest {
    Logger logger = Logger.getLogger(GruberHealthCareKYC.class.getName());
    GruberHealthCareKYC gruberHealthCareKYC = new GruberHealthCareKYC();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
    @Test
    void TestCase1() {
        try {
            assertEquals("16-06-2017 27-06-2017", gruberHealthCareKYC.rangeOfDatesForKYC(simpleDateFormat.parse("16-07-1998"), simpleDateFormat.parse("27-06-2017")));
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("date format should be corected");
        }
    }
    @Test
    void TestCase2() {
        try {
            assertEquals("05-01-2017 06-03-2017", gruberHealthCareKYC.rangeOfDatesForKYC(simpleDateFormat.parse("04-02-2016"), simpleDateFormat.parse("04-04-2017")));
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("date format should be corected");
        }
    }
    @Test
    void TestCase3() {
        try {
            assertEquals("No Range", gruberHealthCareKYC.rangeOfDatesForKYC(simpleDateFormat.parse("04-05-2017"), simpleDateFormat.parse("04-04-2017")));
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("date format should be corected");
        }
    }
    @Test
    void TestCase4() {
        try {
            assertEquals("05-03-2016 04-04-2016", gruberHealthCareKYC.rangeOfDatesForKYC(simpleDateFormat.parse("004-04-2015"), simpleDateFormat.parse("04-04-2016")));
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("date format should be corected");
        }
    }
    @Test
    void TestCase5() {
        try {
            assertEquals("05-03-2016 15-03-2016", gruberHealthCareKYC.rangeOfDatesForKYC(simpleDateFormat.parse("04-04-2015"), simpleDateFormat.parse("15-03-2016")));
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("date format should be corected");
        }
    }
}