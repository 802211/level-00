import javax.swing.JOptionPane;

public class votingBooth {
public static void main(String[] args) {
	
	
	String age = JOptionPane.showInputDialog("How Old are You?");
	
	
int ages = Integer.parseInt(age);
	
	
	if (ages <= 17){
		
		JOptionPane.showMessageDialog(null, "You are too young to vote. Move along!!!?");
	}
	
	else if  (ages >= 18){
		
		String vote = JOptionPane.showInputDialog("Who would you like to be the next president??? (Last Name only-Will not accept first name!!!)");
			
	if (vote .equals ("Trump")){
		
		JOptionPane.showMessageDialog(null, "Is your name Harry? I think so.");
	}
	else if (vote .equals("Clinton")){
		
		JOptionPane.showMessageDialog(null,"There is a first time for everything! First woman president!");
		
	}
	
	else {
		JOptionPane.showMessageDialog(null,"Not important. nether are you.");
		
	}
	
	
	

	}
	
	
	
	
	
	
	
}
}
