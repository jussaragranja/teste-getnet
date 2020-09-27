package br.com.getnet.teste.steps;

import br.com.getnet.teste.page.BasePage;
import br.com.getnet.teste.support.Property;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static br.com.getnet.teste.support.Driver.driver;
import static br.com.getnet.teste.support.Driver.getDriver;


/**
 * @author jussaragranja
 */

public class Hooks extends BasePage {
	
	@Before
    public void before() {
		driver = getDriver();
		driver.navigate().to(Property.URL);
    }
	  
	 @After
	 public void after() {
		 if(driver != null){
			 driver.quit();
		 }
		 driver = null;
	  }

}
