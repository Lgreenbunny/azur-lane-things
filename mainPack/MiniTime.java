package mainPack;
	/*
	 * holds the firstTimes queue (first cooldowns before a constant cooldown at the end)
	 * nextTime double (the default cooldown or an absolute cooldown of another MiniTime)
	 * coolDown (default cooldown)
	 * name of the weapon/ship/skill/etc
	 * type of weapon for MiniTimeManager (plane, missile/salvo, dd/cl/ca/cb gun...)
	 * methods:
	 * addTime() adds to the nextTime
	 * toString() overrides and sends the text that's 
	 * 	written as the code output
	 * updateNextTime() to change nextTime based onn firstTimes/coolDown
	 * getNextTime() returns the nextTime
	 */

public class MiniTime {
	private double nextTime, coolDown, absCoolDown;
	private boolean empty;
	private String name, type;
	
	private double[] firstTimes;
	
	MiniTime(){//should take all of the above variables except for empty 

	}
	private boolean emptyUpdate(double[] arr){
		if (arr.length == 0) //if empty, return true
			return true;
		return false; //otherwise return false
	}
}
