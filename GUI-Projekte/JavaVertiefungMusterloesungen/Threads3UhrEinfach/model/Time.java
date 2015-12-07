package Threads3UhrEinfach.model;

public class Time {
  
  private final int stunden;
  private final int minuten;
  private final int sekunden;
  
  public Time(final int stunden, final int minuten, final int sekunden) {
    this.stunden = stunden;
    this.minuten = minuten;
    this.sekunden = sekunden;
  }

  public String getFormattedTime() {
    return getFormattedTimeElement(stunden) + ":" 
        + getFormattedTimeElement(minuten) + ":" + getFormattedTimeElement(sekunden);
  }
  
  private String getFormattedTimeElement(final int time) {
    if (time < 10) {
      return "0" + time;
    }
    return String.valueOf(time);
  }
}
