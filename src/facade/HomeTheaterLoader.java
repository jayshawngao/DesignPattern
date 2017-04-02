package facade;

public class HomeTheaterLoader {
	public static void main(String[] args) {
		PopcornPopper popcornPopper = new PopcornPopper();
		Screen screen = new Screen();
		Tuner tuner = new Tuner();
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(popcornPopper, screen, tuner);
		homeTheaterFacade.watchMoive();
		homeTheaterFacade.endMovie();
	}
}
