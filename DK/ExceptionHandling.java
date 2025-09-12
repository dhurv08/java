/*Create 2 Custom Exceptions with Name Invalid AgeException and Invalid NameException
Create a class with name Student which will
     - it will have age of int type and Name as String both of private type
     - create getter and setter for both the variables
     - setter method of age will set the value in class variable only if new value ranges from 0 to 100, else it will throw AgeException
     - setter method of name will set the value in class variable only if new value is not empty, else it will throw NameException


Create a Main class with main method, 
     - call getters and setters of the Student class with valid and invalid values to test your program*/
class InvalidAgeException extends Exception{
	InvalidAgeException(String a){
		super(a);
	}
}
class InvalidNameException extends Exception{
	InvalidNameException(String b){
		super(b);
	}
}
class Student {
	private int age;
	private String name;
	
	int getAge(){
		return age;
	
	}
	void setAge(int age) throws InvalidAgeException{
		if(age>=0 && age<=100){
			this.age=age;
		}else{
			throw new InvalidAgeException("Error : Age should be between 0 and 100");
		}
	}
	
	
	String getName(){
		return name;
	}
	
	void setName(String name) throws InvalidNameException {
		if(!name.isEmpty()){
		this.name=name;
		}else{
			throw new InvalidNameException("Error : String is empty");
		}
	}
}

class ExceptionHandling{
	public static void main(String agrs[])throws Exception{
		Student obj = new Student();
		// try{
			// obj.setAge(20);
			// obj.setName("dhruv");
		// } catch(InvalidNameException e) {
			
		// }catch(Exception e) {
			
		// }finally{
			// System.out.println("out");
		// }
		
		
		
		try {
        obj.setAge(20);
		obj.setName("dhruv");
        System.out.println("Age: " + obj.getAge());
		System.out.println("Name: " + obj.getName());
		
		}catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // try {
            // // Invalid name (empty)
            // obj.setName(""); // Throws InvalidNameException
        // } catch (InvalidNameException e) {
            // System.out.println("Error: " + e.getMessage());
        // }
		
		
	}
	
}