
/**
 * Elves are magical creatures with pointy ears.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;
    
    /**
     * Constructor for an Elf.
     * Gives a strength between the minimum and maximum.
     * Gives a health value between the minimum and maximum.
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR,
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP        
        );
    }
    
    /**
     * Elves have a 10% chance to do 2x damage.
     * @return damage with potential 2x value.
     */
    public int attack()
    {
        int tempDamage = super.attack();
        if (Randomizer.nextInt(10)==1)
        {
            tempDamage*=2;
        }
        
        return tempDamage;
    }
}