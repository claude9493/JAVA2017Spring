package exercise1;

public enum TrafficSignal {
	RED("STOP"),YELLO("CAUTION"),GREEN("GO");
	private String meaning;
	
	TrafficSignal(String s){
		this.meaning = s;
	}
	
	String get(){
		return this.meaning;
	}
	
	public static void main(String[] a)
	{
		for(TrafficSignal s: TrafficSignal.values())
			System.out.println(s.get());
	}

}
