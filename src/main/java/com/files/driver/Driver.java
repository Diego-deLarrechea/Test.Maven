package com.files.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

	public class Driver {
		public static void goToMainPageDespegar(WebDriver driver) {
			driver.manage().window().maximize();
			driver.get("https://www.despegar.com");	
			
			}
			public static WebDriver iniciarDriver(String browserName) {
				WebDriver driver=null;
				
				switch(browserName) {
				case "CHROME":{
					System.setProperty("webdriver.chrome.driver", "C:/Users/diego/Downloads/Nueva carpeta/ChromeDriver/chromedriver.exe");
					System.out.println("Abre Chrome");
					driver=new ChromeDriver();
					break;
			
				}
				case "EDGE":{
					System.setProperty("webdriver.msedge.driver", "C:/Users/diego/Downloads/Nueva carpeta/Driver_Notes/msedgedriver.exe");
					System.out.println("Abre Edge");
					driver=new EdgeDriver();
					break;
				}
				default:
					Reporter.log("No selecciona ningun browser correcto, se asigna chrome");
					System.setProperty("webdriver.chrome.driver", "src/resources/Recursos/chromedriver.exe");
					Reporter.log("Abre browser");
					driver=new ChromeDriver();
					
				}
				return driver;
			}
				
			
	}
