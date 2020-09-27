package br.com.getnet.teste.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;

/**
 * @author jussaragranja
 * Busca pelo driver correto dentro do projeto, de acordo com o que foi setado no properties
 * e de acordo com o sistema operacional que os testes estão sendo executados
 */

public class Driver {
	
	public static WebDriver driver;
	public static String OS = System.getProperty("os.name").toLowerCase();
	private static final ThreadLocal<WebDriver> threadWebDriver = new ThreadLocal<WebDriver>();
	//private static final String gridUrl = System.getProperty("gridurl");
	private static final OptionChrome optionChrome = new OptionChrome();


	public static WebDriver getDriver(){
		if(driver == null){
			try {
				if(Browser.CHROME.equals(Property.BROWSER_NAME)){
					System.setProperty("webdriver.chrome.driver", getFileDriverPathChrome().getAbsolutePath());
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}

				if(Browser.REMOTECHROME.equals(Property.BROWSER_NAME)){
					System.setProperty("webdriver.chrome.driver", getFileDriverPathChrome().getAbsolutePath());
					driver = new RemoteWebDriver(new URL(Property.GRIDURL), optionChrome.getChromeOptions());
				}

			} catch (Exception e){
				System.out.println(e.getMessage());
			}
		}
		return driver;
	}

	//detectando Sistema Operacional
	public static boolean isWindows(){
		return (OS.indexOf("win") >= 0);
	}

	//detectando Sistema Operacional
	public static boolean isUnix(){
		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS
				.indexOf("aix") > 0);
	}

	//Buscar arquivo do driver
	public static File getFileDriverPathChrome() throws Exception{
		File file = null;
		if(isWindows()){
			file = new File(Property.CHROME_DRIVE_PATH);
		}else if(isUnix()){
			file = new File(Property.CHROME_DRIVE_LINUX_PATH);
		}else
			throw new Exception("Sistema operacional nao compativel");
		return file;
	}

}
