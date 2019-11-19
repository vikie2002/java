package spell;

public class Player extends creature{
	private Spellbook sb;
	public Player (Spellbook sb) {
	this.sb =sb;	
	}
public Spellbook readSpellbook() {
	return sb;
}
}
