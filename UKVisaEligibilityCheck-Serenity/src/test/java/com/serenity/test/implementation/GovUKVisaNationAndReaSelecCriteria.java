package com.serenity.test.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GovUKVisaNationAndReaSelecCriteria extends PageObject {

	@FindBy(xpath = "//select[@id='response']")
	WebElementFacade selCntryDrpDwn;

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElementFacade clkOnCtySelContBtn;

	@FindBy(xpath = "//div[@class='govuk-radios']/ancestor::div//button[contains(text(),'Continue')]")
	WebElementFacade clkOnReasonToVisitContBtn;

	@FindBy(xpath = "(//div[@id='result-info']//h2)[1]")
	WebElementFacade valVisaOutcomeMsg;

	@FindBy(xpath = "//span[text()='Check if you need a UK visa']")
	WebElementFacade wtForVisaReaSelChk;

	public void selectNationalityAndReason(String nationality, String reason) {
		String selReasonToVist = "//label[contains(text(),'" + reason.trim() + "')]/parent::div//input[@type='radio']";
		selCntryDrpDwn.selectByVisibleText(nationality);
		clkOnCtySelContBtn.click();
		waitForCondition()
				.until(ExpectedConditions.textToBePresentInElement(wtForVisaReaSelChk, "Check if you need a UK visa"));
		WebElementFacade ele_seleReason = $(By.xpath(selReasonToVist.trim()));
		ele_seleReason.click();
		clkOnReasonToVisitContBtn.click();
	}

	public String validateOutcome() {
		return valVisaOutcomeMsg.getText().trim();
	}
}
