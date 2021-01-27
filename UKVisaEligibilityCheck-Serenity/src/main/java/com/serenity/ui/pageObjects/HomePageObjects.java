package com.serenity.ui.pageObjects;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageObjects {
	
	public static final Target NATIONALITY_DROPDOWN = Target.the("Nationality")
			.locatedBy("#response");
	
	public static final Target NATIONALITY_CONTINUE_BUTTON = Target.the("NationalityContinueBtn")
			.locatedBy("//button[contains(text(),'Continue')]");
	
	public static final Target HOMEPAGE_TEXT = Target.the("HomePageText")
			.locatedBy("//span[text()='Check if you need a UK visa']");
}
