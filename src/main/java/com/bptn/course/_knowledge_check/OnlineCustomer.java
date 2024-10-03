package com.bptn.course._knowledge_check;

// Complete the OnlineCustomer class below to inherit from Customer
public class OnlineCustomer extends Customer // complete line

{
private String email;

	    // add constructor
public OnlineCustomer (String n, String a, String e) {
super(n,a);
this.email= e; //initailize e= email
	    
}
	    // override toString method of superclass
@Override
public String toString() {
return super.toString()  + "\nEmail: "+ this.email;

	}

}
