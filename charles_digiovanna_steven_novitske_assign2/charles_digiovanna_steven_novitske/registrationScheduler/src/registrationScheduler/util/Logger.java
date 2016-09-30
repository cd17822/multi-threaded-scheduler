package registrationScheduler.util;

public class Logger{

    public static enum DebugLevel {
        CONSTRUCTOR, THREADRUN, ADDTORESULTS, STORECONTENT, NONE
    };

    private static DebugLevel debugLevel;

	/**
	 * @return void
	 */
    public static void setDebugValue (int levelIn) {
        switch(levelIn) {
           case 4: debugLevel = DebugLevel.CONSTRUCTOR; break;
           case 3: debugLevel = DebugLevel.THREADRUN; break;
           case 2: debugLevel = DebugLevel.ADDTORESULTS; break;
           case 1: debugLevel = DebugLevel.STORECONTENT; break;
           case 0: debugLevel = DebugLevel.NONE; break;
        }
    }

	/**
	 * @return void
	 */
    public static void setDebugValue (DebugLevel levelIn) {
        debugLevel = levelIn;
    }

	/**
	 * @return void
	 */
    public static void writeMessage (String message, DebugLevel levelIn) {
        if(levelIn == debugLevel) System.out.println(message);
    }

	/**
	 * @return the debug level as a String
	 */
    public String toString() {
        return "Debug Level is " + debugLevel;
    }
}
