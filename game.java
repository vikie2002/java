package spell;

public class game {
	public static void main (String[] args){
	  	Fireball fb = new Fireball();
	    Repair r = new Repair();
	    Healing h = new Healing();
	    Spellbook sb = new Spellbook();
	    
	    Player me = new Player(sb);sb.addSpell(fb);
	    sb.addSpell(r);
	    sb.addSpell(h);
	  }
}
