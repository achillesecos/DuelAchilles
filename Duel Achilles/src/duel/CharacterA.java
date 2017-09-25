package duel;

public class CharacterA implements Dueler{
	private String name;
	private int hp2;
	private int rounds2 = 0;
	private boolean isloaded;
	isloaded = false;
}

public CharacterA() {
	isloaded = false;
}

public void taunt() {
	String taunt = "Are you ready";
	System.out.println(taunt);
}

public String getName() {
	name = "Achilles Ecos";
	return name;
}

public void setStartingHP(int hp) {
	System.out.println(hp);
}

public int getHP() {

	return hp2;
}

public boolean determineIfOpponentIsFair(Dueler d, int target) {
	if(d.getHP() == target) {
		return true;
	}
	else {
		return false;
	}
}

public int getAction(object caller) {
	if(caller instanceof Duel) {
		if(!isloaded) {
			if(Math.random() > .5) {
				isloaded = true;
				return 0;
			}
			else {
				return 2;
			}
			
		}
		else {
			return 3;
		}
	}
	
	
	if(rounds2 == 0) {
		rounds2++;
		return 0;
	}
	else {
		rounds2++;
		return (int)(Math.random()*3);
	}
}

public void hit(Object caller) {
	hp2 = hp2 - 10;
}
