package MultipleInheritanceWithInterfaces;

//ACHIVING MULTIPLE INHERITANCE USING INTERFACES
public class SmartPhone implements Camera,MusicPalyer,Phone {

	@Override
	public void call(String Number) {
		System.out.println("Called to"+ Number+" this Number");
		
	}

	@Override
	public void end() {
		System.out.println("Call has been Ended");
		
	}

	@Override
	public void playMusic() {
		System.out.println("Playing Music");
	
		
	}

	@Override
	public void stopMusic() {
		System.out.println("Music Ended");
		
	}

	@Override
	public void takePhoto() {
	   System.out.println("Clicking photos");
		
	}

	@Override
	public void recordVideo() {
		 System.out.println("Recording video");
		
	}

}
