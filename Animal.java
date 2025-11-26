abstract class Forest{
	
	abstract  void sound();{       //its abstract method,declaration with semicolen at end.
		
	}
	
	// static void sound();{ 
		                           //-> static methods belongs to class itself ,but abstract methods are for subclass purpose so cant be static.
 //	}
}
class Dog extends Forest{
	@Override
	 void sound(){                  //here v r overriding abstract method ,so remove abstract keyword nd add definition to it .
		System.out.println("dog barks");	
	}
}
	class Animal{
	public static void main(String args[]){
		// Animal animal = new Animal();     ->  you cant create obj for abstract classes.
		Forest forest  = new Dog();
		
		forest.sound();
		

		
	}
}