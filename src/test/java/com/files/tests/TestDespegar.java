package com.files.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TestDespegar
{
	

	@Test
	public void TrabajoDespegar () throws Exception { 
		System.setProperty("webdriver.chrome.driver", "C:/Users/diego/Downloads/Nueva carpeta/ChromeDriver/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.despegar.com.ar/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		By ClickCerrarIngresoGmail = By.xpath("//*[@class=\"login-incentive shifu-3-card -shifu-3-shadow-static -show\"]//*[@class=\"login-incentive--close shifu-3-icon-close -eva-3-mr-md\"]");
		WebElement CerrarIngresoGmail = driver.findElement(ClickCerrarIngresoGmail);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickCerrarIngresoGmail));
		CerrarIngresoGmail.click();
		By ClickCerrarBanner = By.xpath("//*[@class=\"lgpd-banner--container lgpd-banner--container_fixed\"]//*[@class=\"lgpd-banner--button eva-3-btn -white -md\"]");
		WebElement CerrarBanner = driver.findElement(ClickCerrarBanner);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickCerrarBanner));
		CerrarBanner.click();
		Thread.sleep(2000);
		By ClickAlojamiento = By.linkText("Alojamientos");
		WebElement Alojamientos = driver.findElement (ClickAlojamiento);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickAlojamiento));
		Alojamientos.click();
		By ClickDestino = By.xpath("//input[@placeholder=\"Ingresá una ciudad, alojamiento o punto de interés\"]");
	    WebElement Destino = driver.findElement (ClickDestino); 
	    wait.until(ExpectedConditions.visibilityOfElementLocated(ClickDestino));
	    Destino.click();
	    Destino.sendKeys("Cancún, Quintana Roo, México");  
	    Thread.sleep(2000);
	    Destino.sendKeys(Keys.CONTROL);
	    Thread.sleep(2000);
	    Destino.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	    Destino.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		By ClickFechaDeEntrada = By.xpath("//input[@placeholder=\"Entrada\"]");
		WebElement FechaDeEntrada = driver.findElement(ClickFechaDeEntrada);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickFechaDeEntrada));
		FechaDeEntrada.click();
		By ClickDiadeEntrada =By.xpath("//*[@class=\"sbox5-floating-tooltip sbox5-floating-tooltip-opened\"]//*[@class=\"sbox5-monthgrid\" and "
				+ "@data-month=\"2022-09\"]//*[@class=\"sbox5-monthgrid-dates sbox5-monthgrid-dates-30\"]/child::div[30]");
		WebElement DiadeEntrada = driver.findElement(ClickDiadeEntrada);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickDiadeEntrada));
		DiadeEntrada.click();
        By ClickFechaDeSalida = By.xpath("//input[@placeholder=\"Salida\"]");
		WebElement FechaDeSalida = driver.findElement(ClickFechaDeSalida);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickFechaDeSalida));
		FechaDeSalida.click();
		By ClickDiadeSalida = By.xpath("//*[@class=\"sbox5-floating-tooltip sbox5-floating-tooltip-opened\"]//*[@class=\"sbox5-monthgrid\" and "
			    +"@data-month=\"2022-10\"]//*[@class=\"sbox5-monthgrid-dates sbox5-monthgrid-dates-31\"]/child::div[18]");
		WebElement DiadeSalida = driver.findElement(ClickDiadeSalida);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickDiadeSalida));
		DiadeSalida.click();
		By ClickBotonAplicar = By.xpath("//*[@class=\"sbox5-floating-tooltip sbox5-floating-tooltip-opened\"]//*[@class=\"calendar-footer\"]//*[@class=\"btn-text\"]");
		WebElement BotonAplicar = driver.findElement(ClickBotonAplicar);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickBotonAplicar));
		BotonAplicar.click();
		By ClickHabitaciones = By.xpath("//*[@class=\"sbox5-distributionPassengers sbox5-box-distributionPassengers-ovr\"]");
	    WebElement Habitaciones = driver.findElement(ClickHabitaciones);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(ClickHabitaciones));
	    Habitaciones.click();
	    By ClickCantidadAdultos =By.xpath("//*[@class=\"stepper__room\"]//*[@class=\"stepper__distribution_container\"]/child::div[1]//*[@class=\"steppers-icon-right stepper__icon\"]");
	    WebElement CantidadAdultos = driver.findElement(ClickCantidadAdultos);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(ClickCantidadAdultos));
		CantidadAdultos.click();
		By ClickMenores =By.xpath("//*[@class=\"stepper__room\"]//*[@class=\"stepper__distribution_container\"]/child::div[2]//*[@class=\"steppers-icon-right stepper__icon\"]");
		WebElement Menores = driver.findElement(ClickMenores);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickMenores));
		Menores.click();
		By ClickEdadMenor=By.xpath("//*[@class=\"select\"]");
		WebElement EdadMenor = driver.findElement(ClickEdadMenor);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickEdadMenor));
		EdadMenor.click();
		By SeleccionarEMenor = By.xpath("//*[@class=\"select-option\" and @value=\"4\"]");
		WebElement EMenor =driver.findElement(SeleccionarEMenor);
		wait.until(ExpectedConditions.visibilityOfElementLocated(SeleccionarEMenor));
	    EMenor.click();
	    By SeleccionarAplicarHab = By.xpath("//*[@class=\"distribution__container distribution__type__rooms\"]//*[@class=\"stepper__room__footer \"]//*[@class=\"btn-text\"]");
	    WebElement AplicarHab = driver.findElement(SeleccionarAplicarHab);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(SeleccionarAplicarHab));
        AplicarHab.click(); 
        By ClickBuscar = By.xpath("//*[@class=\"sbox5-box-button-ovr sbox5-3-btn sbox5-button -secondary -icon -lg\"]//*[@class=\"btn-text\"]");
        WebElement Buscar = driver.findElement(ClickBuscar);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ClickBuscar));
        Buscar.click();
        By VerOfertas = By.xpath("//*[@class=\"item-label filters-text-label -eva-3-tc-green-3\"]");
        WebElement Ofertas = driver.findElement(VerOfertas);
        System.out.println("Se encontro "+ Ofertas.getText()); 
        Assert.assertTrue(Ofertas.isDisplayed());
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerOfertas));
        By ClickBanner3 = By.xpath("//*[@class=\"tooltip-container -eva-3-shadow-1\"]//*[@class=\"tooltip-close eva-3-icon-close\"]");
        WebElement Banner3 = driver.findElement (ClickBanner3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ClickBanner3));
        Banner3.click();
        By SeleccionarHotel = By.xpath("//*[@class=\"results-cluster-container\"]");
        WebElement Hotel = driver.findElement(SeleccionarHotel);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SeleccionarHotel));
        Hotel.click();
       
        driver.quit();
	}


  }
