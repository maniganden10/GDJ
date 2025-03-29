package PageObject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends BasicSetup {
	private WebDriver driver;
	private WebDriverWait wait;
	public Actions action;
	public Action builtAction;
	public Homepage(WebDriver driver,WebDriverWait wait) {
		this.driver=driver;
		this.wait=wait;
		this.action=new Actions(this.driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//span[contains(text(),'Search for Movies')]") WebElement searchMovieBox;
	
	@FindBy(xpath="//a[contains(@class,'fHgWnO')]") WebElement recomMovies;
	
	@FindBy(className="kqrJYR") List<WebElement> suggestedMovies;
	
	@FindBy(xpath="//input[contains(@title,'Search for Products')]") WebElement searchBox;
	
	@FindBy(className="cntvL") WebElement city;
	
	public boolean setCity(String cityName) {
		wait.until(ExpectedConditions.visibilityOf(searchBox));
		action.click(searchBox).sendKeys(cityName).sendKeys(Keys.ENTER).build().perform();
		//return wait.until(ExpectedConditions.textToBePresentInElement(searchBox, cityName));
		return true;
	}
	
	public boolean searchMovie(String movieName) {
		//searchBox.sendKeys(movieName);
		builtAction=action.moveToElement(searchMovieBox).sendKeys(movieName).sendKeys(Keys.ENTER).build();
		if(searchMovieBox.getText().equals(movieName)) {
			builtAction.perform();
			return true;
		}
			
		else return false;
	}
	
	public void searchFromSuggestions(String partMovieName,String matchingPart) {
		searchMovieBox.sendKeys(partMovieName);
		wait.until(ExpectedConditions.visibilityOfAllElements(suggestedMovies));
		try {
			for(WebElement movie:suggestedMovies) {
				if(movie.getText().contains(matchingPart)) {
					action.moveToElement(movie).click().build().perform();
				}
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
}
