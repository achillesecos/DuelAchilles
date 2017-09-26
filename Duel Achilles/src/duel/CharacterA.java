package duel;

public class CharacterA implements Dueler{
	//private String name;
	private int hp;
	private boolean isloaded;


public CharacterA() {
	isloaded = false;
}

public void taunt() {
	String taunt = "AAHHH Bring it on!";
	System.out.println(taunt);
}

public String getName() {
	return "Achilles Ecos";
}

public void setStartingHP(int hp) {
	this.hp = hp;
}

public int getHP() {

	return hp;
}

public boolean determineIfOpponentIsFair(Dueler d, int target) {
	if(d.getHP() == target) {
		return true;
	}
	else {
		return false;
	}
}

public int getAction(Object caller) {
	if(caller instanceof Duel) {
		if(isloaded == false) {
			if(Math.random() < .5) {
				isloaded = true;
				return Duel.LOADING;
			}
			else {
				return Duel.GUARDING;
			}
		}
		else{
			if(Math.random()> .5) {
			isloaded = false;
			return Duel.SHOOTING;
			}
			else {
				return Duel.GUARDING;
			}
		}
	}
	else {
		return Duel.YEAH_RIGHT;
	}
}

public void hit(Object caller) {
	if(caller instanceof Duel) {
		hp = hp - 10;
	}
}
}