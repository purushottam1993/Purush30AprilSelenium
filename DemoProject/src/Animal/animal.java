package Animal;

public class animal {
	String requiredBark="barking";
	String requiredRun="running";
	public void barking() {
	System.out.println("barking");
	}
	public void running() {
		System.out.println("running");
	}
	
public static void main(String[] args) {
	animal ob=new animal();
	ob.running();   //No Garbage
	ob.barking();   //No Garbage
	System.out.println("dog");  //Garbage Collection
}
}

