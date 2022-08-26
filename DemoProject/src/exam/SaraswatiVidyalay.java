package exam;

public class SaraswatiVidyalay {
	
	int maths;
	int physics;
	int chemistry;
	public static void main(String[] args) {
		SaraswatiVidyalay avdhut = new SaraswatiVidyalay();
		avdhut.maths=70;
		avdhut.physics=80;
		avdhut.chemistry=90;
		System.out.println("marks of avdhut");
		System.out.println("Maths= "+avdhut.maths);
		System.out.println("Physics= "+avdhut.physics);
		System.out.println("Chemistry= "+avdhut.chemistry);
		System.out.println();
		
		SaraswatiVidyalay raju = new SaraswatiVidyalay();
		raju.maths=66;
		raju.physics=77;
		raju.chemistry=88;
		System.out.println("marks of raju");
		System.out.println("Maths= "+raju.maths);
		System.out.println("Physics= "+raju.physics);
		System.out.println("Chemistry= "+raju.chemistry);
		System.out.println();
		
	    SaraswatiVidyalay seema = new SaraswatiVidyalay();
	    seema.maths=77;
	    seema.physics=88;
	    seema.chemistry=99;
	    System.out.println("Marks of Seema");
	    System.out.println("Maths= "+seema.maths);
	    System.out.println("Chemistry= "+seema.chemistry);
	    System.out.println("Physics= "+seema.physics);
		
	}
		
}
