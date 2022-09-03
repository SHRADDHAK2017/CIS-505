public class Fan {

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int mSpeed;
    private boolean mOff;
    private double mRadius;
    private String mColor;

    public Fan() {
        mSpeed = 1;
        mRadius = 5;
        mColor = "white";
    }

    public int getSpeed() {
        return mSpeed;
    }

    public void setSpeed(int speed) {
        mSpeed = speed;
    }

    public boolean isOff() {
        return mOff;
    }

    public void setOff(boolean off) {
        mOff = off;
    }

    public double getRadius() {
        return mRadius;
    }

    public void setRadius(double radius) {
        mRadius = radius;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }

    public String toString() {
        if (isOff()) 
		
		{return "The fan " + " is " + getColor() + " with a "+ " radius of " + getRadius() + " and the fan is off ";
		
        } 
		else {
		
		return "Fan speed is set to " + getSpeed() + " with a color " + getColor() + " and a radius of " + getRadius();

            
        }
    }



    public static void main(String[] args) {

        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setOff(true);
        fan1.setRadius(6.0);
        fan1.setColor("white");

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(8.0);
        fan2.setColor("blue");
        fan2.setOff(false);

        System.out.println("Fan #1: "+fan1.toString());
        System.out.println("Fan #2: "+fan2.toString());
    }
}