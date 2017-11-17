package ntou.cs.employee;

public class DynamicBonus implements Bonus
{

	@Override
	public int getBonus (int salary)
	{
		return (int)(salary * .1);
	}

}
