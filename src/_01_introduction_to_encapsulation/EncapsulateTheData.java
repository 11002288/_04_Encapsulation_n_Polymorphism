package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; //can be any object type except String. Strings get turned into objects.
	 public int getItems() {
		 return this.itemsReceived;
	 }
	 public void setItems(int num) {
		 if(num<=-1) {
			 num = 0; 
			 throw new IllegalArgumentException();
		 }
		 this.itemsReceived = num;
	 }
	 public float getDegrees(){
		 return this.degreesTurned;
	 }	
	 public void setDegrees(float test) {
		 if(test>=0 && test<=360) {
			 this.degreesTurned = test;
			 throw new IllegalArgumentException();
		 }else if(test>360) {
			 this.degreesTurned = 360;
			 throw new IllegalArgumentException();
		 }else if(test<0){
			 this.degreesTurned = 0;
			 throw new IllegalArgumentException();
		 }
	 }
	 public String getClat() {
		 return this.nomenclature;
	 }
	 public void setClat(String space) {
		 if(space=="") {
			 space = " ";
		 }
		 this.nomenclature = space;
		 throw new IllegalArgumentException();
	 }
	 public Object getObj() {
		 return this.memberObj;
	 }
	 public void setObj(Object any) {
		 if (any instanceof String) {
			Object new_name = any;
		} 
		 this.memberObj = any;
		 throw new IllegalArgumentException();
		 }
	 
	public static void main(String[] args) {
		
	}
}
