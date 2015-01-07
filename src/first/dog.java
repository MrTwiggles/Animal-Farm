package first;

public class dog {
	
	private String name;
	private int age;
	private int height;
	private int nbrLegs;
	private String bark;
	
	/** Skapar en hund med ålder age, höjd height, antal ben nbrLegs, skall som låter som bark
	 * 
	 * @param age
	 * @param height
	 * @param nbrLegs
	 * @param bark
	 */
	public dog(String name, int age, int height, int nbrLegs, String bark) {
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.nbrLegs = nbrLegs;
		this.bark = bark;
	}
	
	/** Returnar hundens ålder
	 * 
	 * @return
	 */
	public int getAge() {
		
		return this.age;
	}
	
	/** Returnar hundens höjd
	 * 
	 * @return
	 */
	public int getHeight() {
		
		return this.height;
	}
	
	/** Returnar hundens skall
	 * 
	 */
	public int getNbrLegs() {
		
		return this.nbrLegs;
	}
	
	/** Hunden skäller!
	 * 
	 */
	public void bark() {
		System.out.println(this.name + " säger: " + this.bark + "\t Blev du rädd?");
	}
	
	/** Ändrar hundens höjd
	 * 
	 */
	public void changeHeight(int height) {
		this.height = height;
		
	}
	
	/** Ändrar hundens antal ben
	 * 
	 */
	public void changeNbrLegs(int legs) {
		this.nbrLegs = legs;
	}
}
