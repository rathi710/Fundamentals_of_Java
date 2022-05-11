package Assignment_01;

/*
 *  How a 100% abstract class is different from an Interface. Provide suitable code if required. 
 * we use interfaces to indicate different classes have a shared interface: that we can manipulate them or
 * use them in the same way.or we can implement multiple interfaces, but only extend one class
 * 
 * now creating  a concrete class that is class with more restrictions than interfaces will be senseless.
 */
public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//the following case of multiple inheritance can be implemented using interfaces only
interface P {
    void p();
}

interface Q {
    void q();
}       

interface R {
    void r();
}

class PQR implements P, Q, R {
    public void p() {
        System.out.println("P");
    }

    public void q() {
        System.out.println("Q");
    }

    public void r() {
        System.out.println("R");
    }
}

class A {
    public void a(P pRef) {
        pRef.p();
    }
}

class B {
    public void b(Q qRef) {
        qRef.q();
    }
}

class C {
    public void c(R rRef) {
        rRef.r();
    }
}