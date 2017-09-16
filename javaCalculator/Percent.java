public class Percent implements StrategyOperation 
{
    public float operate(int a, int b) 
    {
        return ((2*a) - b)/(a+3);
    }
}
