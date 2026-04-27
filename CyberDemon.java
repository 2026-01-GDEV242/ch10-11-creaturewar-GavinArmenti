
/**
 * Just a regular demon, but.. cyber?
 *
 * @author Gavin Armenti
 * @version 4/27/2026
 */
public class CyberDemon extends Demon
{
    private static final int MAX_CYBERDEMON_HP = 100;
    private static final int MIN_CYBERDEMON_HP = 25;
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_STR = 20;
    
    /**
     * Constructor for a CyberDemon.
     * Gives a strength between the minimum and maximum.
     * Gives a health value between the minimum and maximum.
     */
    public CyberDemon() 
    {
        super(
            Randomizer.nextInt(MAX_CYBERDEMON_STR-MIN_CYBERDEMON_STR)+MIN_CYBERDEMON_STR,
            Randomizer.nextInt(MAX_CYBERDEMON_HP-MIN_CYBERDEMON_HP)+MIN_CYBERDEMON_HP        
        );
    }
}