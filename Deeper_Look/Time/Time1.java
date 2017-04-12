package Time;

public class Time1 {
	private int hour, minute, second;
	public void setTime(int h, int m, int s){
		hour = (( h >= 0 && h < 24)? h: 0);
		minute = (( m >= 0 && m < 60)? m: 0);
		second = (( s >= 0 && s < 60)? s: 0);
	}
	
	public String toUniversalString(){
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	public String toString(){
		return String.format("%02d:%02d:%02d  %s",
				(( hour == 0 || hour == 12)? 12: hour %12),
				minute, second, ((hour > 12)? "PM": "AM"));
	}

}
