import java.util.ArrayList;
import java.util.List;
import java.lang.Object;

import javafx.animation.AnimationTimer;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

public abstract class World extends Pane{
	
	private AnimationTimer timer;
	private World world = this;
	
	public World() {
		//List<Actor> actor = this.getChildren();
		timer = new AnimationTimer(){
			@Override
			public void handle(long now) {
				world.act(now);
				for(Node actor: world.getChildren()) {
					((Actor) actor).act(now);
				}
			}
		};
	}
	
	public abstract void act(long now);
	
	public void add(Actor actor) {
		this.getChildren().add(actor);
	}
	
	public void remove(Actor actor) {
		this.getChildren().remove(actor);
	}
	
	public void start() {
		timer.start();
	}
	
	public void stop() {
		timer.stop();
	}
	
	public <A extends Actor> java.util.List<A> getObjects(java.lang.Class<A> cls){
		List<A> list = new ArrayList<>();
		
		/*
		for(int i=0; i<getChildren().size(); i++) {
			if(getChildren().get(i).getClass().isInstance(cls)) {
				list.add(cls.cast(getChildren().get(i)));
			}
		}
		*/
		
		for(Node node: this.getChildren()) {
			if(cls.isInstance(node)) {
				list.add(cls.cast(node));
			}
		}
		return list;
	}

}
