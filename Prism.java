public class Prism extends Rectangle{

    private double height;

    public Prism(double length, double width, double height, String name){
	super(length,width,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public String toString(){
	return "Prism" + getName() + " with length=" + getLength()
	    + ", width=" + getWidth() + ", and height=" + height;
	    
	    ;
    }
}
