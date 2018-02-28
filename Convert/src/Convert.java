
public class Convert {

	private String roman;

	public Convert(String romanNumber) {
		this.roman = romanNumber;
	}
	public String getRomanNumber() {
		return this.roman;
	}
	
	public int convertNumber() {
		int number = 0;
		if(roman != null) {
		for(int i = roman.length(); i > 0; i--) {
			String test = roman.substring(i-1, i);
			String test_before = "O";
			if(i != roman.length()) {
				test_before = roman.substring(i, i+1);
			}
			
			if(test.equals("I") && (test_before.equals("V") || test_before.equals("X"))) {
				number -=1;
				continue;
			}else if(test.equals("I")) {
				number +=1;
				continue;
			}
			
			if(test.equals("V")) {
				number +=5;
				continue;
			}

			if(test.equals("X") && (test_before.equals("L") || test_before.equals("c"))) {
				number -=10;
				continue;
			}else if(test.equals("X")) {
				number +=10;
				continue;
			}
			
			if(test.equals("L")) {
				number +=50;
				continue;
			}
			
			
			if(test.equals("C") && (test_before.equals("D") || test_before.equals("M"))) {
				number -=100;
				continue;
			}else if(test.equals("C")) {
				number +=100;
				continue;
			}
			
			if(test.equals("D")) {
				number +=500;
				continue;
			}
			
			if(test.equals("M")) {
				number +=1000;
				continue;
			}
	
		}
		
		
		return number;
		}else {
			return -1;
		}
	}
	
}
