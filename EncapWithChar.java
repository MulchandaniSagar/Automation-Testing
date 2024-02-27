package java_Projects;

class EncapChar
{
	private char c = 's';

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}
}

public class EncapWithChar {

	public static void main(String[] args) {
		EncapChar e1 = new EncapChar();
		e1.setC('B');
		System.out.println("The Updated Char is : "+ e1.getC());

	}

}
