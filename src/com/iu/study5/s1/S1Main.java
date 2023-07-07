package com.iu.study5.s1;

public class S1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Warrior warrior1 = new Warrior();
		warrior1.getItem();
		
		
		
	
		
		Magician magician1 = new Magician();
		magician1.getItem();
		
		Character character = magician1;
		
		character = warrior1;
		
		Character [] c = new Character[2];
		c[0]=warrior1;
		c[1]=magician1;
		
		warrior1 = (Warrior)c[0];
		magician1 = (Magician)c[1];
		
		//----------------------
		Character ch1 = new Character();
//		magician1 = (magician)ch1;
		magician1.setMp(20);
	}

}
