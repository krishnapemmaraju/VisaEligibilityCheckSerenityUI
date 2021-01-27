package com.serenity.ui.test.readers;


import lombok.Data;

@Data
public class ReadEnvironments {
	private Stage stage;
	private static ReadEnvironments readData;

	@Data
	public static class Stage {
		private Tourism tourism;
	}

	@Data
	public static class Tourism {
		private String nationality, reasonToStay;
	}

	public static ReadEnvironments readTestData() {

		return readData;
	}
}
