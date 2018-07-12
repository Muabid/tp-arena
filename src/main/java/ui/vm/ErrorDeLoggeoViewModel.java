package ui.vm;

import org.uqbar.commons.utils.Observable;

@Observable
public class ErrorDeLoggeoViewModel {
	String error;
	
	public ErrorDeLoggeoViewModel(String error) {
		this.error = error;
	}
	
	public String getError() {
		return error;
	}
}
