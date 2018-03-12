//The equals method.
//aka "dot equals" because methods start with dots.

class Person{
	
	private int id;
	private String name;
	
	//right click-- source-- generate constructors
	public Person(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}

	//right click-- source-- generate toString()
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	//right click-- source-- generate hashcode and equals
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	//right click-- source-- generate hashcode and equals
	//this tells dot equals how to compare two objects
	//ie, it will do more than just compare the variable name
	//but will compare the substance (properties)
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	//when you build that, you'll only check the fields that matter
		
}

public class Application {

	public static void main(String[] args) {
		
		//to see if two things are equal, we can do it the following way:
		Person person1 = new Person(5, "Bob");
		Person person2 = new Person (8, "Sue");
		
		if(person1 == person2){
			System.out.println("They are the same person");
		}
		else{
			System.out.println("They are not the same person");
		}
		
		person2 = person1;
		
		if(person1 == person2){
			System.out.println("They are the same person");
		}
		else{
			System.out.println("They are not the same person");
		}
		
		//let's learn the equals method:
		
		Person person3 = new Person (2, "Terry");
		Person person4 = new Person (2, "Terry");
		
		if(person3 == person4){
			System.out.println("They are the same person");
		}
		else{
			System.out.println("They are not the same person");
		}
		//those will be NOT the same because they are two different objects (with the same properties)
		
		System.out.println(person3.equals(person4));
		//prints true/false 
		//prints false IF you didn't have the relevant code in the class (above)
		
		//we have to tell dot equals HOW to compare. How?
		//GO TO THE CLASS, then
		//right-click-- source-- generate hashtag and equals

		//examples with numbers:
		double value1 = 7.2;
		double value2 = 7.2;
			
		System.out.println(value1==value2);
		//remember that's comparing, will give true/false
		//this produces true
		
		//System.out.println(value1.equals(value2));
		
		//Double value3 = 5.6;
		//Double value4 = 5.6;
		
		//System.out.println(value3.equals(value4));
		
		int number1 = 6;
		int number2 = 6;
		
		System.out.println(number1==number2);
		
		//there's a disconnect between what we are being taught and what is happening in this code
		//ex: teacher uses "Double" not "double"
		//but Double give me an error
		//AND I get an error using dot equals with double.  :(
	
		String text1 = "hello";
		String text2 = "hellofood".substring(0,5);
			
		System.out.println(text1 == text2);
		//prints false because the objects are different
		System.out.println(text1.equals(text2));
		//prints true because its looks for whether the final product is the same
		
		//and what does the hashcode thing do?
		//gives a unique id for each object
		//the hashCode method is what creates it
		//you won't use it much but here's how to see an example:
		
		System.out.println(new Object());
		System.out.println(new Object());
		//you'll get two different ids cuz you created two new objects.
	}

}
