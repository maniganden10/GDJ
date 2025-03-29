package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoviePage {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	public MoviePage(WebDriver driver,WebDriverWait wait) {
		this.driver=driver;
		this.wait=wait;
		PageFactory.initElements(driver, this);
	}
	/*
	 * 10:46:54.537 INFO [LocalDistributor.newSession] - Session request received by
	 * the Distributor: [Capabilities {browserName: chrome, platformName: windows}]
	 * 10:46:55.484 INFO [LocalNode.newSession] - Session created by the Node. Id:
	 * 74c62ae83dc6aaa1710d4cccb2241eb0, Caps: Capabilities {acceptInsecureCerts:
	 * false, browserName: chrome, browserVersion: 134.0.6998.178, chrome:
	 * {chromedriverVersion: 134.0.6998.165 (fd886e2cb29..., userDataDir:
	 * C:\Users\Admin\AppData\Loca...}, fedcm:accounts: true, goog:chromeOptions:
	 * {debuggerAddress: localhost:65206}, networkConnectionEnabled: false,
	 * pageLoadStrategy: normal, platformName: windows, proxy: Proxy(),
	 * se:bidiEnabled: false, se:cdp: ws://192.168.0.104:4444/ses..., se:cdpVersion:
	 * 134.0.6998.178, setWindowRect: true, strictFileInteractability: false,
	 * timeouts: {implicit: 0, pageLoad: 300000, script: 30000},
	 * unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob:
	 * true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength:
	 * true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
	 * 10:46:55.487 INFO [LocalDistributor.newSession] - Session created by the
	 * Distributor. Id: 74c62ae83dc6aaa1710d4cccb2241eb0 Caps: Capabilities
	 * {acceptInsecureCerts: false, browserName: chrome, browserVersion:
	 * 134.0.6998.178, chrome: {chromedriverVersion: 134.0.6998.165 (fd886e2cb29...,
	 * userDataDir: C:\Users\Admin\AppData\Loca...}, fedcm:accounts: true,
	 * goog:chromeOptions: {debuggerAddress: localhost:65206},
	 * networkConnectionEnabled: false, pageLoadStrategy: normal, platformName:
	 * windows, proxy: Proxy(), se:bidiEnabled: false, se:cdp:
	 * ws://192.168.0.104:4444/ses..., se:cdpVersion: 134.0.6998.178, setWindowRect:
	 * true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad:
	 * 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify,
	 * webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true,
	 * webauthn:extension:minPinLength: true, webauthn:extension:prf: true,
	 * webauthn:virtualAuthenticators: true} 10:46:57.985 INFO
	 * [LocalNode.stopTimedOutSession] - Session id 74c62ae83dc6aaa1710d4cccb2241eb0
	 * is stopping on demand... 10:46:57.986 INFO [LocalSessionMap.remove] - Deleted
	 * session from local Session Map, Id: 74c62ae83dc6aaa1710d4cccb2241eb0
	 * 10:46:57.986 INFO [GridModel.release] - Releasing slot for session id
	 * 74c62ae83dc6aaa1710d4cccb2241eb0 10:46:57.986 INFO [SessionSlot.stop] -
	 * Stopping session 74c62ae83dc6aaa1710d4cccb2241eb0
	 */
	
	@FindBy(className="kqrJYR") List<WebElement> suggestedMovies;
}
