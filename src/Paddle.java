import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;

public class Paddle extends Actor{

    private boolean isMoving;

    public Paddle(){
        String path = getClass().getClassLoader().getResource("resources/paddle.png").toString();
        Image img = new Image(path);
        this.setImage(img);
    }

    @Override
    public void act(long now) {

        if (getWorld().isKeyDown(KeyCode.LEFT)){
            double speed = this.getWidth()/12;
            if(this.getX()>=speed/2) this.move(-speed, 0);
        }
        if (getWorld().isKeyDown(KeyCode.RIGHT)){
            double speed = this.getWidth()/12;
            if(this.getX() <= getWorld().getWidth()-this.getWidth()-speed/2) this.move(speed, 0);
        }
    }

    public boolean isMoving(){
        return isMoving;
    }

    public void setMoving(boolean move){
        isMoving = move;
    }


}
