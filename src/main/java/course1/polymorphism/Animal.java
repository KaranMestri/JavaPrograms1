package course1.polymorphism;

public abstract class Animal {

	 private String minSpeed;

	 public String getMinSpeed() {
		return minSpeed;
	}

	 public void setMinSpeed(String minSpeed) {
		this.minSpeed = minSpeed;
	}
	 
	public abstract void eat();
	
	public abstract void run();
	 
}

// If you have abstract method in your class then the class should be abstract class