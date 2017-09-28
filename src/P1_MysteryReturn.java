/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 1. Your output prediction (do yourself a favor and go step by step through the code, recording the value of each variable at each method call):
  First it will calculate z = 0 x = 4 and y = 2 and return z = 4
  Then it will print "2 0"
  Then it will print "1 2 4"
  Then it will calculate z = 3 x = 6 and y = 3 and return x = 5
  Then it will print "3 3"
  Then it will print "5 2 4"
  Then it will calculate z = 1 x = 9 y = 7 and return y = 9
  Then it will print "7 1"
  Then it will print "5 9 4"
  
 
  
 */

/*
 3. Were you correct? Explain if you were not (what did you learn?)
 We were mostly correct, just did a wrong calculation in the x = mystery and got 6 instead of 5.
 
 */
public class P1_MysteryReturn {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        z = mystery( x, z, y);
        System.out.println( x + " " + y + " " + z);
        x = mystery( z, z, x);
        System.out.println( x + " " + y + " " + z);
        y = mystery( y, y, z);
        System.out.println( x + " " + y + " " + z);

    }
    
    public static int mystery( int z, int x, int y) {
        z--;
        x = 2 * y + z;
        y = x - 2;
        System.out.println(y + " " + z );
        return x;
    }

}
