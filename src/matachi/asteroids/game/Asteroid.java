package matachi.asteroids.game;

import java.awt.Point;

public class Asteroid /*implements IMoveable*/ {

	public DPoint position;
	DPoint velocity;
	DPoint acceleration;
	
	public Asteroid() {
		position = new DPoint(10,10);
	}
	/*
	@Override
	public DoublePoint getPosition() {
		Point p = new Point();
		return new DoublePoint(position);
	}
	@Override
	public double getPositionX() {
		return this.position.getX();
	}
	@Override
	public double getPositionY() {
		return this.position.getY();
	}
	@Override
	public void setPosition(final double x, final double y) {
		this.position.setXY(x, y);
	}
	@Override
	public void setPosition(DoublePoint p) {
		setPosition(p.getX(), p.getY());
	}
	@Override
	public DoublePoint getVelocity() {
		return new DoublePoint(velocity);
	}
	@Override
	public double getVelocityX() {
		return velocity.getX();
	}
	@Override
	public double getVelocityY() {
		return velocity.getY();
	}
	@Override
	public void setVelocity(final double x, final double y) {
		this.velocity.setXY(x, y);
	}
	@Override
	public void setVelocity(DoublePoint p) {
		this.setVelocity(p.getX(), p.getY());
	}
	@Override
	public DoublePoint getAcceleration() {
		return new DoublePoint(this.acceleration);
	}
	@Override
	public double getAccelerationX() {
		return this.acceleration.getX();
	}
	@Override
	public double getAccelerationY() {
		return this.acceleration.getY();
	}
	@Override
	public void setAcceleration(final double x, final double y) {
		this.acceleration.setXY(x, y);
	}
	@Override
	public void setAcceleration(DoublePoint p) {
		this.setAcceleration(p.getX(), p.getY());
	}
	@Override
	public void move(double x, double y) {
		this.position.setXY(this.position.getX() );
	}
	@Override
	public void move(DoublePoint p) {
		// TODO Auto-generated method stub
		
	}*/
	
}