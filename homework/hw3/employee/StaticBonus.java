package ntou.cs.employee;

public class StaticBonus implements Bonus
{

	@Override
	public int getBonus (int salary)
	{
		return 10000;
	}

}
