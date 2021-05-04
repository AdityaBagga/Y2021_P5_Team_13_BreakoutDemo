import javafx.scene.image.Image;

public class Ball extends Actor{
	
	private double dx;
	private double dy;
	
	public Ball() {
		String path = getClass().getClassLoader().getResource("resources/ball.png").toString();
		Image img = new Image(path);
		this.setImage(img);
		dx = 0;
		dy = 0;
	}


	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		this.move(dx, dy);
		if(getX() <= 0) {
			dx = -dx;
		}
		if(getX() + getWidth() >= getWorld().getWidth()) {
			dx = -dx;
		}
		
		if(getY() <= 0) {
			dy = -dy;
		}
		if(getY() + getHeight() >= getWorld().getHeight()) {
			dy = -dy;
		}
		
	}

}
