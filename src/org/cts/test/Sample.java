package org.cts.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\WebTable\\driver\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.toolsqa.com/automation-practice-table/");
List<WebElement> tbl = driver.findElements(By.tagName("tr"));
for (int i = 2; i <4; i++) {
	WebElement rows = tbl.get(i);
	List<WebElement> datas = rows.findElements(By.tagName("td"));
	for (int j = 0; j < datas.size(); j++) {
		WebElement all = datas.get(j);
		String text = all.getText();	
		System.out.println(text);
	}
	
	
}


}

}
		
	
