package compound;

public class HeartTestDrive {
	public static void main(String[] args) {
		HeartModelInterface heart = new HeartModel();
		ControllerInterface controller = new HeartController(heart);
	}
}
