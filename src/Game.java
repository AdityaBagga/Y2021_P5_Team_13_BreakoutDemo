import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Game extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		stage.setTitle("BallWorld");
		
		BorderPane rootNode = new BorderPane();
		
		BallWorld ballWorld = new BallWorld();
		ballWorld.setPrefSize(500, 500);
		rootNode.setCenter(ballWorld);
		
		Ball ball = new Ball();
		ball.setX(250);
		ball.setY(250);
		
		ballWorld.add(ball);
		ballWorld.start();
		
		Scene scene = new Scene(rootNode);
		stage.setScene(scene);
		stage.show();
		
		/*
		
		sets the Title of the Stage
		creates a root Node using BorderPane
		creates a new BallWorld and sets its preferred size
		sets the BallWorld as the center of the root BorderPane
		creates a new Scene using the BorderPane root made earlier
		creates a Ball, sets its x and y position
		adds the Ball to the world
		calls start() on the world 
		*/

		
	}

}
