package ntou.cs.Java2016.rpg;

import java.util.Random;

public class Pet implements ATK
{
	int maxAttack;
	
	public Pet (int maxAttack)
	{
		if (maxAttack > 0)
		{
			this.maxAttack = maxAttack;
		}	
	}

}
