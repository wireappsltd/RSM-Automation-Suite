package com.rsm.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RSMMyRawMaterialsPage {
	
WebDriver ldriver;
	
	public RSMMyRawMaterialsPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="/html/body/nav/section/a[3]")
	@CacheLookup
	WebElement tabMyRawMaterials;
	
	@FindBy(xpath="/html/body/section/div/div/div[1]/a[1]")
	@CacheLookup
	WebElement btnAddNewRawMaterial;
	
	@FindBy(xpath="//body/section[1]/div[1]/div[1]/div[1]/a[2]")
	@CacheLookup
	WebElement btnExporttoCSV;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/h1")
	@CacheLookup
	WebElement labelMyRawMaterial;
	
	//Basic data section
	
	@FindBy(xpath="//*[@id=\"mainForm\"]/div/div[1]/div[1]/label")
	@CacheLookup
	WebElement labelAddPhotos;
	
	@FindBy(xpath="//input[@id='Name']")
	@CacheLookup
	WebElement txtName;
	
	@FindBy(xpath="//*[@id=\"Description\"]")
	@CacheLookup
	WebElement txtDescription;
	
	@FindBy(xpath="//select[@id='ResourceCategoryId']")
	@CacheLookup
	WebElement ddCategory;
	
	@FindBy(xpath="//*[@id=\"ResourceCategoryId\"]/option[1]")
	@CacheLookup
	WebElement OptCategory;
	
	@FindBy(xpath="//input[@id='Quantity']")
	@CacheLookup
	WebElement txtQuantity;
	
	@FindBy(xpath="//select[@id='ResourceTypeId']")
	@CacheLookup
	WebElement ddTip;
	
	@FindBy(xpath="//*[@id=\"ResourceTypeId\"]/option[2]")
	@CacheLookup
	WebElement OptTip;
	
	@FindBy(xpath="//select[@id='ResourceStatusId']")
	@CacheLookup
	WebElement ddStatus;
	
	@FindBy(xpath="//*[@id=\"ResourceStatusId\"]/option[1]")
	@CacheLookup
	WebElement OptStatus;
	
	@FindBy(xpath="//input[@id='YearlyProduction']")
	@CacheLookup
	WebElement txtAnnualProduction;
	
	@FindBy(xpath="//input[@id='PhoneNumber']")
	@CacheLookup
	WebElement txtPhoneNumber;
	
	@FindBy(xpath="//input[@id='MobileNumber']")
	@CacheLookup
	WebElement txtMobileNumber;
	
	@FindBy(xpath="//input[@id='Website']")
	@CacheLookup
	WebElement txtWebPage;
	
	@FindBy(xpath="//button[@id='saveButton']")
	@CacheLookup
	WebElement btnSave;
	
	//Components section
	
	@FindBy(xpath="//body/section[1]/div[1]/div[1]/div[2]")
	@CacheLookup
	WebElement tabComponents;
	
	//Components -- Mixture composition
	
	@FindBy(xpath="//select[@id='_componentList']")
	@CacheLookup
	WebElement ddMixtureComposition;
	
	@FindBy(xpath="//*[@id=\"_componentList\"]/option[4]")
	@CacheLookup
	WebElement OptMixtureComposition;
	
	@FindBy(xpath="//input[@id='txtComponentMin']")
	@CacheLookup
	WebElement txtMCMin;
	
	@FindBy(xpath="//input[@id='txtComponentMax']")
	@CacheLookup
	WebElement txtMCMax;
	
	@FindBy(xpath="//select[@id='ComponentUnitId']")
	@CacheLookup
	WebElement ddMCUnit;
	
	@FindBy(xpath="//*[@id=\"ComponentUnitId\"]/option[1]")
	@CacheLookup
	WebElement OptMCUnit;
	
	@FindBy(xpath="//select[@id='SourceId']")
	@CacheLookup
	WebElement ddMCDataSource;
	
	@FindBy(xpath="//*[@id=\"SourceId\"]/option[9]")
	@CacheLookup
	WebElement OptMCDataSource;
	
	@FindBy(xpath="//*[@id=\"componentsForm\"]/div[1]/div[6]/button")
	@CacheLookup
	WebElement btnAddMC;
	
	//Components -- Elemental composition
	
	@FindBy(xpath="//select[@id='_elementList']")
	@CacheLookup
	WebElement ddElementalComposition;
	
	@FindBy(xpath="//*[@id=\"_elementList\"]/option[1]")
	@CacheLookup
	WebElement OptElementalComposition;
	
	@FindBy(xpath="//input[@id='txtElementMin']")
	@CacheLookup
	WebElement txtECMin;
	
	@FindBy(xpath="//input[@id='txtElementMax']")
	@CacheLookup
	WebElement txtECMax;
	
	@FindBy(xpath="//select[@id='ElementUnitId']")
	@CacheLookup
	WebElement ddECUnit;
	
	@FindBy(xpath="//*[@id=\"ElementUnitId\"]/option[1]")
	@CacheLookup
	WebElement OptECUnit;
	
	@FindBy(xpath="//select[@id='ElementSourceId']")
	@CacheLookup
	WebElement ddECDataSource;
	
	@FindBy(xpath="//*[@id=\"ElementSourceId\"]/option[9]")
	@CacheLookup
	WebElement OptECDataSource;
	
	@FindBy(xpath="//*[@id=\"elementsForm\"]/div[1]/div[6]/button")
	@CacheLookup
	WebElement btnAddEC;
	
	//Location section
	
	@FindBy(xpath="//body/section[1]/div[1]/div[1]/div[3]")
	@CacheLookup
	WebElement tabLocation;
	
	@FindBy(xpath="//textarea[@id='Resource_Access']")
	@CacheLookup
	WebElement txtAccess;
	
	@FindBy(xpath="//select[@id='locResourceCategoryId']")
	@CacheLookup
	WebElement ddLocationCategory;
	
	@FindBy(xpath="//*[@id=\"locResourceCategoryId\"]/option[2]")
	@CacheLookup
	WebElement optLocationCategory;
	
	@FindBy(xpath="//input[@id='Resource_Address1']")
	@CacheLookup
	WebElement txtTitle1;
	
	@FindBy(xpath="//input[@id='Resource_Address2']")
	@CacheLookup
	WebElement txtTitle2;
	
	@FindBy(xpath="//input[@id='Resource_PostCode']")
	@CacheLookup
	WebElement txtPostCode;
	
	@FindBy(xpath="//input[@id='Resource_City']")
	@CacheLookup
	WebElement txtRegion;
	
	@FindBy(xpath="//select[@id='locCountry']")
	@CacheLookup
	WebElement ddState;
	
	@FindBy(xpath="//*[@id=\"locCountry\"]/option[1]")
	@CacheLookup
	WebElement optState;
	
	@FindBy(xpath="//input[@id='lng']")
	@CacheLookup
	WebElement txtLng;
	
	@FindBy(xpath="//input[@id='lat']")
	@CacheLookup
	WebElement txtLat;
	
	@FindBy(xpath="//*[@id=\"updateLocationForm\"]/div/div[1]/div[7]/button")
	@CacheLookup
	WebElement btnSaveLocation;
	
	//Documents section
	
	@FindBy(xpath="//body/section[1]/div[1]/div[1]/div[4]")
	@CacheLookup
	WebElement tabDocuments;
	
	@FindBy(xpath="/html/body/section/div[2]/div/div/a")
	@CacheLookup
	WebElement btnAddDocument;
	
	@FindBy(xpath="//input[@id='fileName']")
	@CacheLookup
	WebElement txtFileName;
	
	@FindBy(xpath="/html/body/section/form/div[1]/section/button")
	@CacheLookup
	WebElement btnChoose;
	
	@FindBy(xpath="//textarea[@id='Document_Description']")
	@CacheLookup
	WebElement txtDocDescription;
	
	@FindBy(xpath="/html/body/section/form/div[3]/button")
	@CacheLookup
	WebElement btnAddDocument2;
	
	public void clickOnMyRawMaterials() throws InterruptedException {
		tabMyRawMaterials.click();
		Thread.sleep(3000);
	}
	
	public boolean btnAddNewRawMaterial() throws InterruptedException {
		return btnAddNewRawMaterial.isDisplayed();
	}
	
	public boolean btnExporttoCSV() throws InterruptedException {
		return btnExporttoCSV.isDisplayed();
	}
	
	public boolean labelMyRawMaterial() throws InterruptedException {
		return labelMyRawMaterial.isDisplayed();
	}
	
	public void clickOnAddNewRawMaterial() throws InterruptedException {
		btnAddNewRawMaterial.click();
		Thread.sleep(3000);
	}
	
	//Basic data section
	
	public void labelAddPhotos() throws InterruptedException {
		labelAddPhotos.click();
		Thread.sleep(3000);
	}
	
	public void setName(String name) throws InterruptedException {
		txtName.clear();
		Thread.sleep(1000);
		txtName.sendKeys(name);
		//Thread.sleep(5000);
	}
	
	public void setDescription(String description) throws InterruptedException {
		txtDescription.clear();
		Thread.sleep(1000);
		txtDescription.sendKeys(description);
		//Thread.sleep(3000);
	}
	
	public void clickOnCategory() throws InterruptedException {
		ddCategory.click();
		Thread.sleep(1000);
	}
	
	public void selectCategory() throws InterruptedException {
		OptCategory.click();
		Thread.sleep(1000);
	}
	
	public void setQuantity(String qty) throws InterruptedException {
		txtQuantity.clear();
		Thread.sleep(1000);
		txtQuantity.sendKeys(qty);
		//Thread.sleep(3000);
	}
	
	public void clickOnTip() throws InterruptedException {
		ddTip.click();
		Thread.sleep(1000);
	}
	
	public void selectTip() throws InterruptedException {
		OptTip.click();
		Thread.sleep(1000);
	}
	
	public void clickOnStatus() throws InterruptedException {
		ddStatus.click();
		Thread.sleep(1000);
	}
	
	public void selectStatus() throws InterruptedException {
		OptStatus.click();
		Thread.sleep(1000);
	}
	
	public void setAnnualProduction(String pro) throws InterruptedException {
		txtAnnualProduction.clear();
		Thread.sleep(1000);
		txtAnnualProduction.sendKeys(pro);
		//Thread.sleep(3000);
	}
	
	public void setPhoneNumber(String phone) throws InterruptedException {
		txtPhoneNumber.clear();
		Thread.sleep(1000);
		txtPhoneNumber.sendKeys(phone);
		//Thread.sleep(3000);
	}
	
	public void setMobileNumber(String mobile) throws InterruptedException {
		txtMobileNumber.clear();
		Thread.sleep(1000);
		txtMobileNumber.sendKeys(mobile);
		//Thread.sleep(3000);
	}
	
	public void setWebPage(String web) throws InterruptedException {
		txtWebPage.clear();
		Thread.sleep(1000);
		txtWebPage.sendKeys(web);
		//Thread.sleep(3000);
	}
	
	public void clickOnSave() throws InterruptedException {
		btnSave.click();
		Thread.sleep(5000);
	}
	
	//Components section
	
	public void clickOnComponents() throws InterruptedException {
		tabComponents.click();
		Thread.sleep(1000);
	}
	
	//Components -- Mixture composition
	
	public void clickOnMixtureComposition() throws InterruptedException {
		ddMixtureComposition.click();
		Thread.sleep(1000);
	}
	
	public void selectMixtureComposition() throws InterruptedException {
		OptMixtureComposition.click();
		Thread.sleep(1000);
	}
	
	public void setMCMin(String mcmin) throws InterruptedException {
		txtMCMin.clear();
		Thread.sleep(1000);
		txtMCMin.sendKeys(mcmin);
		//Thread.sleep(3000);
	}
	
	public void setMCMax(String mcmax) throws InterruptedException {
		txtMCMax.clear();
		Thread.sleep(1000);
		txtMCMax.sendKeys(mcmax);
		//Thread.sleep(3000);
	}
	
	public void clickOnMCUnit() throws InterruptedException {
		ddMCUnit.click();
		Thread.sleep(1000);
	}
	
	public void selectMCUnit() throws InterruptedException {
		OptMCUnit.click();
		Thread.sleep(1000);
	}
	
	public void clickOnMCDataSource() throws InterruptedException {
		ddMCDataSource.click();
		Thread.sleep(1000);
	}
	
	public void selectMCDataSource() throws InterruptedException {
		OptMCDataSource.click();
		Thread.sleep(1000);
	}
	
	public void clickOnAddMC() throws InterruptedException {
		btnAddMC.click();
		Thread.sleep(1000);
	}
	
	//Components -- Elemental composition
	
	public void clickOnElementalComposition() throws InterruptedException {
		ddElementalComposition.click();
		Thread.sleep(1000);
	}
	
	public void selectElementalComposition() throws InterruptedException {
		OptElementalComposition.click();
		Thread.sleep(1000);
	}
	
	public void setECMin(String ecmin) throws InterruptedException {
		txtECMin.clear();
		Thread.sleep(1000);
		txtECMin.sendKeys(ecmin);
		//Thread.sleep(3000);
	}
	
	public void setECMax(String ecmax) throws InterruptedException {
		txtECMax.clear();
		Thread.sleep(1000);
		txtECMax.sendKeys(ecmax);
		//Thread.sleep(3000);
	}
	
	public void clickOnECUnit() throws InterruptedException {
		ddECUnit.click();
		Thread.sleep(1000);
	}
	
	public void selectECUnit() throws InterruptedException {
		OptECUnit.click();
		Thread.sleep(1000);
	}
	
	public void clickOnECDataSource() throws InterruptedException {
		ddECDataSource.click();
		Thread.sleep(1000);
	}
	
	public void selectECDataSource() throws InterruptedException {
		OptECDataSource.click();
		Thread.sleep(1000);
	}
	
	public void clickOnAddEC() throws InterruptedException {
		btnAddEC.click();
		Thread.sleep(1000);
	}
	
	//Location section
	
	public void clickOnLocation() throws InterruptedException {
		tabLocation.click();
		Thread.sleep(1000);
	}
	
	public void setAccess(String access) throws InterruptedException {
		txtAccess.clear();
		Thread.sleep(1000);
		txtAccess.sendKeys(access);
	}
	
	public void clickOnLocationCategory() throws InterruptedException {
		ddLocationCategory.click();
		Thread.sleep(1000);
	}
	
	public void selectLocationCategory() throws InterruptedException {
		optLocationCategory.click();
		Thread.sleep(1000);
	}
	
	public void setTitle1(String title1) throws InterruptedException {
		txtTitle1.clear();
		Thread.sleep(1000);
		txtTitle1.sendKeys(title1);
	}
	
	public void setTitle2(String title2) throws InterruptedException {
		txtTitle2.clear();
		Thread.sleep(1000);
		txtTitle2.sendKeys(title2);
	}
	
	public void setPostCode(String code) throws InterruptedException {
		txtPostCode.clear();
		Thread.sleep(1000);
		txtPostCode.sendKeys(code);
	}
	
	public void setRegion(String region) throws InterruptedException {
		txtRegion.clear();
		Thread.sleep(1000);
		txtRegion.sendKeys(region);
	}
	
	public void clickOnState() throws InterruptedException {
		ddState.click();
		Thread.sleep(1000);
	}
	
	public void selectState() throws InterruptedException {
		optState.click();
		Thread.sleep(1000);
	}
	
	public void setLng(String lng) throws InterruptedException {
		txtLng.clear();
		Thread.sleep(1000);
		txtLng.sendKeys(lng);
	}
	
	public void setLat(String lat) throws InterruptedException {
		txtLat.clear();
		Thread.sleep(1000);
		txtLat.sendKeys(lat);
	}
	
	public void clickOnSaveLocation() throws InterruptedException {
		btnSaveLocation.click();
		Thread.sleep(1000);
	}
	
	//Documents section

}
