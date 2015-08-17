import org.junit.*;
import static org.junit.Assert.*;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;


public class TriangleTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

    @ClassRule
    public static ServerRule server = new ServerRule();

    @Test
    public void newTriangle_instantiatesCorrectly() {
      Triangle app = new Triangle(2,2,2);
      assertEquals(true, app instanceof Triangle);
    }

    @Test
    public void newTriangle_ifIsTriangle1_true() {
      Triangle app = new Triangle(2,2,1);
      assertEquals(true, app.isTriangle1());
    }

    @Test
    public void newTriangle_ifIsTriangle2_true() {
      Triangle app = new Triangle(1,2,2);
      assertEquals(true, app.isTriangle2());
    }

    @Test
    public void newTriangle_ifIsTriangle3_true() {
      Triangle app = new Triangle(2,1,2);
      assertEquals(true, app.isTriangle3());
      }

      @Test
      public void newTriangle_ifTriangleIsEquilateral_true() {
        Triangle app = new Triangle(2,2,2);
        assertEquals(true, app.isEquilateral());
        }
  }

//     @Test
//     public void coinCombination_returnWordCoinsFor_97() {
//       CoinCombinations app = new CoinCombinations();
//       assertEquals("3 quarters, 2 dimes, 0 nickels, and 2 pennies.", app.coinCombination("97"));
//     }
//
//     @Test
//     public void rootTest() {
//         goTo("http://localhost:4567/");
//         assertThat(pageSource()).contains("Coin Combination Game");
//     }
//
//     @Test
//     public void centsGiven() {
//     goTo("http://localhost:4567/");
//     fill("#userInput").with("97");
//     submit(".btn");
//     assertThat(pageSource()).contains("3 quarters, 2 dimes, 0 nickels, and 2 pennies.");
//   }
// }
