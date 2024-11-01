public class QueuingSystem {
    public static void main(String[] args) {
        
        CentralizedQueuingSystem queueSystem = CentralizedQueuingSystem.getInstance();

        System.out.println("Queue Number        : " + queueSystem.getNextQueueNumber()); 
        System.out.println("Next Queue Number   : " + queueSystem.getNextQueueNumber()); 
        
        System.out.println("Current Queue Number: " + queueSystem.getCurrentQueueNumber()); 

        System.out.println();
        queueSystem.resetQueueNumber(11);
        System.out.println("Queue Reset to      : " + queueSystem.getCurrentQueueNumber()); 

        System.out.println("Next Queue Number   : " + queueSystem.getNextQueueNumber()); 

    }
}
