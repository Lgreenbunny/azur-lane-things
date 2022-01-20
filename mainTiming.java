package mainPack;

public class mainTiming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*plan:
 * get properties of mini timers from args
 * until a certain time is reached, keep going thru the queue of mini timers
 * can have a ton of individual mini timers at once
 * some may start later than others
 * some might stop earlier than others
 * have an option to increase or decrease the time value
 * maybe have an option to plug in seconds, minutes or hours
 * 
 * maybe make a mode where you alternate between certain timers when a timer reaches a 
 * certain value that it'll pass if it fires again
 * like with morale, switch fleets and wait for a certain minute to add a morale
 * each sortie subtracts a morale
 * stop until a certain time or all fleets are tired, make it a choice
 * 
 * default mode should be one where you can just plug in any type of mini timer
 * and it fires at certain times no matter what
 * 
 * maybe have an overloaded constructor for mini timers for different modes
 * 
 * like if you're using 1 boss fleet and 2 different mob fleets
 * 		could also just make the times not overlap each other so idk about that
 * alternating between the 2 fleets as boss and mob, 
 * 		need 2 subtract from both, different amounts
 * */
		
		/*reading+searching for mode number/letter, or GUI making later on
		 * format:
		 * 
		 * REGULAR
		 * (1) mode
		 * (s/m) forTime
		 * (ALL team morales dead (m), or time (t), type of limit for code 
		 * 		time goes up, morale go down) ^
		 * (number limit for code) ^
		 * name queueTime1 2 3... finalTime name queueTime1 2 3... finalTime name..............
		 * 1 s t 120
		 * 
		 * FLEET SWAP FARM
		 * (2, mode)
		 * (s/m ForTime) ^
		 * (type of limit for code, all morale ded, or time, time goes up, morale go down) ^
		 * (number limit for code) ^
		 * name queueTime1 2 3... finalTime name queueTime1 2 3... finalTime name..............
		 * 
		 * 
		 * should check if it's a number or not and stop putting things into that one MiniTime
		 * 
		 * after adding all the queues, 
		 * see MiniTime's comments
		 * put the MiniTimes in order based on lowest time
		 * print out the lowest time'd MiniTime and update their next time value
		 * 		based on their queue or their permanent current time interval
		 * update that time either in main or inside the MiniTime's print method
		 * 		(the one above that printed)
		 * resort the queue
		 * keep going until a limit's reached
		 * 		(check morales or check the next MiniTime's value each time)
		 * for something like a sortie for 3 fleets, possibly increment all
		 * of the fleets's time by the same amount, THEN 
		 * for the one that jsut went, add their individual time and resort the queue  
		 * cause time's gonna pass while everyone waits for the sortie, and they aren't gonna
		 * start to sortie in the middle of another fleet's sortie
		 * */
	}

}
