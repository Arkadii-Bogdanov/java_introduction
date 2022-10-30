


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
		
		return -1;
	}
	
	
	

//number -  any
//nBit - bit number
//value -true 1 or 0
//return number in which value of nBit bit will be replaced(old value)
	
	
	static public long revertBitValue(long number, int nBit) {
		
		return -1;
	}
	
	
	
	
	
	
}