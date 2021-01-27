package com.serenity.test.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GovUKWorkVisaSelecCriteria extends PageObject {
		
	@FindBy(xpath="//div[@class='govuk-radios']/ancestor::div//button[contains(text(),'Continue')]")
	WebElementFacade clkWorkDurContBtn;
	
	@FindBy(xpath="//span[text()='Check if you need a UK visa']")
	WebElementFacade wtForVisaReaSelChk;
	
	public void selDurationToWorkInUK(String workDuration) {
    	String selWorkDuration = "//label[contains(text(),'"+workDuration+"')]/parent::div//input[@type='radio']";
    	waitForCondition().until(ExpectedConditions.textToBePresentInElement(wtForVisaReaSelChk,"Check if you need a UK visa"));
    	WebElementFacade ele_selWrkDur = $(By.xpath(selWorkDuration));
    	ele_selWrkDur.click();
    	clkWorkDurContBtn.click();
    }

}
