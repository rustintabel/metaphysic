package metaphysic.mindmapping;

/**
 *
 * @author justin
 */
public class ProcessorMessageListenerAdapter implements
		ProcessorMessageListener {
	/**
     *
     * @param e
     */
    public void messageSent(ProcessorMessageEvent e) 
	{
		System.out.println(e.message);
		
	}
}
