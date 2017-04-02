package facade;

public class HomeTheaterFacade {
	PopcornPopper popcornPopper;
	Screen screen;
	Tuner tuner;
	public HomeTheaterFacade(PopcornPopper popcornPopper,Screen screen,Tuner tuner) {
		this.popcornPopper = popcornPopper;
		this.screen = screen;
		this.tuner = tuner;
	}
	void watchMoive(){
		popcornPopper.begin();
		screen.on();
		tuner.on();
	}
	
	void endMovie(){
		popcornPopper.stop();
		screen.off();
		tuner.off();
	}
}
