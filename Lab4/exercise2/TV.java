package exercise2;

public class TV {
	private int channel = 1, volume = 1;
	private boolean on = false;
	//constructor
	public TV(){
		
	}
	//get channel
	public int get_Channel(){
		if (on != true){
			System.out.print("Please turn on the TV first!!!");
			return -1;
			}
		else 
			return channel;
	}
	//set channel
	public void set_Channel(int ChannelNO){
		channel = ChannelNO > 0 && ChannelNO < 120 ? ChannelNO: 1;
	}
	//get volume
	public int get_volume(){
		if (on != true){
			System.out.print("Please turn of the TV first!!!");
			return -1;			
		}
		else 
			return volume;
	}
	//set volume
	public void set_volume(int newvolume){
		volume = newvolume > 1 && newvolume < 7? newvolume: 1;
	}
	//channel + 1
	public void channelUP(){
		if (channel != 120)
			channel += 1;
		else 
			channel = 1;			
	}
	//channel - 1
	public void channelDOWN(){
		if (channel != 1)
			channel -= 1;
		else
			channel = 120;
	}
	//volume + 1
	public void volumeUP(){
		if (volume != 7)
			volume += 1;
		else 
			System.out.println("The current volume cannot be larger!!!");
	}
	//volume - 1 
	public void volumeDOWN(){
		if (volume > 1 && volume < 7)
			volume -= 1;
		else if (volume == 1){
			volume = 0;
			System.out.println("The TV is mute now");
		}
		else 
			System.out.println("The volume cannot be lower!!!");
			
	}
	//turn on the TV
	public void turnOn(){
		on = true;
	}
	//turn off the TV
	public void turnOff(){
		on = false;
	}
	
	public void power_button(){
		if (on = false){
			on = true;
			System.out.println("The TV is turned on now!");
		}
		else {
			on = false;
			System.out.println("Power off\n See you next time");
		}
	}

}
