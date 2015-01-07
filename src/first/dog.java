package first;

public class dog {
	
	private String name;
	private int age;
	private int height;
	private int nbrLegs;
	private String bark;
	
	/** Skapar en hund med �lder age, h�jd height, antal ben nbrLegs, skall som l�ter som bark
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
	
	/** Returnar hundens �lder
	 * 
	 * @return
	 */
	public int getAge() {
		
		return this.age;
	}
	
	/** Returnar hundens h�jd
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
	
	/** Hunden sk�ller!
	 * 
	 */
	public void bark() {
		System.out.println(this.name + " s�ger: " + this.bark + "\t Blev du r�dd?");
	}
	
	/** �ndrar hundens h�jd
	 * 
	 */
	public void changeHeight(int height) {
		this.height = height;
		
	}
	
	/** �ndrar hundens antal ben
	 * 
	 */
	public void changeNbrLegs(int legs) {
		this.nbrLegs = legs;
	}
}
