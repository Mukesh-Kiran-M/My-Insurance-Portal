
public class PhoneTest {

	public static void main(String[] args) {
		Smartphone sp = new Smartphone();
		sp.dial((byte)123);
		sp.dial("Julia");
		sp.dial(1234567890L);
		sp.dial(1234567890L,1234567890L);
		sp.dial(24456789L,(short)(11));
		sp.dial((short)(250),24456789L);
		// TODO Auto-generated method stub

	}
}
class Phone{
}


class Smartphone extends Phone{
	void dial() {
		System.out.println("Dialing...no where");
	}
	void dial(byte b) {
		System.out.println("Dialing... "+b);
	}
	void dial(String c) {
		System.out.println("Dialing... "+c);
	}
	void dial(long mobile) {
		System.out.println("dialing mobile... "+mobile);
	}
	void dial(long mobile1,long mobile2) {
		System.out.println("dialing mobile... "+mobile1+" With conference "+mobile2);
	}
	void dial(long landLine,short stdCode) {
		System.out.println("dialing... "+stdCode+" With LandLine "+landLine);
	}
	void dial(short stdCode,long landLine) {
		System.out.println("dialing... "+landLine+" With LandLine "+stdCode);
	}
}

