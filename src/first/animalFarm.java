package first;

public class animalFarm {
	
	public static void main(String[] args) {
        
		dog allis = new dog("Allis", 9, 55, 4, "Woof");
		
		allis.changeHeight(65);
		
		System.out.println("Allis �r nu " + allis.getHeight() + " cm h�g");
		
		allis.bark();
		
    }

}