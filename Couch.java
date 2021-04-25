package Item;

public class Couch
{
	private static int numOfPillows = 2;
	private String name;
	private float width;
	private float heigh;

	private String material;
	private String brand;
	private String color;
	private int inStock;
	private int isTransform;

	protected String couchPrint;
	protected int segments;


	public Couch(String name, float width, float heigh, int segments) {
		this.name = name;
		this.width = width;
		this.heigh = heigh;
		this.segments = segments;
	}

	public Couch(String name, float width, float heigh, int segments, String material,
				 String brand, String color, int inStock, int isTransform, String couchPrint) {
		this(name, width, heigh, segments);
		this.material = material;
		this.brand = brand;
		this.color = color;
		this.inStock = inStock;
		this.isTransform = isTransform;
		this.couchPrint = couchPrint;
	}

	public Couch() {
		numOfPillows++;
		this.name = "Default";
		this.width = 200;
		this.heigh = 50;
		this.segments = 3;
		this.material = "Default";
		this.brand = "N/A";
		this.color = "Default";
		this.inStock = 1;
		this.isTransform = 0;
		this.couchPrint = "Default";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	public float getHeigh() {
		return heigh;
	}

	public void setHeigh(float heigh) {
		this.heigh = heigh;
	}
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}
	
	public int getIsTransform() {
		return isTransform;
	}

	public void setIsTransform(int isTransform) {
		this.isTransform = isTransform;
	}
	
	public String getCouchPrint() {
		return couchPrint;
	}

	public void setCouchPrint(String couchPrint) {
		this.couchPrint = couchPrint;
	}
	
	public int getSegments() {
		return segments;
	}

	public void setSegments(int segments) {
		this.segments = segments;
	}
	
	public static int getNumOfPillows() {
		return numOfPillows;
	}

	public static void setNumOfPillows(int numOfPillows) {
		Couch.numOfPillows = numOfPillows;
	}

	@Override
	public String toString() {
		return "Couch:\nname: " + name +
				"\nwidth: " + width +
				"\nheigh: " + heigh +
				"\nmaterial: " + material +
				"\nbrand: " + brand +
				"\ncolor: " + color +
				"\navailable?: " + inStock +
				"\ncan transform?: " + isTransform +
				"\nprint: " + couchPrint +
				"\nsegments: " + segments +
				"\nnumber of pillows: " + numOfPillows + "\n\n";
	}

	 public static void printStaticNumOfPillows() {
        System.out.println("Number of pillows: " + numOfPillows);
    }

    public void printNumOfPillows() {
        System.out.println("Number of pillows: " + numOfPillows);
    }

	public void resetValues(String name, float width, float heigh, int segments, String material,
							String brand, String color, int inStock, int isTransform, String couchPrint) {
		this.name = name;
		this.width = width;
		this.heigh = heigh;
		this.segments = segments;
		this.material = material;
		this.brand = brand;
		this.color = color;
		this.inStock = inStock;
		this.isTransform = isTransform;
		this.couchPrint = couchPrint;
	}
}
