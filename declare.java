package Package01;

public class declare extends employee {

	public declare(int i, String n, String d, int sl) {
		this.id = i;
		this.name = n;
		this.dept = d;
		this.s = sl;
	}

	public void salary() {
		System.out.printf( "%s The salary is : %d" ,name,s);
	
}
	
}

