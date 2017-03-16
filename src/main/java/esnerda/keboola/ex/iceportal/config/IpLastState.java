package esnerda.keboola.ex.iceportal.config;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import esnerda.keboola.components.appstate.LastState;

/**
 * @author David Esner
 */
public class IpLastState implements LastState {

   @JsonProperty("lastRun")
   private LocalDate lastRun;

public IpLastState(LocalDate lastRun) {
	super();
	this.lastRun = lastRun;
}

public IpLastState() {	
}

public LocalDate getLastRun() {
	return lastRun;
}

public void setLastRun(LocalDate lastRun) {
	this.lastRun = lastRun;
}

@JsonIgnore
public String getLastRunString() {
	return lastRun.format(DateTimeFormatter.ISO_LOCAL_DATE);
}



}