
public class ConstructionApp {

	public static void main(String[] args) 
	{
		Building b=new Building();
		b.draw();
		System.out.println(b.displayData());
		// TODO Auto-generated method stub
		
		Apartment a=new Apartment();
		a.draw();
		System.out.println(a.displayData());
		
		Mall m= new Mall();
		m.draw();
		System.out.println(m.displayData());
		
		Residential r=new Residential();
		r.draw();
		System.out.println(r.displayData());
		
		SingleFamilyHome sfh= new SingleFamilyHome();
		sfh.draw();
		System.out.println(sfh.displayData());
		
		Business bu= new Business();
		bu.draw();
		System.out.println(bu.displayData());

	}

}
