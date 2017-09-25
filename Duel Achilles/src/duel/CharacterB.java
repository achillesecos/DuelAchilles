package duel;

public class CharacterB implements Dueler{
	private String name;
	private int hp;
}

public CharacterB() {
	
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

int getAction(object caller) {
	System.out.println("....");
	return true;
}

void hit(Object caller) {
	if()
	
	
	hp = hp - 10;
}
