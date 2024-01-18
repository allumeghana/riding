package riding;

public class Riding {
	void robo(int a) {
		System.out.println("hello");
	}
}
	class loading extends Riding{
	void robo() {
		System.out.println ("Hi");
		}
	}
	class Overriding{
	public static void main(String[] args) {
		loading B = new loading();
		B.robo();
		B.robo(10);
		
	}
		
	}


