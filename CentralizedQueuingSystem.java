public class CentralizedQueuingSystem {

	    private static CentralizedQueuingSystem instance;

	    private int currentQueueNumber;

	    private CentralizedQueuingSystem() {
	        this.currentQueueNumber = 10; 
	    }

	    public static synchronized CentralizedQueuingSystem getInstance() {
	        if (instance == null) {
	            instance = new CentralizedQueuingSystem();
	        }
	        return instance;
	    }

	    public synchronized int getNextQueueNumber() {
	        return currentQueueNumber++;
	    }

	    public synchronized void resetQueueNumber(int newQueueNumber) {
	        this.currentQueueNumber = newQueueNumber;
	    }

	    public synchronized int getCurrentQueueNumber() {
	        return currentQueueNumber;
	    }
	}

