package Item;

public class Main{
	public static void main(String[] args) {
			Couch defaultCouch = new Couch();
			System.out.println(defaultCouch);
			Couch legacyCouch = new Couch("New Legacy",250,75,4);
			System.out.println(legacyCouch);
			Couch masterCouch = new Couch("Couch Master",475,100,6,"leather","SomeBrand","brown",1,1,"Custom");
			System.out.println(masterCouch);
			Couch.printStaticNumOfPillows();
			defaultCouch.printNumOfPillows();
	}
}
