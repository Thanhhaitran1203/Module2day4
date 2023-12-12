public class Fan {
    final static int slow = 1;
    final static int medium = 2;
    final static int fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan(){
        this.speed = slow;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setOn(){
        this.on = true;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getSpeed(){
        return this.speed;
    }
    public boolean getOn(){
        return this.on;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public String toString(){
        String result = "";
        if(getOn ()){
            result ="\t" + getSpeed () + getColor () + getRadius () + " fan is on";
        }else{
            result ="\t" + getColor () + getRadius () + " fan is off";
        }
        return result;
    }
}
