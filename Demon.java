
/**
 * A demonic creature.
 *
 * @author Gavin Armenti
 * @version 4/27/2026
 */
public class Demon extends Creature
{
    /**
     * Constructor for a Demon.
     * @param str The strength of the demon.
     * @param hp The hitpoints of the demon.
     */
    public Demon(int str, int hp)
    {
        super(str, hp);
    }
    
    /**
     * OVERRIDE attack - all demons have a 5% chance of doing additional
     * 50 points of damage.
     * @return damage from the attack
     */
    public int attack()
    {
        int tempDamage;
        tempDamage = super.attack();
        
        if (Randomizer.nextInt(20)==1)
        {
            tempDamage = tempDamage + 50; // demonic strength applied
        }
        return tempDamage;
    }
}