
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author W7134551
 */
public class ViewOrderTest extends Page {


    @Before
    public void setUp() {
        SetUp();
    }

    @Test
    public void ViewOrderTest() {
         Authentication();
    }

    @After
    public void tearDown() {
        wd.quit();
    }
}
