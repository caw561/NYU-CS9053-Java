package innerclasses;

// ShowInnerClass.java: Demonstrate using inner classes
public class ShowInnerClass {
  private int data=0;

  public ShowInnerClass() {
	  InnerClass instance = new InnerClass();
	  
	  instance.mi();
  }
  /** A method in the outer class */
  public void m() {
    System.out.println("data is " + data);
    
  }

  // An inner class
  class InnerClass {
    /** A method in the inner class */
    public void mi() {
      // Directly reference data and method defined in its outer class
    	// even though it's private!
      data++;
      m();
    }
  }
}