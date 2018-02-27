package javaapp.Runner.Gameengine;

import java.awt.Graphics;

public abstract class Entity {

	protected static float x, y;

	public Entity(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public abstract void tick();

	public abstract void render(Graphics g);

}
