


// if wrong  -1
// if right number [0, 63]

/**
 * 
 * @param number - any number 
 *@param nBit- number of bit
 *@return  - value of bit with number nBit
 */
 

public class BitOperations {
	


	static public int getBitValue(long number, int nBit) {
		int res = -1;
		if (checkNbit(nBit)) {
			long mask = 1 <<nBit; 
			if((number & mask) == 0) {
				res = 0;
			} else {
				res = 1;
			}
		};

		return res;
	}
	
	private static boolean checkNbit(int nBit) {
		
		return nBit < 64 && nBit > -1;
	}
	
	
	
	
	
	

//number any  
//nBit - bit number
//value -true 1 or 0
//return number in which value of nBit bit will have a given value
	
	static public long setBitValue(long number, int nBit, boolean value) {
		long res = -1;
		if (checkNbit(nBit)) {
			if (value == true) {
			long mask = 1 << nBit; //all bits are 0 except bit with number nBit
			res = mask | number; //set value true to nBit
			} else {
			long mask = 0xffffff; //long mask = 0xffffff; //all bits are 1
			long mask2 = 1 << nBit; //all bits are 0 except bit with number nBit 
			mask = mask ^ mask2; //all bits are 1 except bit with number nBit!!
			res = mask & number;
			}
			}
		
		return res;
	}
	
	
	

//number -  any
//nBit - bit number
//value -true 1 or 0
//return number in which value of nBit bit will be replaced(old value)
	
	
	static public long revertBitValue(long number, int nBit) {
		long res = -1;
		if(checkNbit(nBit)) {
			long mask = 1 <<nBit; // creating mask, with all 0 except 1 at number nBit
			res = mask ^ number; // make XOR operation with number and mask
		}
		return res;
	}
	
	
	
	
	
	
}