
/**
 * The Balrog class implements a Tolkien style demonic nightmare.
 *
 * @author Gavin Armenti
 * @version 4/27/2026
 */
public class Balrog extends Demon
{
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;
    
    /**
     * Constructor for a Balrog.
     * Gives a strength between the minimum and maximum.
     * Gives a health value between the minimum and maximum.
     */
    public Balrog() 
    {
        super(
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR,
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP        
        );
    }
    
    /**
     * Balrogs attack twice. Duck and cover...
     * @return damage from two fisted attack.
     */
    public int attack()
    {
        return (super.attack()+super.attack());
    }
}
