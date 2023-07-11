package com.fssa.creojava.day02.solved;

public class Person2 {
	private String name;  // Private data member

    public String getName() {  // Public getter method
        return name;
    }

    public void setName(String name) {  // Public setter method
       
			this.name = name; // this Keyword used for referring current instance
    }
}
